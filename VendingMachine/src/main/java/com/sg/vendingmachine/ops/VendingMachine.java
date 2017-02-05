package com.sg.vendingmachine.ops;

import com.sg.vendingmachine.controller.ConsoleIO;
import com.sg.vendingmachine.controller.InventoryController;
import com.sg.vendingmachine.dto.Change;
import com.sg.vendingmachine.dto.Product;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paul Peterson
 */
public class VendingMachine {

    Random rand = new Random();
    HashMap<String, Product> beginInventory = new HashMap();
    HashMap<String, Product> endInventory = new HashMap();
    HashMap<String, Product> sales = new HashMap();
    ConsoleIO cio = new ConsoleIO();
    InventoryController ic = new InventoryController();
    Inventory i = new Inventory();
    Change change = new Change();
    String loc, fileName;
    private static final int ROW = 5;
    private static final int COLUMN = 3;
    private static final int CAPACITY = 30;
    LocalDate today = LocalDate.now();
    String temp1 = today.toString().replaceAll("-", "");
    String autoFile = temp1 + ".txt";

    /*initialize folders
    create folders for invnetory and sales files if they do not exist
     */
    public void initialize() {
        String path = "C:\\VendingMachine\\Temp\\BeginningInventory";
        makeDirectory(path);
        path = "C:\\VendingMachine\\Temp\\EndingInventory";
        makeDirectory(path);
        path = "C:\\VendingMachine\\Temp\\InventoryFiles";
        makeDirectory(path);
        path = "C:\\VendingMachine\\Temp\\Sales";
        makeDirectory(path);
    }

    private void makeDirectory(String path) {
        /*Creating directory*/
        File dirPath1 = new File(path);
        if (!dirPath1.exists()) {
            if (dirPath1.mkdir()) {
                System.out.println("Directory created successfully");
            } else {
                System.out.println("Fail to create directory");
            }
        }
    }

    /*
    Start menu
    options to access admin functions, view reports, make purchase or exit
     */
    public String start() {
        String[] options = {"admin", "reports", "exit"};
        cio.prompt("Welcome to Vending Machine\n\nTo make a purchase, enter money"
                + " at the prompt. \n\nEnter \"Admin\" to access adminstrator functions,\n"
                + "\"Reports\" to display sales reports,\n\"Exit\" to exit the "
                + "program\n");
        String option = cio.promptForString("Please enter amount:  ").toLowerCase();
        if (!Arrays.asList(options).contains(option)) {
            try {
                double p = Double.parseDouble(option);
                return option;
            } catch (NumberFormatException e) {
                option = "error";
                cio.prompt("Invalid Selection");
            }
        }
        return option;
    }

    //make purchase
    public double makePurchase(double balance) {
        boolean isValid = false;
        Product p = new Product();
        String selection = "";
        int penny = (int) (Math.round(balance * 100)) % 5;
        if (penny > 0) {
            cio.prompt(penny + " pennies returned");
        }
        balance -=  Math.round(((double) penny / 100)*100.0)/100.0;
        cio.prompt("\nCurrent Balance:  " + String.format("$%.2f", balance) + "\n\n");
        while (!isValid) {
            selection = cio.promptForString("Please enter your selection:  ").toUpperCase();
            if (endInventory.containsKey(selection)) {
                p = endInventory.get(selection);
                isValid = true;
            } else {
                cio.prompt("Invalid Selection");
            }
            if (p.getQuantity() == 0) {
                cio.prompt(selection + " is empty.  Please make another selection");
                isValid = false;
            }
        }
        while (balance < p.getPrice()) {
            String error = "The price for " + selection + " is "
                    + String.format("$%.2f", p.getPrice()) + ".";
            cio.prompt(error);
            balance += cio.promptForDoubleWithFloor("Please Deposit at Least "
                    + String.format("$%.2f", (p.getPrice() - balance)) + ":  ",
                    (p.getPrice() - balance), error);
            System.out.println("");
        }
        balance -= p.getPrice();
        p.setQuantity(p.getQuantity() - 1);
        endInventory.put(selection, p);
        balance = Math.round(balance*100.0)/100.0;

        return balance;
    }

    //return change
    public void returnChange(double balance) {
        int b = (int) (balance * 100);
        int dollar = b / 100;
        b -= dollar * 100;
        int quarter = b / 25;
        b -= quarter * 25;
        int dime = b / 10;
        b -= dime * 10;
        int nickel = b / 5;

        change = new Change(dollar, quarter, dime, nickel);
        cio.prompt(change.toString());
    }

    //close vending machine
    public void closeVendingMachine() {
        displayReports();
        String d = today.toString().replaceAll("-", "");
        String begin = "beginningInventory" + d + ".txt";
        saveVendingMachine("C:/VendingMachine/temp/BeginningInventory/", begin, beginInventory);
        String end = "endingInventory" + d + ".txt";
        saveVendingMachine("C:/VendingMachine/temp/EndingInventory/", end, endInventory);
        String salesReport = "salesReport" + d + ".txt";
        saveVendingMachine("C:/VendingMachine/temp/Sales/", salesReport, sales);
    }

    //create reports
    public void displayReports() {
        int quantity = 0;
        double revenue = 0;
        double profit = 0;
        Product s = new Product();
        cio.prompt("Vending Machine Sales Reports");
        System.out.printf("%10s%-24s%6s%8s%8s%n", " Location",
                cio.repeat(" ", 8) + "Product", "  Qty", "Revenue", "  Gross");
        cio.prompt(cio.repeat("=", 56));
        for (int r = 0; r < ROW; r++) {
            for (int c = 1; c <= COLUMN; c++) {
                loc = Character.toString((char) ('A' + r)) + c;
                int qLoc = beginInventory.get(loc).getQuantity() - endInventory.get(loc).getQuantity();
                double rLoc = beginInventory.get(loc).getPrice();
                double pLoc = beginInventory.get(loc).getPrice()
                        - beginInventory.get(loc).getUnitCost();
                System.out.printf("%10S%-24S%6s%8s%8s%n", cio.repeat(" ", 4) + loc,
                        beginInventory.get(loc).getProductName(), qLoc,
                        String.format("$%.2f", rLoc * qLoc), String.format("$%.2f", 
                                pLoc * qLoc));
                quantity += qLoc;
                revenue += rLoc * qLoc;
                profit += pLoc * qLoc;
                s = new Product(beginInventory.get(loc).getProductId(),
                        beginInventory.get(loc).getProductName(),
                        beginInventory.get(loc).getUnitCost(),
                        beginInventory.get(loc).getPrice(), qLoc);
                sales.put(loc, s);
            }
        }

        cio.prompt("\nSales Summary\n");
        cio.prompt("\tTotal Products Sold:  " + quantity);
        cio.prompt("\tGross Revenue:  " + String.format("$%.2f", revenue));
        cio.prompt("\tProduct Cost:  " + String.format("$%.2f", revenue - profit));
        cio.prompt("\tGross Profit Margin:  " + String.format("%.2f",
                (profit / revenue) * 100) + "%");
        cio.prompt("\tAverage Product Revenue:  " + String.format("$%.2f", revenue / quantity));
        cio.prompt("\tAverage Product Cost:  " + String.format("$%.2f", (revenue
                - profit) / quantity));

    }

    private void createInventory() {
        i.autoGenerateInvnetory();
    }

    /*
    Vending Machine Admin options
    call inventory management 
    auto load vending machine with options to load a file, or randomly create
        a new file
    manual load vending machine - options to load or create an inventory file
     */
    public void manageVendingMachine() {
        String title1 = "Vending Machine";
        String title2 = "Admin Menu";
        String[] mainMenu = {"Inventory Management", "Auto-Load Vending Machine",
            "Manual Load Vending Machine", "Save Vending Machine File(s)",
            "Load Vending Machine File(s)", "Exit"};
        int selection = 0;
        do {
            selection = cio.displayMenu(title1, title2, mainMenu);
            switch (selection) {
                //inventory management
                case 1:
                    ic.inventory();
                    selection = 0;
                    break;
                //Auto-Load Vending Maching
                case 2:
                    autoLoadVendingMachine();
                    selection = 0;
                    break;
                //Manual Load Vending Machine
                case 3:
                    manualLoadVendingMachine();
                    selection = 0;
                    break;
                //Save Contents
                case 4:
                    saveVendingMachine();
                    selection = 0;
                    break;
                //Load File
                case 5:
                    loadVMFile();
                    selection = 0;
                    break;
                //exit
                case 6:
                    cio.prompt("Thank you for using my Vending Machine!");
                    if (endInventory.isEmpty()) {
                        System.exit(0);
                    }
                    break;
            }
        } while (selection != mainMenu.length);
    }

    //auto load vending machine from invnetory file, random quantities
    public void autoLoadVendingMachine() {
        if (i.inventory.isEmpty()) {
            i.autoGenerateInvnetory();
            i.loadInventory("inventoryTemp.txt");
        }
        int item;
        for (int r = 0; r < ROW; r++) {
            for (int c = 1; c <= COLUMN; c++) {
                loc = Character.toString((char) ('A' + r)).concat(Integer.toString(c));
                if (i.inventory.size() < 2) {
                    item = 1;
                } else {
                    item = rand.nextInt(i.inventory.size() - 1) + 1;
                }
                Product p = i.inventory.get(item);
                int qty = rand.nextInt(CAPACITY - 10) + 10;
                if (qty > p.getQuantity()) {
                    qty = p.getQuantity();
                }
                Product tempProd = new Product(p.getProductId(), p.getProductName(),
                        p.getUnitCost(), p.getPrice(), qty);
                beginInventory.put(loc, tempProd);
                updateProductQty(tempProd, item);
            }
        }
        cio.prompt("\nVending Machine Loaded...\n");
        displayInventory(beginInventory);
        endInventory = copyInventory(beginInventory);
    }

    //manually load each slot in the vending machine
    private void manualLoadVendingMachine() {
        verifyInventory();
        for (int r = 0; r < ROW; r++) {
            for (int c = 1; c <= COLUMN; c++) {
                loc = Character.toString((char) ('A' + r)).concat(Integer.toString(c));
                i.displayResults(i.inventory, "select");
                int item = cio.promptForIntInRange("\nItem # for Location " + loc
                        + ":  ", 1, i.inventory.size(),
                        "Please Select a valid Item. ");
                Product p = i.inventory.get(item);
                int quantity = cio.promptForIntInRange("Quantity:  ", 0, p.getQuantity(),
                        "Please Select a valid Quantity. ");
                if (quantity > CAPACITY) {
                    System.out.println("The machine can only hold " + CAPACITY
                            + " Items per location.");
                    quantity = CAPACITY;
                }
                Product tempProd = new Product(beginInventory.size(), p.getProductName(),
                        p.getUnitCost(), p.getPrice(), quantity);
                beginInventory.put(loc, tempProd);
                updateProductQty(tempProd, item);
            }
        }
        endInventory = copyInventory(beginInventory);
    }

    //copy beginning to ending inventory
    private HashMap<String, Product> copyInventory(HashMap<String, Product> inventory) {
        Product e = new Product();
        for (int r = 0; r < ROW; r++) {
            for (int c = 1; c <= COLUMN; c++) {
                loc = Character.toString((char) ('A' + r)) + c;
                Product b = beginInventory.get(loc);
                e = new Product (b.getProductId(), b.getProductName(), b.getUnitCost(),
                        b.getPrice(), b.getQuantity());
                endInventory.put(loc, e);
            }
        }
        return endInventory;
    }

    public boolean hasBeginInvnetory() {
        return beginInventory.isEmpty();
    }

    //verify inventory status
    private void verifyInventory() {
        while (i.inventory.isEmpty()) {
            boolean isValid = true;
            do {
                cio.prompt("Inventory Empty\n");
                String option = cio.promptForString("Load or Create an Inventory File (L or C):  ").toUpperCase();
                switch (option) {
                    case "L":
                        i.loadInventory();
                        isValid = true;
                        break;
                    case "C":
                        ic.inventory();
                        i.loadInventory("tempInventory.txt");
                        isValid = true;
                        break;
                    default:
                        cio.prompt("Invalid selection. ");
                        isValid = false;
                }
            } while (!isValid);
        }
    }

    //update inventory qty
    private void updateProductQty(Product p, int item) {
        Product iP = i.inventory.get(item);
        if (p.getQuantity() > iP.getQuantity()) {
            iP.setQuantity(0);
        } else {
            iP.setQuantity(iP.getQuantity() - p.getQuantity());
        }
    }

    //display vending machine inventory
    private void displayInventory(HashMap<String, Product> inventory) {
        for (int r = 0; r < ROW; r++) {
            for (int c = 1; c <= COLUMN; c++) {
                loc = Character.toString((char) ('A' + r)) + c;
                cio.prompt("Item at location " + loc + ":  ");
                i.displayItem(inventory.get(loc));
            }
        }
    }

    //display vending machine
    public void displayVendingMachine() {
        String border = "*";
        int borderWidth = 2;
        int width = 80;
        int colWidth = ((width - (borderWidth * (COLUMN + 1))) / COLUMN) - 2;
        String loc;
        String price;
        System.out.println(cio.repeat(border, width));
        System.out.println(cio.repeat(border, width));
        System.out.print(cio.repeat(border, borderWidth));
        for (int j = 0; j < COLUMN; j++) {
            System.out.print(" " + cio.repeat(" ", colWidth) + " " + cio.repeat(border, borderWidth));
        }
        System.out.println("");
        for (int r = 0; r < ROW; r++) {
            System.out.print(cio.repeat(border, borderWidth));
            for (int j = 0; j < COLUMN; j++) {
                System.out.print(" " + cio.repeat(" ", colWidth) + " " + cio.repeat(border, borderWidth));
            }
            System.out.println("");
            System.out.print(cio.repeat(border, borderWidth));
            for (int c = 1; c <= COLUMN; c++) {
                loc = Character.toString((char) ('A' + r)) + c;
                Product p = endInventory.get(loc);
                String name = p.getProductName();
                int nLeft = (colWidth - name.length()) / 2;
                System.out.print(cio.repeat(" ", nLeft + 1) + name
                        + cio.repeat(" ", (colWidth - name.length() - nLeft) + 1)
                        + cio.repeat(border, borderWidth));
            }
            System.out.println("");
            System.out.print(cio.repeat(border, borderWidth));
            for (int c = 1; c <= COLUMN; c++) {
                loc = Character.toString((char) ('A' + r)) + c;
                Product p = endInventory.get(loc);
                String quantity = "Qty: " + p.getQuantity();
                int nLeft = (colWidth - quantity.length()) / 2;
                System.out.print(cio.repeat(" ", nLeft + 1) + quantity
                        + cio.repeat(" ", (colWidth - quantity.length() - nLeft) + 1)
                        + cio.repeat(border, borderWidth));
            }
            System.out.println("");
            System.out.print(cio.repeat(border, borderWidth));
            for (int c = 1; c <= COLUMN; c++) {
                loc = Character.toString((char) ('A' + r)) + c;
                Product p = endInventory.get(loc);
                if (p.getQuantity() > 0) {
                    price = String.format("$%.2f", p.getPrice());
                } else {
                    price = "$0.00";
                }
                int nLeft = (colWidth - price.length()) / 2;
                System.out.print(cio.repeat(" ", nLeft + 1) + price
                        + cio.repeat(" ", (colWidth - price.length() - nLeft) + 1)
                        + cio.repeat(border, borderWidth));
            }
            System.out.println("");
            System.out.print(cio.repeat(border, borderWidth));
            for (int c = 1; c <= COLUMN; c++) {
                loc = Character.toString((char) ('A' + r)) + c;
                int nLeft = (colWidth - loc.length()) / 2;
                System.out.print(cio.repeat(" ", nLeft + 1) + loc
                        + cio.repeat(" ", (colWidth - loc.length() - nLeft) + 1)
                        + cio.repeat(border, borderWidth));
            }
            System.out.println("");
            System.out.print(cio.repeat(border, borderWidth));
            for (int j = 0; j < COLUMN; j++) {
                System.out.print(" " + cio.repeat(" ", colWidth) + " " + cio.repeat(border, borderWidth));
            }
            System.out.println("");
        }
        System.out.print(cio.repeat(border, borderWidth));
        for (int j = 0; j < COLUMN; j++) {
            System.out.print(" " + cio.repeat(" ", colWidth) + " " + cio.repeat(border, borderWidth));
        }
        System.out.println("");
        System.out.print(cio.repeat(border, borderWidth));
        for (int j = 0; j < COLUMN; j++) {
            System.out.print(" " + cio.repeat(" ", colWidth) + " " + cio.repeat(border, borderWidth));
        }
        System.out.println("");
        System.out.println(cio.repeat(border, width));
        System.out.println(cio.repeat(border, width));
    }

    //save current vending machine inventory to a file
    private void saveVendingMachine() {
        String fileName = "";
        HashMap<String, Product> inventory = new HashMap();
        boolean isValid = false;
        while (!isValid) {
            String option = cio.promptForString("Save Beginning Inventory (B)"
                    + ", Ending Inventory (E) or All (A):  ").toUpperCase();
            switch (option) {
                case "B":
                    fileName = cio.promptForString("File Name for Beginning Inventory:  ");
                    inventory = beginInventory;
                    saveVendingMachine("C:/VendingMachine/temp/BeginningInventory/", fileName, inventory);
                    isValid = true;
                    break;
                case "E":
                    fileName = cio.promptForString("File Name for Ending Inventory:  ");
                    inventory = endInventory;
                    saveVendingMachine("C:/VendingMachine/temp/EndingInventory/", fileName, inventory);
                    isValid = true;
                    break;
                case "A":
                    fileName = cio.promptForString("File Name for Beginning Inventory:  ");
                    inventory = beginInventory;
                    saveVendingMachine("C:/VendingMachine/temp/BeginningInventory/", fileName, inventory);
                    fileName = cio.promptForString("File Name for Ending Inventory:  ");
                    inventory = endInventory;
                    saveVendingMachine("C:/VendingMachine/temp/EndingInventory/", fileName, inventory);
                    isValid = true;
                    break;
                default:
                    cio.prompt("\nInvalid Selection");
            }
        }
    }

    //save current vending machine inventory to a file
    private void saveVendingMachine(String path, String fileName, HashMap<String, Product> inventory) {
        File dirPath = new File(path);
        if (!dirPath.exists()) {
            if (dirPath.mkdirs()) {
                cio.prompt(dirPath + " Created Successfully");
            } else {
                cio.prompt(dirPath + " Not Created");
            }
        }
        try (PrintWriter out
                = new PrintWriter(new FileWriter(dirPath + "/" + fileName))) {
            for (HashMap.Entry<String, Product> entry : inventory.entrySet()) {
                out.println(encode(entry.getKey(), entry.getValue()));
            }
        } catch (IOException ex) {
            Logger.getLogger(VendingMachine.class.getName()).log(Level.SEVERE, null, ex);
        }
        fileName = fileName.substring(fileName.lastIndexOf("/") + 1);
        cio.prompt("\n" + fileName + " Saved\n");
    }

    //load a saved vending machine file
    private void loadVMFile() {
        boolean isValid = false;
        while (!isValid) {
            String option = cio.promptForString("Load Beginning Inventory (B)"
                    + ", Ending Inventory (E) or All (A):  ").toUpperCase();
            switch (option) {
                case "B":
                    loadVendingMachine("beginning");
                    cio.prompt("\nBeginning Invnetory Loaded...\n");
                    displayInventory(beginInventory);
                    isValid = true;
                    break;
                case "E":
                    loadVendingMachine("ending");
                    cio.prompt("\nEnding Invnetory Loaded...\n");
                    displayInventory(endInventory);
                    isValid = true;
                    break;
                case "A":
                    loadVendingMachine("beginning");
                    cio.prompt("\nBeginning Invnetory Loaded...\n");
                    displayInventory(beginInventory);
                    loadVendingMachine("ending");
                    cio.prompt("\nEnding Invnetory Loaded...\n");
                    displayInventory(endInventory);
                    isValid = true;
                    break;
                default:
                    cio.prompt("\nInvalid Selection");
            }

        }
        if (endInventory.isEmpty()) {
            cio.prompt("Ending inventory is empty.");
            if (cio.promptForBoolean("Load an ending inventory file (Y or N) ", "y")) {
                loadVendingMachine("ending");
            } else {
                endInventory = (HashMap<String, Product>) beginInventory.clone();
            }
        }
    }

    //load vending machine file
    private void loadVendingMachine(String inventoryType) {
        String path = "C:/VendingMachine/temp";
        if (inventoryType.equalsIgnoreCase("beginning")) {
            path += "/BeginningInventory";
        } else if (inventoryType.equalsIgnoreCase("ending")) {
            path += "/EndingingInventory";
        }
        File dirPath = new File(path);
        String fileName = "";
        File file = new File(fileName);
        String currentLine = "";
        do {
            fileName = cio.promptForString("Enter file name for " + inventoryType
                    + " inventory file:  ");
            file = new File(path + "/" + fileName);
            if (!file.exists()) {
                cio.prompt("\nInvalid File Name\n\nCurrent Files:\n");
                String[] files = dirPath.list();
                for (String fName : files) {
                    cio.prompt("\t" + fName);
                }
            }
        } while (!file.exists());
        try {
            Scanner sc = new Scanner(
                    new BufferedReader(new FileReader(path + "/" + fileName)));
            // go through the file line by line
            while (sc.hasNext()) {
                currentLine = sc.nextLine();
                decode(currentLine, inventoryType);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VendingMachine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //auto load vending machine file
    private void autoLoadInventory(String fName) {
        String currentLine = "";
        try {
            Scanner sc = new Scanner(
                    new BufferedReader(new FileReader("C:/VendingMachine/temp/BeginningInventory/" + fName)));
            // go through the file line by line
            while (sc.hasNext()) {
                currentLine = sc.nextLine();
                decode(currentLine, "beginning");
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(VendingMachine.class.getName()).log(Level.SEVERE, null, ex);
        }
        endInventory = copyInventory(beginInventory);
    }

    //encode
    private String encode(String location, Product p) {
        return location + "::" + p.getProductId() + "::" + p.getProductName()
                + "::" + p.getUnitCost() + "::" + p.getPrice() + "::" + p.getQuantity();
    }

    //decode
    private void decode(String str, String inventoryType) {
        HashMap<String, Product> temp = new HashMap();
        String[] pr = str.split("::");
        String location = pr[0];
        Product p = new Product(Integer.parseInt(pr[1]), pr[2], Double.parseDouble(pr[3]),
                Double.parseDouble(pr[4]), Integer.parseInt(pr[5]));
        if (inventoryType.equalsIgnoreCase("beginning")) {
            beginInventory.put(location, p);
        } else if (inventoryType.equalsIgnoreCase("ending")) {
            endInventory.put(location, p);
        }
    }
}

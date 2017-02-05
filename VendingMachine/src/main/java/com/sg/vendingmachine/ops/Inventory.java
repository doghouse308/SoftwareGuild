package com.sg.vendingmachine.ops;

import com.sg.vendingmachine.controller.ConsoleIO;
import com.sg.vendingmachine.dto.Product;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paul Peterson
 */
public class Inventory {

    HashMap<Integer, Product> inventory = new HashMap();
    ConsoleIO cio = new ConsoleIO();
    Random r = new Random();

    public void inventoryManager() {
        String title1 = "Vending Machine";
        String title2 = "Inventory Manager";
        String[] mainMenu = {"Add Product", "Search Product", "Edit Product", "Delete Product",
            "Save Product File", "Load Product File", "Exit"};
        boolean isSaved = false;
        int mainSelection = 0;
        while (mainSelection != mainMenu.length) {
            mainSelection = cio.displayMenu(title1, title2, mainMenu);
            switch (mainSelection) {
                //add product
                case 1:
                    addProduct();
                    mainSelection = 0;
                    break;
                //search product    
                case 2:
                    searchProduct(cio.promptForLine("Enter Item Name:  ( ? for full list) "), "view");
                    mainSelection = 0;
                    break;
                //edit product
                case 3:
                    editInventory(cio.promptForLine("Enter Item Name:  ( ? for full list) "));
                    isSaved = false;
                    mainSelection = 0;
                //delete product
                case 4:
                    deleteItem(cio.promptForLine("Enter Item Name:  ( ? for full list) "));
                    isSaved = false;
                    mainSelection = 0;
                    break;
                //save file
                case 5:
                    saveInventory(cio.promptForString("Enter Inventory File Name:  "));
                    isSaved = true;
                    mainSelection = 0;
                    break;
                //load file
                case 6:
                    loadInventory();
                    mainSelection = 0;
                    break;
                //exit
                case 7:
                    if (!isSaved) {
                        if (cio.promptForBoolean("Save before exit (Y or N) ", "y")) {
                            saveInventory(cio.promptForString("Enter Inventory File Name:  "));
                            isSaved = true;
                        }
                    }
                    break;
            }
        }
    }

    public void addProduct() {
        double cost = 0;
        double price = 0;
        int quantity = 0;
        Product temp = new Product();
        do {
            String name = cio.promptForLine("\tItem Name:  ");
            cost = cio.promptForDoubleWithFloor("\tUnit Cost:  ", 0, "Cost must be greater than 0");
            price = cio.promptForDoubleWithFloor("\tPrice:  ", 0, "Price must be greater than 0");
            if (price < cost) {
                price = verifyPrice(cost, price);
            }
            quantity = cio.promptForIntWithFloor("\tQuantity:  ", 0, "Quantity must be greater than 0");
            temp = new Product(-inventory.size() - 1, name, cost, price, quantity);
            boolean isCorrect = true;
            do {
                cio.prompt("Product Information:");
                displayItem(temp);
                isCorrect = cio.promptForBoolean("Information Correct (Y or N):  ", "y");
                if (!isCorrect) {
                    editItem(temp);
                }
            } while (!isCorrect);
            temp.setProductId(inventory.size() + 1);
            inventory.put(temp.getProductId(), temp);
        } while (cio.promptForBoolean("Add Another Item (Y or N):  ", "y"));
        saveInventory("tempInventory.txt");
    }

    //prompt if price less than cost
    private double verifyPrice(double c, double p) {

        cio.prompt("\nWARNING:  Price " + String.format("$%.2f", p)
                + " is less than Cost " + String.format("$%.2f", c));
        if (cio.promptForBoolean("Enter new price ? (Y or N):  ", "y")) {
            p = cio.promptForDoubleWithFloor("\tPrice:  ", 0, "Price must be greater than 0");
        }
        return p;
    }

    //product search
    public Product searchProduct(String name, String viewSelect) {
        Product p = new Product();
        HashMap<Integer, Product> results = new HashMap();
        int count = 1;
        if (name.equals("?")) {
            results = inventory;
        } else {
            for (HashMap.Entry<Integer, Product> entry : inventory.entrySet()) {
                if (entry.getValue().getProductName().toLowerCase().contains(name.toLowerCase())) {
                    results.put(count, entry.getValue());
                    count++;
                }
            }
        }
        cio.prompt("Search Results:");
        displayResults(results, viewSelect);
        if (viewSelect.equalsIgnoreCase("select")) {
            p = results.get(cio.promptForInt("Select Item #:  "));
        }
        return p;
    }

    //edit inventory
    public void editInventory(String name) {
        Product p = searchProduct(name, "select");
        p = editItem(p);
        inventory.put(p.getProductId(), p);
    }

    //edit item
    public Product editItem(Product p) {
        double costTemp = 0;
        double priceTemp = 0;
        int quantityTemp = 0;
        cio.prompt("Enter new information or \"Enter\" to keep value.\n");
        String name = cio.promptForLine("\tItem Name (" + p.getProductName() + "):  ");
        if (!name.equalsIgnoreCase("")) {
            p.setProductName(name);
        }
        do {
            String c = cio.promptForLine("\tUnit Cost ("
                    + String.format("$%.2f", p.getUnitCost()) + "):  ");
            if (!c.equalsIgnoreCase("")) {
                costTemp = Double.parseDouble(c);
                if (costTemp < 0) {
                    cio.prompt("Unit cost must be greater than 0");
                }
                p.setUnitCost(costTemp);
            }
        } while (costTemp < 0);

        do {
            String pr = cio.promptForLine("\tPrice ("
                    + String.format("$%.2f", p.getPrice()) + "):  ");
            if (!pr.equalsIgnoreCase("")) {
                priceTemp = Double.parseDouble(pr);
                if (priceTemp < 0) {
                    cio.prompt("Unit cost must be greater than 0");
                }
                p.setPrice(priceTemp);
            }
        } while (priceTemp < 0);

        do {
            String qty = cio.promptForLine("\tQuantity (" + p.getQuantity() + "):  ");
            if (!qty.equalsIgnoreCase("")) {
                quantityTemp = Integer.parseInt(qty);
                if (quantityTemp < 0) {
                    cio.prompt("Unit cost must be greater than 0");
                }
                p.setQuantity(quantityTemp);
            }
        } while (quantityTemp < 0);

        return p;
    }

    //auto create invnetory file
    public void autoGenerateInvnetory() {
        
        Product p = new Product();
        String[] products = {"Payday", "Milkyway", "Snickers", "Twix",
            "Three Musketeers", "Almond Joy", "Mounds", "Butterfinger",
            "Rolo", "Kit-Kat", "Reese Cups", "M & M's", "Peanut M & M's",
            "Reese Pieces", "Licorice", "Swedish Fish", "Gummy Bears", "Hershey Bar",
            "Hershey With Almonds", "Starburst", "Skittles", "Baby Ruth",
            "Take 5", "100 Grand", "Caramello", "Crunch", "Strawberry Pop Tarts",
            "Chocolate Pop Tarts", "Blueberry Pop Tarts", "Smores Pop Tarts",
            "Chocolate Cup Cakes", "Orange Cup Cakes", "Twinkies", "Ho Ho's",
            "Donnettes", "Chocolate Donnettes", "Snowballs", "Honey Buns",
            "Chocolate Zingers", "Lemon Zingers", "Ding Dongs", "Lay's potato chips",
            "Baked lays", "Barbecue Chips", "SC & Cheddar Lays", "Ruffles",
            "Kettle Corn Popchips", "Barbecue Popchips", "Sea Salt Popchips",
            "Pita Chips", "Pretzels", "Pretzel Bites", "Cracker Jacks", "Popcorn",
            "Cheese Popcorn", "Microwave Popcorn", "Cheetos", "Crunchy Cheetos",
            "Sun Garden Salsa", "Sun Harvest Cheddar", "Fritos", "Barbecue Fritos",
            "Nacho Doritos", "Cool Ranch Doritos", "Peanut Butter bars",
            "Dunkin Sticks", "Fudge Rounds", "Peppermint Lifesavers",
            "Wintogreen Lifesavers", "Fruit Lifesavers", "Butter Rum Lifesavers",
            "Spearmint gum", "Wintergreen gum", "Cheeze-It", "Wheat Thins",
            "Pizza Combos", "Cheese and Crackers", "Honey Oat Granola Bar",
            "PB Granola Bar", "Cinnamon Granola Bar", "Maple Granola Bar", "Salted Peanuts",
            "Honey Roasted Peanuts", "Salted Cashews", "Honey Roasted Cashews",
            "Roasted Almonds", "Trail Mix", "Pistachios ", "Chips Ahoy Cookies",
            "Famous Amos Cookies", "Vanilla Cream Cookies", "Nutter Butter",
            "E.L. Fudge", "Fig Newtons", "Vanilla Wafers", "Vienna Fingers",
            "Fudge Stripe Cookies", "Pecan Sandies", "Oreo Cookies", "Lorna Doone Cookies"};

        double[] price = {1.25, 1.25, 1.25, 1.25, 1.25, 1.25, 1.25, 1.25, 1.25,
            1.25, 1.25, 1.25, 1.25, 1.25, 1.25, 1.25, 1.25, 1.25, 1.25, 1.25, 1.25,
            1.25, 1.25, 1.25, 1.25, 1.25, 1.75, 1.75, 1.75, 1.75, 1.75, 1.75, 1.75,
            1.75, 1.75, 1.75, 1.75, 1.75, 1.75, 1.75, 1.75, 1.6, 1.6, 1.6, 1.6, 1.6,
            1.6, 1.6, 1.6, 1.6, 1.6, 1.6, 1.6, 1.6, 1.6, 1.6, 1.6, 1.6, 1.6, 1.6,
            1.6, 1.6, 1.6, 1.6, 1.5, 1.5, 1.5, 1, 1, 1, 1, 1, 1, 1.85, 1.85, 1.85,
            1.85, 1.85, 1.85, 1.85, 1.85, 1.85, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.85,
            1.85, 1.85, 1.85, 1.85, 1.85, 1.85, 1.85, 1.85, 1.85, 1.85, 1.85};

        for (int i = 0; i < products.length; i++){
            double cost = price[i] / (1 + ((double) (r.nextInt(20) + 20) / 100));
            int q = r.nextInt(100) + 50;
            p = new Product(inventory.size() + 1, products[i], cost, price[i], q);
            inventory.put(p.getProductId(), p);
        }
        saveInventory("inventoryTemp.txt");
    }

    //delete Item
    public void deleteItem(String name) {

        Product p = searchProduct("?", "select");
        inventory.remove(p.getProductId());

    }

    //display item
    public void displayItem(Product p) {
        System.out.printf("%20s%s%n", "Product Name:  ", p.getProductName());
        System.out.printf("%20s%s%n", "Unit Cost:  ", "$" + String.format("%.2f", p.getUnitCost()));
        System.out.printf("%20s%s%n", "Unit Price:  ", "$" + String.format("%.2f", p.getPrice()));
        System.out.printf("%20s%d%n", "Quantity:  ", p.getQuantity());
    }

    //display search results
    public void displayResults(HashMap<Integer, Product> results, String viewSelect) {
        String prompt = "";
        int count = 1;
        for (Integer key : results.keySet()) {
            if (viewSelect.equalsIgnoreCase("select")) {
                prompt = "Item # : " + count;
            } else {
                prompt = "Item Information:";
            }
            cio.prompt(prompt);
            displayItem(results.get(key));
            count++;
        }
    }

    //save Inventory
    public void saveInventory(String fileName) {
        File dirPath = new File("C:/VendingMachine/temp/InventoryFiles");
        if (!dirPath.exists()) {
            if (dirPath.mkdirs()) {
                cio.prompt(dirPath + " Created Successfully");
            } else {
                cio.prompt(dirPath + " Not Created");
            }
        }
        try (PrintWriter out
                = new PrintWriter(new FileWriter(dirPath + "/" + fileName))) {
            for (HashMap.Entry<Integer, Product> entry : inventory.entrySet()) {
                out.println(encode(entry.getValue()));
            }
        } catch (IOException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
        cio.prompt(fileName + " Saved");
    }

    //load Inventory
    public void loadInventory() {
        String path = "C:/VendingMachine/temp/InventoryFiles";
        String fileName = "";
        File dirPath = new File(path);
        File file = new File(fileName);
        String currentLine = "";
        do {
            fileName = cio.promptForString("Enter file name:  ");
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
                    new BufferedReader(new FileReader(fileName)));
            // go through the file line by line
            while (sc.hasNext()) {
                currentLine = sc.nextLine();
                Product temp = decode(currentLine);
                inventory.put(temp.getProductId(), temp);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //system call to load Inventory file
    public void loadInventory(String fileName) {
        String path = "C:/VendingMachine/temp/InventoryFiles";
        String currentLine = "";
        try {
            Scanner sc = new Scanner(
                    new BufferedReader(new FileReader(path + "/" + fileName)));
            // go through the file line by line
            while (sc.hasNext()) {
                currentLine = sc.nextLine();
                Product temp = decode(currentLine);
                inventory.put(temp.getProductId(), temp);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Inventory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //encode
    public String encode(Product p) {
        return p.getProductId() + "::" + p.getProductName() + "::" + p.getUnitCost()
                + "::" + p.getPrice() + "::" + p.getQuantity();
    }

    //decode
    public Product decode(String str) {

        String[] pr = str.split("::");
        Product p = new Product(Integer.parseInt(pr[0]), pr[1], Double.parseDouble(pr[2]),
                Double.parseDouble(pr[3]), Integer.parseInt(pr[4]));
        return p;
    }
}

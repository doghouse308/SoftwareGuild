/*
Addressbook ops layer
 */
package com.sg.addressbook.ops;

import com.sg.addressbook.controller.ConsoleIO;
import com.sg.addressbook.dto.Address;
import com.sg.addressbook.dto.Email;
import com.sg.addressbook.dto.Phone;
import com.sg.addressbook.dto.SpecialDates;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paul Peterson
 */
public class Addressbook {

    ArrayList<Address> addressBook = new ArrayList();
    ArrayList<Phone> phone = new ArrayList();
    ArrayList<Email> email = new ArrayList();
    ArrayList<SpecialDates> sdate = new ArrayList();
    ConsoleIO cio = new ConsoleIO();

    //create new addressbook entry
    public void addAddress() {
        do {
            cio.prompt("\nNew Address Book Entry\n");
            String firstName = cio.promptForLine("\tFirst Name:  ");
            String lastName = cio.promptForLine("\tLast Name:  ");
            String houseNumber = cio.promptForLine("\tHouse Number:  ");
            String streetName = cio.promptForLine("\tStreet Name:  ");
            String streetType = cio.promptForString("\tStreet Type (Rd, St, Ave, etc):  ");
            String city = cio.promptForLine("\tCity:  ");
            String state = cio.promptForLine("\tState:  ");
            String zipCode = cio.promptForString("\tZip Code:  ");
            if (cio.promptForBoolean("Add Phone Number? (Y or N) ", "y")) {
                phone = addPhone();
            } else {
                phone = new ArrayList();
            }
            if (cio.promptForBoolean("Add Email Address? (Y or N) ", "y")) {
                email = addEmail();
            } else {
                email = new ArrayList();
            }
            if (cio.promptForBoolean("Add Special Date? (Y or N) ", "y")) {
                sdate = addDate();
            } else {
                sdate = new ArrayList();
            }
            int addressId = addressBook.size() + 1;
            Address tempAddress = new Address(addressId, false, firstName, lastName,
                    houseNumber, streetName, streetType, city, state, zipCode, phone,
                    email, sdate);
            cio.prompt("\nVerify Entry\n");
            displayAddress(tempAddress, "full");
            if (cio.promptForBoolean("\nInformation Correct? (Y or N) ", "y")) {
                addressBook.add(tempAddress);
            } else {
                do {
                    editAddress(tempAddress);
                    displayAddress(tempAddress, "full");
                } while (!cio.promptForBoolean("Information correct? (Y or N) ", "y"));
                addressBook.add(tempAddress);
            }
        } while (cio.promptForBoolean("\nEnter another address? (Y or N) ", "y"));
    }

    //add phone number list
    public ArrayList<Phone> addPhone() {
        ArrayList<Phone> temp = new ArrayList();
        cio.prompt("Add Phone Number:");
        do {
            String phoneType = cio.promptForLine("\tPhone Type:  ");
            String phoneNumber = cio.promptForString("\tPhone Number:  ");
            Phone tempPhone = new Phone(phoneType, phoneNumber);
            temp.add(tempPhone);
        } while (cio.promptForBoolean("\nEnter another phone number? (Y or N) ", "y"));

        return temp;
    }

    //add email addresses
    public ArrayList<Email> addEmail() {
        ArrayList<Email> temp = new ArrayList();
        do {
            String emailType = cio.promptForLine("\tEmail Type:  ");
            String emailNumber = cio.promptForString("\tEmail Address:  ");
            Email tempEmail = new Email(emailType, emailNumber);
            temp.add(tempEmail);
        } while (cio.promptForBoolean("\nEnter another email address? (Y or N) ", "y"));
        return temp;
    }

    //add special Dates
    public ArrayList<SpecialDates> addDate() {
        ArrayList<SpecialDates> temp = new ArrayList();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        do {
            String dateDescription = cio.promptForLine("\tDate Description:  ");
            LocalDate date = cio.promptForLocalDate("\tDate (mm/dd/yyyy):  ");
            String comment = cio.promptForLine("\tComment:  ");
            comment += cio.promptForLine("\tComment:  ");
            SpecialDates tempDate = new SpecialDates(dateDescription, date, comment);
            temp.add(tempDate);
        } while (cio.promptForBoolean("\nEnter another date? (Y or N) ", "y"));
        return temp;
    }

    //select address from search results
    public Address selectAddress(HashMap<Integer, Address> results, int num) {
        return results.get(num);
    }

    // add to address
    public void addToAddress(String c, Address a) {
        Address temp = new Address();
        for (Address search : addressBook) {
            if (search.getAddressId() == a.getAddressId()) {
                temp = search;
            }
        }
        switch (c) {
            case "phone":
                ArrayList<Phone> tempPhone = addPhone();
                for (Phone p : a.getPhone()) {
                    tempPhone.add(p);
                }
                temp.setPhone(tempPhone);
                break;
            case "email":
                ArrayList<Email> tempEmail = addEmail();
                for (Email e : a.getEmail()) {
                    tempEmail.add(e);
                }
                temp.setEmail(tempEmail);
                break;
            case "dates":
                ArrayList<SpecialDates> tempSpecialDates = addDate();
                for (SpecialDates d : a.getDate()) {
                    tempSpecialDates.add(d);
                }
                temp.setDate(tempSpecialDates);
                break;

        }
    }

    public boolean containsAddress(String lastName) {
        for (Address a : addressBook) {
            if (a.getLastName().toLowerCase().contains(lastName.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    //retrieve address book 
    public Address searchAddress(String lastName, String viewSelect) {
        Address address = new Address();
        HashMap<Integer, Address> temp = new HashMap();
        if (lastName.equals(" ")) {
            for (Address a : addressBook) {
                if (!a.isArchive()) {
                    temp.put(temp.size() + 1, a);
                }
            }
        } else {
            for (Address a : addressBook) {
                if (a.getLastName().toLowerCase().contains(lastName.toLowerCase())
                        && !a.isArchive()) {
                    temp.put(temp.size() + 1, a);
                }
            }
        }
        return temp.get(displaySearch(viewSelect, temp));
    }

    //number of active records 
    public int displayAddressbookSize() {
        int archive = 0;
        for (Address a : addressBook) {
            if (a.isArchive()) {
                archive++;
            }
        }
        return (addressBook.size() - archive);
    }

    //display all entries
    public void displayAllAddresses(String type) {
        if (type.equalsIgnoreCase("nameOnly")) {
            for (Address a : addressBook) {
                displayAddress(a, "nameOnly");
            }
        } else {
            for (Address a : addressBook) {
                displayAddress(a, "full");
            }
        }
    }

    //search type
    public String searchType(String type) {
        if (type.equalsIgnoreCase("name")) {
            return "nameOnly";
        } else {
            return "full";
        }
    }

    //display search results
    public int displaySearch(String parameter, HashMap<Integer, Address> searchResults) {
        if (parameter.equalsIgnoreCase("view")) {
            for (Address a : searchResults.values()) {
                displayAddress(a, "nameOnly");
            }
            return 0;
        } else {
            for (Map.Entry<Integer, Address> entry : searchResults.entrySet()) {
                cio.prompt("Address #" + entry.getKey());
                displayAddress(entry.getValue(), "full");
            }
        }
        return cio.promptForIntInRange("Senect Address Number: ", 1, searchResults.size(), " ");
    }

    //disaplay address
    public void displayAddress(Address address, String type) {
        if (type.equalsIgnoreCase("nameOnly")) {
            cio.prompt("\t" + address.getFirstName() + " " + address.getLastName());
        } else {
            SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
            cio.prompt("Address Details:\n");
            cio.prompt("\t" + address.getFirstName() + " " + address.getLastName());
            cio.prompt("\t" + address.getHouseNumber() + " " + address.getStreetName()
                    + " " + address.getStreetType());
            cio.prompt("\t" + address.getCity() + " " + address.getState()
                    + " " + address.getZipCode());
            if (!address.getPhone().isEmpty()) {
                cio.prompt("\nPhone Numbers:\n");
                for (Phone p : address.getPhone()) {
                    cio.prompt("\t" + p.getPhoneType() + ":  " + p.getPhoneNumber());
                }
            }
            if (!address.getEmail().isEmpty()) {
                cio.prompt("\nEmail Addresses:\n");
                for (Email e : address.getEmail()) {
                    cio.prompt("\t" + e.getEmailType() + ":  " + e.getEmailAddress());
                }
            }
            if (!address.getDate().isEmpty()) {
                cio.prompt("\nSpecial Dates:\n");
                for (SpecialDates d : address.getDate()) {
                    cio.prompt("\t" + d.getDateDescription() + ":  " + formatter.format(d.getDate()) + " "
                            + d.getComment());
                }
            }
        }
    }

    //edit address
    public void editAddress(Address address) {
        ArrayList<Phone> tempPhone = address.getPhone();
        ArrayList<Email> tempEmail = address.getEmail();
        ArrayList<SpecialDates> tempDate = address.getDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        if (cio.promptForBoolean("Edit Address Information (Y or N):  ", "y")) {
            cio.prompt("Enter new value or \"Enter\" to keep original");
            String firstName = cio.promptForLine("\tFirst Name ("
                    + address.getFirstName() + "):  ");
            if (!firstName.equalsIgnoreCase("")) {
                address.setFirstName(firstName);
            }
            String lastName = cio.promptForLine("\tLast Name ("
                    + address.getLastName() + "):  ");
            if (!lastName.equalsIgnoreCase("")) {
                address.setLastName(lastName);
            }
            String houseNumber = cio.promptForLine("\tHouse Number ("
                    + address.getHouseNumber() + "):  ");
            if (!houseNumber.equalsIgnoreCase("")) {
                address.setHouseNumber(houseNumber);
            }
            String streetName = cio.promptForLine("\tStreet Name ("
                    + address.getStreetName() + "):  ");
            if (!streetName.equalsIgnoreCase("")) {
                address.setStreetName(streetName);
            }
            String streetType = cio.promptForLine("\tStreet Type ("
                    + address.getStreetType() + "):  ");
            if (!streetType.equalsIgnoreCase("")) {
                address.setStreetType(streetType);
            }
            String city = cio.promptForLine("\tCity (" + address.getCity() + "):  ");
            if (!city.equalsIgnoreCase("")) {
                address.setCity(city);
            }
            String state = cio.promptForLine("\tState (" + address.getState() + "):  ");
            if (!state.equalsIgnoreCase("")) {
                address.setState(state);
            }
            String zipCode = cio.promptForLine("\tZip Code ("
                    + address.getZipCode() + "):  ");
            if (!zipCode.equalsIgnoreCase("")) {
                address.setZipCode(zipCode);
            }
        }
        if (!tempPhone.isEmpty()) {
            if (cio.promptForBoolean("Edit a Phone Number (Y or N):  ", "y")) {
                for (Phone p : tempPhone) {
                    String phoneType = cio.promptForLine("\tPhone Type ("
                            + p.getPhoneType() + "):  ");
                    if (!phoneType.equalsIgnoreCase("")) {
                        p.setPhoneType(phoneType);
                    }
                    String phoneNumber = cio.promptForLine("\tPhone Number ("
                            + p.getPhoneNumber() + "):  ");
                    if (!phoneNumber.equalsIgnoreCase("")) {
                        p.setPhoneNumber(phoneNumber);
                    }
                }
                address.setPhone(tempPhone);
            }
        }
        if (!tempEmail.isEmpty()) {
            if (cio.promptForBoolean("Edit an Email Address (Y or N):  ", "y")) {
                for (Email e : tempEmail) {
                    String emailType = cio.promptForLine("\tPhone Type ("
                            + e.getEmailType() + "):  ");
                    if (!emailType.equalsIgnoreCase("")) {
                        e.setEmailType(emailType);
                    }
                    String email = cio.promptForLine("\tPhone Number ("
                            + e.getEmailAddress() + "):  ");
                    if (!email.equalsIgnoreCase("")) {
                        e.setEmailAddress(email);
                    }
                }
                address.setEmail(tempEmail);
            }
        }
        if (!tempDate.isEmpty()) {
            if (cio.promptForBoolean("Edit a Special Date (Y or N):  ", "y")) {
                for (SpecialDates d : tempDate) {
                    String dateDescription = cio.promptForLine("\tDate Description ("
                            + d.getDateDescription() + "):  ");
                    if (!dateDescription.equalsIgnoreCase("")) {
                        d.setDateDescription(dateDescription);
                    }
                    String date = cio.promptForLine("\tDate (mm/dd/yyyy) ("
                            + formatter.format(d.getDate()) + "):  ");
                    if (!date.equals("")) {
                        String[] tDate = date.split("/");
                        d.setDate(LocalDate.parse(tDate[0] + "/" + tDate[1] + "/"
                                + tDate[2], formatter));
                    }
                    String comment = cio.promptForLine("\tComment ("
                            + d.getComment() + "):  ");
                    if (!comment.equalsIgnoreCase("")) {
                        d.setComment(comment);
                    }
                }
                address.setDate(tempDate);
            }
        }
    }

    //delete address
    public void deleteAddress(Address address) {
        ArrayList<Phone> tempPhone = address.getPhone();
        ArrayList<Email> tempEmail = address.getEmail();
        ArrayList<SpecialDates> tempDate = address.getDate();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        if (cio.promptForBoolean("Delete Entire Record (Y or N):  ", "y")) {
            address.setArchive(true);
            cio.prompt("Address for " + address.getFirstName() + " "
                    + address.getLastName() + " archived");
            return;
        }
        if (cio.promptForBoolean("Delete a Phone Number (Y or N):  ", "y")) {
            for (Phone p : tempPhone) {
                cio.prompt(p.getPhoneType() + " " + p.getPhoneNumber());
                if (cio.promptForBoolean("Delete Phone Number (Y or N):  ", "y")) {
                    tempPhone.remove(p);
                    address.setPhone(tempPhone);
                }
            }
        }
        if (cio.promptForBoolean("Delete an Email Address (Y or N):  ", "y")) {
            for (Email e : tempEmail) {
                cio.prompt(e.getEmailType() + " " + e.getEmailAddress());
                if (cio.promptForBoolean("Delete Email Address(Y or N):  ", "y")) {
                    tempEmail.remove(e);
                    address.setEmail(tempEmail);
                }
            }
        }
        if (cio.promptForBoolean("Delete a Special Date (Y or N):  ", "y")) {
            for (SpecialDates d : tempDate) {
                cio.prompt(d.getDateDescription() + " " + d.getDate());
                if (cio.promptForBoolean("Delete Date (Y or N):  ", "y")) {
                    tempDate.remove(d);
                    address.setDate(tempDate);
                }
            }
        }
    }

    //restore address
    public void restoreAddress() {
        if (cio.promptForString("Enter last Name or ? for full list of archived records").equals("?")) {
            for (Address a : addressBook) {
                if (a.isArchive()) {
                    displayAddress(a, "nameOnly");
                    if (cio.promptForBoolean("Restore Address?  ", "y")) {
                        a.setArchive(false);
                        cio.prompt("Address for " + a.getFirstName() + " "
                                + a.getLastName() + " restored");
                    }
                }
            }
        } else {
            Address address = searchAddress(cio.promptForString("Search for Last Name:  "), "select");
            if (cio.promptForBoolean("Restore Address?  ", "y")) {
                address.setArchive(false);
                cio.prompt("Address for " + address.getFirstName() + " "
                        + address.getLastName() + " restored");
            }
        }
    }

    //save addressbook
    public void saveAddressbook() {

        String fileName = cio.promptForString("Enter file name to save data:  ");
        try (PrintWriter out = new PrintWriter(new FileWriter(fileName))) {
            for (Address a : addressBook) {
                out.println(encode(a));
            }
            out.flush();
            System.out.println("Data Saved");
        } catch (IOException ex) {
            Logger.getLogger(Addressbook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //open addressbook
    public void openAddressbook() {
        String action = "";
        ArrayList<Address> tempAB = new ArrayList();
        if (!addressBook.isEmpty()) {
            action = cio.promptForString("Address Book contains data. \n "
                    + "Merge with new file, Save or Overwrite? ( M, S or O ):  ");
            switch (action.toLowerCase()) {
                case "s":
                    saveAddressbook();
                    addressBook.clear();
                    break;
                case "o":
                    addressBook.clear();
                    break;
                case "m":
                    tempAB = (ArrayList<Address>) addressBook.clone();
                    addressBook.clear();
                    break;
            }
        }
        String fileName = "";
        File file = new File(fileName);
        String currentLine = "";
        do {
            fileName = cio.promptForString("Enter file name:  ");
            file = new File(fileName);
            if (!file.exists()) {
                System.out.println("invalid file name");
            }
        } while (!file.exists());

        try {
            Scanner sc = new Scanner(
                    new BufferedReader(new FileReader(fileName)));
            // go through the file line by line
            while (sc.hasNext()) {
                currentLine = sc.nextLine();
                addressBook.add(decode(currentLine));
            }
            if (!tempAB.isEmpty()) {
                for (Address a : tempAB) {
                    a.setAddressId(addressBook.size() + 1);
                    addressBook.add(a);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Addressbook.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //encode address
    public String encode(Address a) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String r = "";
        r = a.getAddressId() + "::" + a.isArchive() + "::" + a.getFirstName()
                + "::" + a.getLastName() + "::" + a.getHouseNumber()
                + "::" + a.getStreetName() + "::" + a.getStreetType() + "::"
                + a.getCity() + "::" + a.getState() + "::" + a.getZipCode() + ":c:";
        if (a.getPhone().isEmpty()) {
            r += ":r:" + ":c:";
        } else {
            for (Phone p : a.getPhone()) {
                String type = p.getPhoneType();
                if (p.getPhoneNumber().isEmpty()) {
                    type = " ";
                }
                String number = p.getPhoneNumber();
                if (number.isEmpty()) {
                    number = " ";
                }
                r += type + "::" + number + ":r:";
            }
            r += ":c:";
        }
        if (a.getEmail().isEmpty()) {
            r += ":r:" + ":c:";
        } else {
            for (Email e : a.getEmail()) {
                String type = e.getEmailType();
                if (e.getEmailType().isEmpty()) {
                    type = " ";
                }
                String add = e.getEmailAddress();
                if (add.isEmpty()) {
                    add = " ";
                }
                r += type + "::" + add + ":r:";
            }
            r += ":c:";
        }
        if (a.getDate().isEmpty()) {
            r += ":r:" + ":c:";
        } else {
            for (SpecialDates d : a.getDate()) {
                String desc = d.getDateDescription();
                if (desc.isEmpty()) {
                    desc = " ";
                }
                String date = d.getDate().format(formatter);
                if (date.isEmpty()) {
                    date = " ";
                }
                r += desc + "::" + date + "::" + d.getComment() + ":r:";
            }

        }
        return r;
    }

    //decode line to create new Address object
    public Address decode(String str) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        Address a;
        ArrayList<Phone> pl = new ArrayList();
        Phone phone;
        ArrayList<Email> el = new ArrayList();
        Email email;
        ArrayList<SpecialDates> dl = new ArrayList();
        SpecialDates date;
        String comment = "";
        String[] temp = str.split(":c:");
        String[] aTemp = temp[0].split("::");
        if (temp.length > 1) {
            String[] pTemp = temp[1].split(":r:");
            if (pTemp.length < 1) {
                pl = new ArrayList();
            } else {
                for (String s : pTemp) {
                    String[] ph = s.split("::");
                    phone = new Phone(ph[0], ph[1]);
                    pl.add(phone);
                }
            }
            String[] eTemp = temp[2].split(":r:");
            if (eTemp.length < 1) {
                el = new ArrayList();
            } else {
                for (String s : eTemp) {
                    String[] em = s.split("::");
                    email = new Email(em[0], em[1]);
                    el.add(email);
                }
            }
            String[] dTemp = temp[3].split(":r:");
            if (dTemp.length < 1) {
                dl = new ArrayList();
            } else {
                for (String s : dTemp) {
                    String[] da = s.split("::");
                    String[] dt = da[1].split("/");
                    if (da.length == 2) {
                        comment = "";
                    } else {
                        comment = da[2];
                    }
                    date = new SpecialDates(da[0],
                            LocalDate.parse(dt[0] + "/" + dt[1] + "/" + dt[2], formatter), comment);
                    dl.add(date);
                }
            }
        }
        a = new Address(Integer.parseInt(aTemp[0]), Boolean.parseBoolean(aTemp[1]),
                aTemp[2], aTemp[3], aTemp[4], aTemp[5], aTemp[6], aTemp[7],
                aTemp[8], aTemp[9], pl, el, dl);
        return a;
    }
}

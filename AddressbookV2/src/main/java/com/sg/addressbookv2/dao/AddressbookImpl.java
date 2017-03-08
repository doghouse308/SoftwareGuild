package com.sg.addressbookv2.dao;

import com.sg.addressbookv2.ConsoleIO;
import com.sg.addressbookv2.dto.Address;
import com.sg.addressbookv2.dto.Email;
import com.sg.addressbookv2.dto.Phone;
import com.sg.addressbookv2.dto.SpecialDates;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author Paul Peterson
 */
public class AddressbookImpl implements AddressbookInterface {

    ConsoleIO cio = new ConsoleIO();
    List<Address> addressBook = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    Supplier addPhone = () -> {
        String phoneType = cio.promptForLine("\tPhone Type:  ");
        String phoneNumber = cio.promptForLine("\tPhone Number:  ");
        Phone r = new Phone(phoneType, phoneNumber);
        return r;
    };
    Supplier addEmail = () -> {
        String emailType = cio.promptForLine("\tEmail Type:  ");
        String emailAddress = cio.promptForLine("\tEmail Address:  ");
        Email r = new Email(emailType, emailAddress);
        return r;
    };
    Supplier addDate = () -> {
        String dateDescription = cio.promptForLine("\tDate Description:  ");
        LocalDate date = cio.promptForLocalDate("\tDate:  ");
        String comment = cio.promptForLine("\tComment:  ");
        SpecialDates r = new SpecialDates(dateDescription, date, comment);
        return r;
    };
    Consumer<Phone> editPhone = (Phone p) -> {
        String phoneType = cio.promptForLine("\tPhone Type ("
                + p.getPhoneType() + "):  ");
        if (!phoneType.isEmpty()) {
            p.setPhoneType(phoneType);
        }
        String phoneNumber = cio.promptForLine("\tPhone Number ("
                + p.getPhoneNumber() + "):  ");
        if (!phoneNumber.isEmpty()) {
            p.setPhoneNumber(phoneNumber);
        }
    };
    Consumer<Email> editEmail = (Email e) -> {
        String emailType = cio.promptForLine("\tEmail Type ("
                + e.getEmailType() + "):  ");
        if (!emailType.isEmpty()) {
            e.setEmailType(emailType);
        }
        String emailAddress = cio.promptForLine("\tEmail Address ("
                + e.getEmailAddress() + "):  ");
        if (!emailAddress.isEmpty()) {
            e.setEmailAddress(emailAddress);
        }
    };

    Consumer<SpecialDates> editDates = (SpecialDates d) -> {
        String description = cio.promptForLine("\tDate Description ("
                + d.getDateDescription() + "):  ");
        if (!description.isEmpty()) {
            d.setDateDescription(description);
        }
        String date = cio.promptForString("\tDate ("
                + formatter.format(d.getDate()) + "):  ");
        if (!date.isEmpty()) {
            d.setDate(LocalDate.parse(date, formatter));
        }
        String comment = cio.promptForLine("\tComment (" + d.getComment()
                + "):  ");
        if (!comment.isEmpty()) {
            d.setComment(comment);
        }
    };

    @Override
    public void createAddress() {
        ArrayList<Phone> phone = new ArrayList<>();
        ArrayList<Email> email = new ArrayList<>();
        ArrayList<SpecialDates> specialDates = new ArrayList<>();

        while (cio.promptForBoolean("Enter a New Address? (Y or N):  ", "y")) {
            String firstName = cio.promptForLine("\tFirst Name:  ");
            String lastName = cio.promptForLine("\tLast Name:  ");
            String companyName = cio.promptForLine("\tCompany Name:  ");
            String houseNumber = cio.promptForLine("\tHouse Number:  ");
            String streetName = cio.promptForLine("\tStreet name:  ");
            String streetType = cio.promptForLine("\tStreet Type:  ");
            String addressLine2 = cio.promptForLine("\tAddress Line 2:  ");
            String city = cio.promptForLine("\tCity:  ");
            String state = cio.promptForLine("\tState:  ");
            String zipCode = cio.promptForString("\tPostal Code:  ");
            while (cio.promptForBoolean("Add Phone Number? (Y or N):  ", "y")) {
                Phone phoneNum = (Phone) addPhone.get();
                phone.add(phoneNum);
            }
            while (cio.promptForBoolean("Add Email Address? (Y or N):  ", "y")) {
                Email emAddress = (Email) addEmail.get();
                email.add(emAddress);
            }
            while (cio.promptForBoolean("Enter Special Date? (Y or N):  ", "y")) {
                SpecialDates sDate = (SpecialDates) addDate.get();
                specialDates.add(sDate);
            }
            LocalDate dateCreated = LocalDate.now();
            LocalDate dateModified = LocalDate.now();
            Address tempAddress = new Address(-1, false, firstName, lastName,
                    companyName, houseNumber, streetName, streetType, addressLine2, city,
                    state, zipCode, phone, email, specialDates, dateCreated, dateModified);
            addressBook.add(tempAddress);
            boolean isCorrect = false;
            while (!isCorrect) {
                displayAddress(tempAddress);
                isCorrect = cio.promptForBoolean("\nInformation Correct? (Y or N):  ", "y");
                if (!isCorrect) {
                    tempAddress = editAddress(tempAddress);
                }
            }
            Address entry = tempAddress;
            addressBook.remove(tempAddress);
            entry.setAddressId(addressBook.size() + 1);
            addressBook.add(entry);
        }
    }

    @Override
    public Address editAddress(Address address) {
        cio.prompt("Edit address\n");
        cio.prompt("Enter new information or press 'Enter' to keep current information.\n");
        ArrayList<Phone> tempPhone = address.getPhone();
        ArrayList<Email> tempEmail = address.getEmail();
        ArrayList<SpecialDates> tempDates = address.getDate();
        String firstName = cio.promptForLine("\tFirst Name (" + address.getFirstName()
                + "):  ");
        if (!firstName.isEmpty()) {
            address.setFirstName(firstName);
        }
        String lastName = cio.promptForLine("\tLast Name (" + address.getLastName()
                + "):  ");
        if (!lastName.isEmpty()) {
            address.setLastName(firstName);
        }
        String company = cio.promptForLine("\tCompany (" + address.getCompanyName()
                + "):  ");
        if (!company.isEmpty()) {
            address.setCompanyName(company);
        }
        String houseNumber = cio.promptForLine("\tHouse Number ("
                + address.getHouseNumber() + "):  ");
        if (!houseNumber.isEmpty()) {
            address.setHouseNumber(houseNumber);
        }
        String streetName = cio.promptForLine("\tStreet Name ("
                + address.getStreetName() + "):  ");
        if (!streetName.isEmpty()) {
            address.setStreetName(streetName);
        }
        String addressLine2 = cio.promptForLine("\tAddress Line 2 ("
                + address.getAddressLine2() + "):  ");
        if (!addressLine2.isEmpty()) {
            address.setAddressLine2(addressLine2);
        }
        String city = cio.promptForLine("\tCity (" + address.getCity() + "):  ");
        if (!city.isEmpty()) {
            address.setCity(city);
        }
        String state = cio.promptForLine("\tState (" + address.getState() + "):  ");
        if (!state.isEmpty()) {
            address.setState(state);
        }
        String zipCode = cio.promptForLine("\tPostal Code (" + address.getZipCode() + "):  ");
        if (!zipCode.isEmpty()) {
            address.setZipCode(zipCode);
        }
        if (!address.getPhone().isEmpty()) {
            if (cio.promptForBoolean("Edit Phone Number Information (Y or N)  ", "y")) {
                tempPhone.stream().forEach((p) -> {
                    editPhone.accept(p);
                });
            }
        }
        if (!address.getEmail().isEmpty()) {
            if (cio.promptForBoolean("Edit Email Information?  (Y or N)  ", "y")) {
                tempEmail.stream().forEach((e) -> {
                    editEmail.accept(e);
                });
            }
        }
        if (!address.getDate().isEmpty()) {
            if (cio.promptForBoolean("Edit Special Dates Information (Y or N)  ", "y")) {
                tempDates.stream().forEach((d) -> {
                    editDates.accept(d);
                });
            }
        }
        address.setDateModified(LocalDate.now());
        return address;
    }

    public Address search(String searchType) {
        List<Address> results = new ArrayList<>();
        String title1 = "Address Book";
        String searchMenuTitle = "Search Menu";
        String[] searchMenuItems = {"Search by Last Name", "Search by Company",
            "Search by City", "Search by State", "Search by Zip Code"};
        int selection = cio.displayMenu(title1, searchMenuTitle, searchMenuItems);
        switch (selection) {
            case 1:
                String lastName = cio.promptForLine("Last Name:  ").toLowerCase();
                Predicate<Address> searchByLastName = a
                        -> a.getLastName().toLowerCase().contains(lastName);
                results = (List<Address>) searchAddress(searchByLastName).stream()
                        .sorted((a1, a2) -> a1.getLastName().compareToIgnoreCase(a2.getLastName()));
                break;
            case 2:
                String company = cio.promptForLine("Company Name:  ").toLowerCase();
                Predicate<Address> searchByCompany = a
                        -> a.getLastName().toLowerCase().contains(company);
                results = (List<Address>) searchAddress(searchByCompany).stream()
                        .sorted((a1, a2) -> a1.getCompanyName().compareToIgnoreCase(a2.getCompanyName()));
                break;
            case 3:
                String city = cio.promptForLine("City:  ").toLowerCase();
                Predicate<Address> searchByCity = a
                        -> a.getLastName().toLowerCase().contains(city);
                results = (List<Address>) searchAddress(searchByCity).stream()
                        .sorted((a1, a2) -> a1.getCity().compareToIgnoreCase(a2.getCity()));
                break;
            case 4:
                String state = cio.promptForLine("State:  ").toLowerCase();
                Predicate<Address> searchByState = a -> a.getState().equalsIgnoreCase(state);
                results = (List<Address>) searchAddress(searchByState).stream()
                        .sorted((a1, a2) -> a1.getState().compareToIgnoreCase(a2.getState()));
                break;
            case 5:
                String zipCode = cio.promptForLine("City:  ").toLowerCase();
                Predicate<Address> searchByZipCode = a -> a.getZipCode().equals(zipCode);
                results = (List<Address>) searchAddress(searchByZipCode).stream()
                        .sorted((a1, a2) -> a1.getZipCode().compareTo(a2.getZipCode()));
                break;
        }
        return displaySearchResults((ArrayList<Address>) results, searchType);
    }

    @Override
    public ArrayList<Address> searchAddress(Predicate predicate) {
        return (ArrayList<Address>) addressBook.stream()
                .filter(predicate).collect(Collectors.<Address>toList());
    }

    protected void displayAddress(Address address) {
        cio.prompt("\n\t" + address.getFirstName() + " " + address.getLastName());
        if (!address.getCompanyName().isEmpty()) {
            cio.prompt("\t" + address.getCompanyName());
        }
        cio.prompt("\t" + address.getHouseNumber() + " " + address.getStreetName()
                + " " + address.getStreetType());
        if (!address.getAddressLine2().isEmpty()) {
            cio.prompt("\t" + address.getAddressLine2());
        }
        cio.prompt("\t" + address.getCity() + ", " + address.getState() + " "
                + address.getZipCode());
        if (!address.getPhone().isEmpty()) {
            address.getPhone().stream().forEach((p) -> {
                cio.prompt("\n" + p.getPhoneType() + ":\n\t" + p.getPhoneNumber());
            });
        }
        if (!address.getEmail().isEmpty()) {
            address.getEmail().stream().forEach((e) -> {
                cio.prompt("\n" + e.getEmailType() + ":  " + e.getEmailAddress());
            });
        }
        if (!address.getDate().isEmpty()) {
            address.getDate().stream().forEach((d) -> {
                cio.prompt("\n" + d.getDateDescription() + ":  "
                        + d.getDate().format(formatter));
                cio.prompt("\t" + d.getComment());
            });
        }
    }

    @Override
    public Address displaySearchResults(ArrayList<Address> results, String displayType) {
        Address r = new Address();
        if (results.isEmpty()){
            cio.prompt("No entries matching search criteria.");
        }
        if (displayType.equalsIgnoreCase("display")) {
            results.stream().forEach((a) -> {
                displayAddress(a);
            });
        } else {
            for (Address a : results) {
                cio.prompt("Address " + results.indexOf(a) + 1);
                displayAddress(a);
            }
            int selection = cio.promptForIntInRange("Select Address:  ", 1, results.size(), "");
            r = results.get(selection - 1);
        }
        return r;
    }

    public void edit() {
        editAddress(search("edit"));
    }
    
    public void delete(){
        deleteAddress(search("edit"));
    }

    @Override
    public void deleteAddress(Address address) {
        address.setArchive(true);
    }

    @Override
    public int countEntries() {

        return addressBook.size();
    }

    @Override
    public void saveAddressBook() {
        String path = "C:/AddressBook/temp";
        File dirPath = new File(path);
        if (!dirPath.exists()) {
            if (dirPath.mkdirs()) {
                cio.prompt(dirPath + " Created Successfully");
            } else {
                cio.prompt(dirPath + " Not Created");
            }
        }
        String fileName = cio.promptForString("Address Book File Name:  ");
        cio.prompt("Save address book");
        try (PrintWriter out = new PrintWriter(new FileWriter(path + "/" + fileName))) {
            addressBook.stream().forEach((a) -> {
                out.println(encode(a));
            });
            out.flush();
            System.out.println("Data Saved");

        } catch (IOException ex) {
            Logger.getLogger(AddressbookImpl.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void loadAddressBook() {
        String path = "C:/AddressBook/temp";
        File dirPath = new File(path);
        String fileName = "";
        File file = new File(fileName);
        String currentLine = "";
        do {
            fileName = cio.promptForString("Enter file name:  ");
            file = new File(path + "/" + fileName);
            if (!file.exists()) {
                cio.prompt("\nInvalid File Name\n\nCurrent Files:\n");
                String[] files = dirPath.list();
                for (String f : files) {
                    cio.prompt("\t" + f);
                }
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
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AddressbookImpl.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    //encode address
    protected String encode(Address a) {
        String first = a.getFirstName();
        String last = a.getLastName();
        String company = a.getCompanyName();
        String aLine2 = a.getAddressLine2();
        String r = "";
        if (a.getFirstName().isEmpty()) {
            first = "-1";
        }
        if (a.getLastName().isEmpty()) {
            last = "-1";
        }
        if (a.getCompanyName().isEmpty()) {
            company = "-1";
        }
        if (a.getAddressLine2().isEmpty()) {
            aLine2 = "-1";
        }
        r = a.getAddressId() + "::" + a.isArchive() + "::" + first + "::" + last
                + "::" + company + "::" + a.getHouseNumber() + "::"
                + a.getStreetName() + "::" + a.getStreetType() + "::"
                + aLine2 + "::" + a.getCity() + "::" + a.getState() + "::"
                + a.getZipCode() + ":c:";

        if (a.getPhone().isEmpty()) {
            r += ":r:" + ":c:";
        } else {
            r = a.getPhone().stream().map((p) -> p.getPhoneType() + "::"
                    + p.getPhoneNumber() + ":r:").reduce(r, String::concat);
            r += ":c:";
        }
        if (a.getEmail().isEmpty()) {
            r += ":r:" + ":c:";
        } else {
            r = a.getEmail().stream().map((e) -> e.getEmailType() + "::"
                    + e.getEmailAddress() + ":r:").reduce(r, String::concat);
            r += ":c:";
        }
        if (a.getDate().isEmpty()) {
            r += ":r:" + ":c:";
        } else {
            r = a.getDate().stream().map((d) -> d.getDateDescription() + "::"
                    + d.getDate() + "::" + d.getComment() + ":r:").reduce(r, String::concat);
            r += ":c:";
        }

        r += a.getDateCreated() + "::" + a.getDateModified();
        return r;
    }

    //decode line to create new Address object
    protected Address decode(String str) {
        Address a;
        ArrayList<Phone> pl = new ArrayList<>();
        Phone phone;
        ArrayList<Email> el = new ArrayList<>();
        Email email;
        ArrayList<SpecialDates> dl = new ArrayList<>();
        SpecialDates date;
        String comment = "";
        String[] temp = str.split(":c:");
        String[] aTemp = temp[0].split("::");
        String first = aTemp[2];
        String last = aTemp[3];
        String company = aTemp[4];
        String aLine2 = aTemp[8];
        if (first.equals("-1")) {
            first = "";
        }
        if (last.equals("-1")) {
            last = "";
        }
        if (company.equals("-1")) {
            company = "";
        }
        if (aLine2.equals("-1")) {
            aLine2 = "";
        }
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
                    String[] dt = da[1].split("-");
                    if (da.length == 2) {
                        comment = "";
                    } else {
                        comment = da[2];
                    }
                    date = new SpecialDates(da[0],
                            LocalDate.parse(dt[1] + "/" + dt[2] + "/" + dt[0], formatter), comment);
                    dl.add(date);
                }
            }
        }
        String[] dTemp = temp[5].split("::");
        String[] cd = dTemp[0].split("-");
        String[] md = dTemp[1].split("-");
        a = new Address(Integer.parseInt(aTemp[0]), Boolean.parseBoolean(aTemp[1]),
                first, last, company, aTemp[5], aTemp[6], aTemp[7], aLine2, aTemp[9],
                aTemp[10], aTemp[11], pl, el, dl,
                LocalDate.parse(cd[1] + "/" + cd[2] + "/" + cd[0], formatter),
                LocalDate.parse(md[1] + "/" + md[2] + "/" + md[0], formatter));
        return a;
    }
}

/*
controller for address book
 */
package com.sg.addressbook.controller;

import com.sg.addressbook.dto.Address;
import com.sg.addressbook.ops.Addressbook;
import java.util.HashMap;

/**
 *
 * @author Paul Peterson
 */
public class AddressbookController {

    public static void main(String[] args) {

        Addressbook address = new Addressbook();
        ConsoleIO cio = new ConsoleIO();
        HashMap<Integer, Address> addressList = new HashMap();
        String title1 = "Address Book";
        String mainMenuTitle = "Main Menu";
        String[] mainMenuItems = {"Add Address", "Search Address Book", "Update Address",
            "Delete Address", "Save Address Book", "Load Address Book", "Exit"};
        String addMenuTitle = "Add Menu";
        String[] addMenuItems = {"Add Address", "Add Phone", "Add Email",
            "Add Date", "Main Menu"};
        String searchMenuTitle = "Search Menu";
        String[] searchMenuItems = {"Display All", "Search by Last Name",
            "Address Book Size", "Main Menu"};
        String editMenuTitle = "Edit Menu";
        String deleteMenuTitle = "Delete Menu";
        String[] deleteMenuItems = {"Delete Address", "Restore Address", "Main Menu"};
        int mainSelection = 0, addSelection = 0, searchSelection = 0, deleteSelection = 0;
        boolean isSaved = false;
        mainSelection = 0;
        while (mainSelection != mainMenuItems.length) {
            mainSelection = cio.displayMenu(title1, mainMenuTitle, mainMenuItems);
            switch (mainSelection) {
                //add new address
                case 1:
                    addSelection = 0;
                    while (addSelection != addMenuItems.length) {
                        addSelection = cio.displayMenu(title1, addMenuTitle, addMenuItems);
                        switch (addSelection) {
                            //add address
                            case 1:
                                address.addAddress();
                                addSelection = 0;
                                break;
                            //add phone
                            case 2:
                                if (address.displayAddressbookSize() <= 0) {
                                    cio.prompt("Address Book is empty.  Please enter an address first.");
                                    break;
                                }
                                String searchName = cio.promptForString("Search for Last Name:  ");
                                if (!address.containsAddress(searchName)) {
                                    cio.prompt("No record for " + searchName);
                                    break;
                                }
                                address.addToAddress("phone", address.searchAddress(searchName, "select"));
                                addSelection = 0;
                                break;
                            //add email
                            case 3:
                                if (address.displayAddressbookSize() <= 0) {
                                    cio.prompt("Address Book is empty.  Please enter an address first.");
                                    break;
                                }
                                searchName = cio.promptForString("Search for Last Name:  ");
                                if (!address.containsAddress(searchName)) {
                                    cio.prompt("No record for " + searchName);
                                    break;
                                }
                                address.addToAddress("email", address.searchAddress(searchName, "select"));
                                //update Address  
                                addSelection = 0;
                                break;
                            //add date
                            case 4:
                                if (address.displayAddressbookSize() <= 0) {
                                    cio.prompt("Address Book is empty.  Please enter an address first.");
                                    break;
                                }
                                searchName = cio.promptForString("Search for Last Name:  ");
                                if (!address.containsAddress(searchName)) {
                                    cio.prompt("No record for " + searchName);
                                    break;
                                }
                                address.addToAddress("date", address.searchAddress(searchName, "select"));
                                addSelection = 0;
                                //update Address                                
                                break;
                            //return to main menu
                            case 5:
                                cio.prompt("\nReturning to the Main Menu\n");
                                break;
                        }
                    }
                    mainSelection = 0;
                    break;
                //search addresses
                case 2:
                    searchSelection = 0;
                    while (searchSelection != searchMenuItems.length) {
                        searchSelection = cio.displayMenu(title1, searchMenuTitle, searchMenuItems);
                        switch (searchSelection) {
                            //display all addresses
                            case 1:
                                String type = address.searchType(cio.promptForString("Name only or full listing (Name or Full):  "));
                                address.displayAllAddresses(type);
                                searchSelection = 0;
                                break;
                            //search by last name
                            case 2:
                                address.searchAddress(cio.promptForString("Search for Last Name:  "), "view");
                                searchSelection = 0;
                                break;
                            //display address book size
                            case 3:
                                int entries = address.displayAddressbookSize();
                                cio.prompt("There are " + entries + " active Addresses.");
                                searchSelection = 0;
                                break;
                            //return to main menu
                            case 4:
                                cio.prompt("\nReturning to the Main Menu\n");
                                break;
                        }
                    }
                    mainSelection = 0;
                    break;
                //edit address
                case 3:
                    isSaved = false;
                    String searchName = cio.promptForString("Search for Last Name:  ");
                    if (!address.containsAddress(searchName)) {
                        cio.prompt("No record for " + searchName);
                        break;
                    }
                    address.editAddress(address.searchAddress(searchName, "select"));
                    mainSelection = 0;
                    break;
                //delete address
                case 4:
                    isSaved = false;
                    deleteSelection = 0;
                    while (deleteSelection != deleteMenuItems.length) {
                        deleteSelection = cio.displayMenu(title1, deleteMenuTitle, deleteMenuItems);
                        switch (deleteSelection) {
                            //delete address
                            case 1:
                                searchName = cio.promptForString("Search for Last Name:  ");
                                if (!address.containsAddress(searchName)) {
                                    cio.prompt("No record for " + searchName);
                                    deleteSelection = 0;
                                    break;
                                }
                                address.deleteAddress(address.searchAddress(searchName, "select"));
                                break;
                            //restore address
                            case 2:
                                address.restoreAddress();
                                deleteSelection = 0;
                                break;
                            //return to main menu
                            case 3:
                                cio.prompt("\nReturning to the Main Menu\n");
                                break;
                        }
                    }
                    mainSelection = 0;
                    break;
                //save addressbook
                case 5:
                    address.saveAddressbook();
                    isSaved = true;
                    mainSelection = 0;
                    break;
                //load addressbook
                case 6:
                    address.openAddressbook();
                    mainSelection = 0;
                    break;
                //prompt for save and exit
                case 7:
                    if (!isSaved) {
                        if (cio.promptForBoolean("Save before exit (Y or N) ", "y")) {
                            address.saveAddressbook();
                            isSaved = true;
                        }
                    }
                    break;
            }
        }
        cio.prompt("\nThank You\n\nGoodbye!\n");
    }
}

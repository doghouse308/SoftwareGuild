package com.sg.addressbookv2.controller;

import com.sg.addressbookv2.ConsoleIO;
import com.sg.addressbookv2.dao.AddressbookImpl;

/**
 *
 * @author Paul Peterson
 */
public class AddressbookController {

    public void run() {

        ConsoleIO cio = new ConsoleIO();
        AddressbookImpl abook = new AddressbookImpl();
        String title1 = "Address Book";
        String mainMenuTitle = "Main Menu";
        String[] mainMenuItems = {"Create New Address Entry", "Search Address Book",
            "Edit Address Entry", "Delete Address", "Address Book Info", "Load File",
            "Save File", "Exit"};
        int selection = 0;
        boolean isSaved = false;
        while (selection != mainMenuItems.length) {
            selection = cio.displayMenu(title1, mainMenuTitle, mainMenuItems);
            switch (selection) {
                case 1:
                    abook.createAddress();
                    isSaved = false;
                    selection = 0;
                    break;
                case 2:
                    abook.search("display");
                    selection = 0;
                    break;
                case 3:
                    abook.search("edit");
                    isSaved = false;
                    selection = 0;
                    break;
                case 4:
                    abook.delete();
                    isSaved = false;
                    selection = 0;
                    break;
                case 5:
                    abook.countEntries();
                    selection = 0;
                    break;
                case 6:
                    abook.loadAddressBook();
                    selection = 0;
                    break;
                case 7:
                    abook.saveAddressBook();
                    isSaved = true;
                    selection = 0;
                    break;
                default:
                    cio.prompt("Invalid Entry");
                    selection = 0;
            }
        }
    }
}

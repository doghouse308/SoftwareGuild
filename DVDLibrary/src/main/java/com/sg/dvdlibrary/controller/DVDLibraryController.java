package com.sg.dvdlibrary.controller;

import com.sg.dvdlibrary.dto.DVD;
import com.sg.dvdlibrary.ops.DVDLibrary;

/**
 *
 * @author Paul Peterson
 */
public class DVDLibraryController {

    public static void main(String[] args) {
        DVDLibrary library = new DVDLibrary();
        ConsoleIO cio = new ConsoleIO();

        String title1 = "DVD Library";
        String mainTitle2 = "Main Menu";
        String[] mainMenu = {"Add DVD", "Search Library", "Edit DVD", "Delete DVD",
            "Save Library File", "Load Library File", "Exit"};
        String searchTitle = "Search Menu";
        String[] searchMenu = {"Display All", "Search by Title", "Search by Director",
            "Search by Rating", "Search by Studio", "Return to Main Menu"};
        String editTitle = "Edit Menu";
        String[] editMenu = {"Search by Title", "Search by Director", 
            "Search by Rating", "Search by Studio", "Return to Main Menu"};        
        boolean isSaved = false;
        int mainSelection = 0;
        int searchSelection = 0;
        int editSelection = 0;
        while (mainSelection != mainMenu.length) {
            mainSelection = cio.displayMenu(title1, mainTitle2, mainMenu);
            switch (mainSelection) {
                //add dvd
                case 1:
                    library.addDVD();
                    mainSelection = 0;
                    break;
                //search DVD
                case 2:
                    while (searchSelection != searchMenu.length) {
                        searchSelection = cio.displayMenu(title1, searchTitle, searchMenu);
                        switch (searchSelection) {
                            //Display All
                            case 1:
                                library.searchDVD("all", " ", "view");
                                searchSelection = 0;
                                break;
                            //Search by title
                            case 2:
                                library.searchDVD("title", cio.promptForLine("Title:  "), "view");
                                searchSelection = 0;
                                break;
                            //Search by director
                            case 3:
                                library.searchDVD("director", cio.promptForLine("Director:  "), "view");
                                searchSelection = 0;
                                break;
                            //Search by MPAA Rating
                            case 4:
                                library.searchDVD("rating", cio.promptForLine("MPAA Rating:  "), "view");
                                searchSelection = 0;
                                break;
                            //Search by studio
                            case 5:
                                library.searchDVD("studio", cio.promptForLine("Studio:  "), "view");
                                searchSelection = 0;
                                break;
                            //Sreturn to main menu
                            case 6:
                                cio.prompt("\nReturning to Main Menu\n");
                                break;
                        }
                    }
                    mainSelection = 0;
                    break;
                //editDVD
                case 3:
                    isSaved = false;
                    while (editSelection != editMenu.length) {
                        editSelection = cio.displayMenu(title1, editTitle, editMenu);
                        switch (editSelection) {
                            //Search by title
                            case 1:
                                library.editDVD(library.searchDVD("title", cio.promptForLine("Title:  "), "select"));
                                editSelection = 0;
                                break;
                            //Search by director
                            case 2:
                                library.editDVD(library.searchDVD("director", cio.promptForLine("Director:  "), "select"));
                                editSelection = 0;
                                break;
                            //Search by MPAA Rating
                            case 3:
                                library.editDVD(library.searchDVD("rating", cio.promptForLine("MPAA Rating:  "), "select"));
                                editSelection = 0;
                                break;
                            //Search by studio
                            case 4:
                                library.editDVD(library.searchDVD("studio", cio.promptForLine("Studio:  "), "select"));
                                editSelection = 0;
                                break;
                            //Sreturn to main menu
                            case 5:
                                cio.prompt("\nReturning to Main Menu\n");
                                break;
                        }
                    }
                    mainSelection = 0;
                    break;
                //delete DVD
                case 4:
                    library.deleteDVD(library.searchDVD("title",
                            cio.promptForLine("Title:  "), "select"));
                    isSaved = false;
                    mainSelection = 0;
                    break;
                //save file
                case 5:
                    library.saveDVDLibrary();
                    isSaved = true;
                    mainSelection = 0;
                    break;
                //load file
                case 6:
                    library.loadDVDLibrary();
                    mainSelection = 0;
                    break;

                //exit
                case 7:
                    if (!isSaved) {
                        if (cio.promptForBoolean("Save before exit (Y or N) ", "y")) {
                            library.saveDVDLibrary();
                            isSaved = true;
                        }
                    }
                    break;
            }
        }
    }
}

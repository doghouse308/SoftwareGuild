/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.dvdlibraryv2.controller;

import com.sg.dvdlibraryv2.ConsoleIO;
import com.sg.dvdlibraryv2.dao.DVDLibraryV2Impl;

/**
 *
 * @author Paul Peterson
 */
public class DVDLibraryController {
    
    public void run(){
        
        ConsoleIO cio = new ConsoleIO();
        DVDLibraryV2Impl dvdlib = new DVDLibraryV2Impl();
        
        String title1 = "DVD Library";
        String mainMenu = "Main Menu";
        String [] mainMenuItems = {"Add DVD", "Search DVD", "Display DVD", "Edit DVD",
            "Delete DVD", "Save Library", "Load Library", "Exit"};
        dvdlib.initialize();
        int selection = 0;
        while (selection != mainMenuItems.length){
            selection = cio.displayMenu(title1, mainMenu, mainMenuItems);
            switch(selection){
                case 1:
                    dvdlib.addDVD();
                    selection = 0;
                    break;
                case 2:
                    dvdlib.searchDVD();
                    selection = 0;
                    break;
                case 3:
                    //dvdlib.displayDVD();
                    selection = 0;
                    break;
                case 4:
                    dvdlib.edit();
                    selection = 0;
                    break;
                case 5:
                    dvdlib.deleteDVD();
                    selection = 0;
                    break;
                case 6:
                    dvdlib.save();
                    selection = 0;
                    break;
                case 7:
                    dvdlib.load("manual");
                    selection = 0;
                    break;
                case 8:
                    //save and exit
                    cio.prompt("Saving DVD Library File...");
                    dvdlib.save();
                    break;
                default:
                    cio.prompt("Invalid Entry");
            }
        }
    }
    
}

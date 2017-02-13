
package com.sg.dvdlibraryv2;

import com.sg.dvdlibraryv2.controller.DVDLibraryController;

/**
 *
 * @author Paul Peterson
 */
public class DVDLibraryApp {
    
    public static void main(String[] args) {
        
        DVDLibraryController dvdlib = new DVDLibraryController();
        
        dvdlib.run();
    }
    
}

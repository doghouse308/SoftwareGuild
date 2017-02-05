package com.sg.dvdlibrary.ops;

import com.sg.dvdlibrary.controller.ConsoleIO;
import com.sg.dvdlibrary.dto.DVD;
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
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paul Peterson
 */
public class DVDLibrary {

    DVD dvd = new DVD();
    ConsoleIO cio = new ConsoleIO();
    HashMap<Integer, DVD> dvdLibrary = new HashMap();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    //add dvd
    public void addDVD() {
        do {
            List<String> comments = new ArrayList();
            cio.prompt("New DVD:");
            String title = cio.promptForLine("\tTitle:  ");
            LocalDate releaseDate = cio.promptForLocalDate("\tRelease Date:  ");
            String rating = cio.promptForLine("\tMPAA Rating:  ");
            String director = cio.promptForLine("\tDirector:  ");
            String studio = cio.promptForLine("\tStudio:  ");
            do {
                String comment = cio.promptForLine("\tComment:  ");
                comments.add(comment);
            } while (cio.promptForBoolean("Add another comment?  (Y or N): ", "y"));

            DVD temp = new DVD(-dvdLibrary.size() - 1, false, title, releaseDate, rating, director, studio, comments);
            boolean correct = true;
            do {
                displayDVD(temp);
                correct = cio.promptForBoolean("Information Correct (Y or N):  ", "y");
                if (!correct) {
                    editDVD(temp);
                }
            } while (!correct);
            temp.setDVDId(dvdLibrary.size() + 1);
            dvdLibrary.put(temp.getDVDId(), temp);
        } while (cio.promptForBoolean("Add another DVD? (Y or N):  ", "y"));
    }

    //search DVD
    public DVD searchDVD(String searchBy, String value, String viewSelect) {
        HashMap<Integer, DVD> results = new HashMap();
        DVD d = new DVD();
        int sel = 0;
        if (searchBy.equalsIgnoreCase("all")) {
            results = searchResults(searchBy, value, viewSelect);
            displayResults(results, viewSelect);

            return d;
        } else {
            results = searchResults(searchBy, value, viewSelect);
            displayResults(results, viewSelect);
        }
        if (viewSelect.equalsIgnoreCase("select")) {
            do {
                sel = cio.promptForInt("Enter DVD #:  ") - 1;
                if (sel < 0 || sel > results.size()) {
                    cio.prompt("Invalid selection.  Please select a DVD number "
                            + "between 1 and " + results.size());
                }
            } while (sel < 0 || sel > results.size());
            d = results.get(sel);
        }
        return d;
    }

    //search results
    public HashMap<Integer, DVD> searchResults(String searchBy, String value, String viewSelect) {
        HashMap<Integer, DVD> temp = new HashMap();
        int count = 0;
        String prompt = "";
        if (viewSelect.equalsIgnoreCase("select")) {
            prompt = "DVD # :  ";
        }
        switch (searchBy) {
            case "title":
                count = 0;
                for (HashMap.Entry<Integer, DVD> entry : dvdLibrary.entrySet()) {
                    if (entry.getValue().getTitle().toLowerCase().contains(value.toLowerCase())
                            && !entry.getValue().isIsArchive()) {
                        temp.put(count, entry.getValue());
                        count++;
                    }
                }
                break;
            case "rating":
                count = 0;
                for (HashMap.Entry<Integer, DVD> entry : dvdLibrary.entrySet()) {
                    if (entry.getValue().getMPAArating().equalsIgnoreCase(value)
                            && !entry.getValue().isIsArchive()) {
                        temp.put(count, entry.getValue());
                        count++;
                    }
                }
                break;
            case "director":
                count = 0;
                for (HashMap.Entry<Integer, DVD> entry : dvdLibrary.entrySet()) {
                    if (entry.getValue().getDirector().toLowerCase().contains(value.toLowerCase())
                            && !entry.getValue().isIsArchive()) {
                        temp.put(count, entry.getValue());
                        count++;
                    }
                }
                break;
            case "studio":
                count = 0;
                for (HashMap.Entry<Integer, DVD> entry : dvdLibrary.entrySet()) {
                    if (entry.getValue().getStudio().toLowerCase().contains(value.toLowerCase())
                            && !entry.getValue().isIsArchive()) {
                        temp.put(count, entry.getValue());
                        count++;
                    }
                }
                break;
            case "all":
                count = 0;
                for (HashMap.Entry<Integer, DVD> entry : dvdLibrary.entrySet()) {
                    if (!entry.getValue().isIsArchive()) {
                        temp.put(count, entry.getValue());
                        count++;
                    }
                }
                break;
        }
        return temp;
    }

    //edit DVD
    public DVD editDVD(DVD dvd) {
        DVD d = dvd;
        List<String> comments = new ArrayList();
        cio.prompt("Enter new information or \"Enter\" to keep value.\n");
        String title = cio.promptForLine("\tTitle (" + dvd.getTitle() + "):  ");
        if (!title.equalsIgnoreCase("")) {
            d.setTitle(title);
        }
        String date = cio.promptForLine("\tRelease Date ("
                + formatter.format(dvd.getReleaseDate()) + "):  ");
        if (!date.equals("")) {
            String[] tDate = date.split("/");
            d.setReleaseDate(LocalDate.parse(tDate[0] + "/" + tDate[1] + "/"
                    + tDate[2], formatter));
        }
        String rating = cio.promptForLine("\tMPAA Rating (" + dvd.getMPAArating() + "):  ");
        if (!rating.equalsIgnoreCase("")) {
            d.setMPAArating(rating);
        }
        String director = cio.promptForLine("\tDirector (" + dvd.getDirector() + "):  ");
        if (!director.equalsIgnoreCase("")) {
            d.setDirector(director);
        }
        String studio = cio.promptForLine("\tStudio (" + dvd.getStudio() + "):  ");
        if (!studio.equalsIgnoreCase("")) {
            d.setStudio(studio);
        }
        int count = 0;
        for (String str : dvd.getComments()) {
            String comment = cio.promptForLine("\tComment (" + str + "):  ");
            if (!comment.equalsIgnoreCase("")) {
                comments.set(count, comment);
                d.setComments(comments);
            }
            count++;
        }
        return d;
    }

    //delete DVD
    public void deleteDVD(DVD dvd) {
        cio.prompt("Delete to DVD:  \n");
        displayDVD(dvd);
        if (cio.promptForBoolean("Confirm Delete (Y or N):  ", "y")) {
            dvd.setIsArchive(true);
        }
    }

    //display results
    public void displayResults(HashMap<Integer, DVD> searchResults, String viewSelect) {
        String prompt = "";
        int count = 1;
        if (viewSelect.equalsIgnoreCase("select")) {
            prompt = "DVD # : " + count;
        } else {
            prompt = "DVD Informarion:";
        }
        for (Integer key : searchResults.keySet()) {
            cio.prompt(prompt);
            displayDVD(searchResults.get(key));
            count++;
        }
    }

    //display dvd information
    public void displayDVD(DVD dvd) {
        cio.prompt("\tTitle:  " + dvd.getTitle());
        cio.prompt("\tRelease Date:  " + formatter.format(dvd.getReleaseDate()));
        cio.prompt("\tMPAA Rating:  " + dvd.getMPAArating());
        cio.prompt("\tDirector:  " + dvd.getDirector());
        cio.prompt("\tStudio:  " + dvd.getStudio());
        if (!dvd.getComments().isEmpty()) {
            for (String str : dvd.getComments()) {
                cio.prompt("\tComment:  " + str);
            }
        }
    }

    //save DVD Library
    public void saveDVDLibrary() {
        try (PrintWriter out
                = new PrintWriter(new FileWriter(cio.promptForString("Enter file name to save data:  ")))) {
            for (HashMap.Entry<Integer, DVD> entry : dvdLibrary.entrySet()) {
                out.println(encode(entry.getValue()));
            }
        } catch (IOException ex) {
            Logger.getLogger(DVDLibrary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //load DVD Library
    public void loadDVDLibrary() {
        String action = "";
        HashMap<Integer, DVD> tempLib = new HashMap();
        if (!dvdLibrary.isEmpty()) {
            action = cio.promptForString("Address Book contains data. \n "
                    + "Merge with new file, Save or Overwrite? ( M, S or O ):  ");
            switch (action.toLowerCase()) {
                case "s":
                    saveDVDLibrary();
                    dvdLibrary.clear();
                    break;
                case "o":
                    dvdLibrary.clear();
                    break;
                case "m":
                    tempLib = (HashMap<Integer, DVD>) dvdLibrary.clone();
                    dvdLibrary.clear();
                    break;
            }
        }
        String fileName = "";
        File file = new File(fileName);
        String currentLine = "";
        do {
            fileName = cio.promptForString("Enter file name to open:  ");
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
                DVD temp = decode(currentLine);
                dvdLibrary.put(temp.getDVDId(), temp);
            }
            if (!tempLib.isEmpty()) {
                for (HashMap.Entry<Integer, DVD> entry : tempLib.entrySet()) {
                    DVD d = entry.getValue();
                    int id = dvdLibrary.size() + 1;
                    d.setDVDId(id);
                    dvdLibrary.put(id, d);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DVDLibrary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //encode data
    public String encode(DVD dvd) {
        String date = dvd.getReleaseDate().format(formatter);
        if (date.isEmpty()) {
            date = " ";
        }
        String r = dvd.getDVDId() + "::" + dvd.isIsArchive() + "::" + dvd.getTitle()
                + "::" + date + "::" + dvd.getMPAArating() + "::"
                + dvd.getDirector() + "::" + dvd.getStudio() + ":r:";
        for (String str : dvd.getComments()) {
            r += str + "::";
        }
        return r;
    }

    //decode String
    public DVD decode(String str) {
        ArrayList c = new ArrayList();
        String[] dvdData = str.split(":r:");
        String[] dInfo = dvdData[0].split("::");
        String[] dt = dInfo[3].split("/");
        LocalDate date = LocalDate.parse(dt[0] + "/" + dt[1] + "/" + dt[2], formatter);
        if (dvdData.length > 1) {
            String[] cTemp = dvdData[1].split("::");
            for (String comment : cTemp) {
                c.add(comment);
            }
        }
        DVD dvd = new DVD(Integer.parseInt(dInfo[0]), Boolean.parseBoolean(dInfo[1]),
                dInfo[2], date, dInfo[4], dInfo[5], dInfo[6], c);
        return dvd;
    }
}

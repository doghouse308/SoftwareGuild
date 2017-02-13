package com.sg.dvdlibraryv2.dao;

import com.sg.dvdlibraryv2.ConsoleIO;
import com.sg.dvdlibraryv2.dto.DVD;
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
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 *
 * @author Paul Peterson
 */
public class DVDLibraryV2Impl implements DVDLibraryInterface {

    ConsoleIO cio = new ConsoleIO();
    List<DVD> dvdLibrary = new ArrayList<>();
    List<DVD> results = new ArrayList<>();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    boolean libraryOpen = false;

    //test passed
    @Override
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
                cio.prompt(temp.toString());
                correct = cio.promptForBoolean("Information Correct (Y or N):  ", "y");
                if (!correct) {
                    temp = editDVD(temp);
                }
            } while (!correct);
            temp.setDVDId(dvdLibrary.size() + 1);
            dvdLibrary.add(temp);
        } while (cio.promptForBoolean("Add another DVD? (Y or N):  ", "y"));
    }

    public DVD search() {
        DVD sDVD = new DVD();
        String title = cio.promptForLine("Title:  ");
        Predicate<DVD> searchByTitle = dvd -> dvd.getTitle().toLowerCase()
                .contains(title.toLowerCase());
        Consumer<DVD> consumer = (dvd) -> System.out.println(dvd);
        List<DVD> searchResults = searchResults(searchByTitle);
        if (searchResults.size() == 1) {
            System.out.println(searchResults.get(0));
            if (cio.promptForBoolean("Is this the DVD you wish to edit", "y")) {
                sDVD = searchResults.get(0);
            }
        } else {
            searchResults.stream().map((eDvd) -> {
                System.out.println("DVD " + (searchResults.indexOf(eDvd) + 1));
                return eDvd;
            }).forEach((eDvd) -> {
                System.out.println(eDvd);
            });
        }
        int selection = cio.promptForIntInRange("Enter DVD Number to edit:  (0 to exit)", 0,
                searchResults.size(), "");
        if (selection > 0) {
            sDVD = searchResults.get(selection - 1);
        } else if (selection == 0) {
            sDVD = new DVD(-1);
        }

        return sDVD;
    }

    @Override
    public DVD searchDVD() {
        DVD d = new DVD();
        String title1 = "DVD Library";
        String title2 = "Search Options";
        String[] searchMenuItems = {"Show All DVDs", "Search by Title",
            "Search by Director", "Search by Director", "Search by Rating", "DVD Stats",
            "Search by Release Date", "Return to Main Menu"};
        int selection = 0;
        while (selection != searchMenuItems.length) {
            selection = cio.displayMenu(title1, title2, searchMenuItems);
            switch (selection) {
                case 1:
                    //test passed
                    Predicate<DVD> all = dvd -> true;
                    Consumer<DVD> consumer = (dvd) -> System.out.println(dvd.getTitle());
                    displayResults(dvdLibrary, all, consumer);
                    selection = 0;
                    break;
                case 2:
                    //test passed
                    String title = cio.promptForLine("Title:  ").toLowerCase();
                    Predicate<DVD> searchByTitle = dvd -> dvd.getTitle().toLowerCase()
                            .contains(title.toLowerCase());
                    consumer = (dvd) -> System.out.println(dvd);
                    List<DVD> resultsByTitle = searchResults(searchByTitle);
                    displayResults(resultsByTitle, searchByTitle, consumer);
                    selection = 0;
                    break;
                case 3:
                    //test passed
                    String director = cio.promptForLine("Director:  ").toLowerCase();
                    Predicate<DVD> searchByDirector = dvd
                            -> dvd.getDirector().toLowerCase()
                            .contains(director.toLowerCase());
                    consumer = (dvd) -> System.out.println(dvd);
                    List<DVD> resultsByDirector = searchResults(searchByDirector);
                    Collections.sort(resultsByDirector, (DVD d1, DVD d2) -> String.valueOf(d1.getStudio())
                            .compareToIgnoreCase(d2.getStudio()));
                    displayResults(resultsByDirector, searchByDirector, consumer);
                    selection = 0;
                    break;
                case 4:
                    String studio = cio.promptForLine("Studio:  ").toLowerCase();
                    Predicate<DVD> searchByStudio = dvd
                            -> dvd.getStudio().toLowerCase()
                            .contains(studio.toLowerCase());
                    consumer = (dvd) -> System.out.println(dvd);
                    List<DVD> resultsByStudio = searchResults(searchByStudio);
                    Collections.sort(resultsByStudio, (DVD d1, DVD d2) -> String.valueOf(d1.getStudio())
                            .compareToIgnoreCase(d2.getStudio()));
                    displayResults(resultsByStudio, searchByStudio, consumer);
                    selection = 0;
                    break;
                case 5:
                    //test pased
                    String rating = cio.promptForLine("MPAA Rating:  ").toLowerCase();
                    Predicate<DVD> searchByRating = dvd -> dvd.getMPAArating().toLowerCase()
                            .contains(rating.toLowerCase());
                    consumer = (dvd) -> System.out.println(dvd);
                    List<DVD> resultsByRating = searchResults(searchByRating);
                    displayResults(resultsByRating, searchByRating, consumer);
                    selection = 0;
                    break;
                case 6:
                    //dvd stats
                    dvdStats();
                    selection = 0;
                    break;
                case 7:
                    //manually tested and verified
                    //search by release date
                    LocalDate current = LocalDate.now();
                    int currentYear = current.getYear();
                    int nYears = cio.promptForInt("Search DVD's released within n years"
                            + "\nYears =  ");
                    Predicate<DVD> searchByReleaseDate = (dRD) -> (currentYear - dRD.getReleaseDate().getYear() <= nYears);
                    consumer = (dvd) -> System.out.println(dvd.getTitle());
                    List<DVD> resultsbyReleaseDate = searchResults(searchByReleaseDate);
                    Collections.sort(resultsbyReleaseDate, (DVD d1, DVD d2) -> d1.getReleaseDate().compareTo(d2.getReleaseDate()));
                    cio.prompt("Movies released in the past " + nYears + " years:");
                    displayResults(resultsbyReleaseDate, searchByReleaseDate, consumer);
                    selection = 0;
                    break;
                case 8:
                    cio.prompt("Returning to Main Menu");
                    break;
                default:
                    cio.prompt("Invalid Selection");
                    selection = 0;
            }
        }
        return d;
    }

    protected List<DVD> searchResults(Predicate<DVD> predicate) {
        List<DVD> searchResults = dvdLibrary.stream().filter((d)
                -> !d.isIsArchive() && (predicate.test(d)))
                .collect(Collectors.toList());
        if (searchResults.isEmpty()) {
            cio.prompt("No Matching Results");
        }

        return searchResults;
    }

    //maunally tested
    @Override
    public List<DVD> displayResults(List<DVD> dvdLib, Predicate<DVD> predicate, Consumer<DVD> consumer) {

        cio.prompt("DVD's\n");
        dvdLib.stream().filter((dvd) -> (predicate.test(dvd))).forEach((dvd) -> {
            consumer.accept(dvd);
        });

        return dvdLib;
    }

    //manually tested
    public void edit() {
        DVD eDvd = search();
        if (eDvd.getDVDId() != -1) {
            editDVD(eDvd);
        }
    }

    //manual test successful
    @Override
    public DVD editDVD(DVD dvd) {
        List<String> comments = new ArrayList();
        cio.prompt("Enter new information or \"Enter\" to keep value.\n");
        String title = cio.promptForLine("\tTitle (" + dvd.getTitle() + "):  ");
        if (title.length() > 0) {
            dvd.setTitle(title);
        }
        String date = cio.promptForLine("\tRelease Date ("
                + formatter.format(dvd.getReleaseDate()) + "):  ");
        if (date.length() > 0) {
            String[] tDate = date.split("/");
            dvd.setReleaseDate(LocalDate.parse(tDate[0] + "/" + tDate[1] + "/"
                    + tDate[2], formatter));
        }
        String rating = cio.promptForLine("\tMPAA Rating (" + dvd.getMPAArating() + "):  ");
        if (rating.length() > 0) {
            dvd.setMPAArating(rating);
        }
        String director = cio.promptForLine("\tDirector (" + dvd.getDirector() + "):  ");
        if (director.length() > 0) {
            dvd.setDirector(director);
        }
        String studio = cio.promptForLine("\tStudio (" + dvd.getStudio() + "):  ");
        if (studio.length() > 0) {
            dvd.setStudio(studio);
        }
        dvd.getComments().stream().map((str) -> cio.promptForLine("\tComment ("
                + str + "):  ")).filter((comment) -> (comment.length() > 0)).map((comment) -> {
            comments.add(comment);
            return comment;
        }).forEach((_item) -> {
            dvd.setComments(comments);
        });

        return dvd;
    }

    public void dvdStats() {
        LocalDate today = LocalDate.now();
        int currentYear = today.getYear();
        int totalAge = 0;
        int commentCount = 0;
        double dvdCount =  dvdLibrary.stream().count();
        commentCount = dvdLibrary.stream().filter((dwc) -> (dwc.getComments().size() > 0)).map((_item) -> 1).reduce(commentCount, Integer::sum);
        totalAge = dvdLibrary.stream().map((advd) -> currentYear - advd.getReleaseDate().getYear()).reduce(totalAge, Integer::sum);
        String newestDVD
                = dvdLibrary.stream().max(Comparator.comparing(DVD::getReleaseDate)).get().getTitle();
        String oldestDVD
                = dvdLibrary.stream().min(Comparator.comparing(DVD::getReleaseDate)).get().getTitle();
        double avg = totalAge / dvdCount;
        double avgComments = (commentCount / dvdCount) * 100;
        
        cio.prompt("There are " + dvdCount + " DVDs in your collection");
        cio.prompt("The average age of the DVD's in your collection is:  " + avg 
            + " years");
        cio.prompt("The newest DVD is " + newestDVD + ".");
        cio.prompt("The oldest DVD is " + oldestDVD + ".");
        cio.prompt(avgComments + "% of the DVDs have comments.");
        
    }

    @Override
    public void deleteDVD() {
        DVD eDvd = search();
        if (eDvd.getDVDId() != -1) {
            cio.prompt(eDvd.getTitle() + " has been archived.");
            eDvd.setIsArchive(true);
        }
    }

    //manually tested
    @Override
    public void save() {
        String path = "C:/DVDLibrary/temp";
        String fileName;

        if (libraryOpen) {
            fileName = "dvdLibrary.txt";
        } else {
            fileName = cio.promptForString("File Name:  ");
        }
        saveDVDLibrary(path, fileName);
    }

    //save current dvd library to a file
    private void saveDVDLibrary(String path, String fileName) {
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
            dvdLibrary.stream().forEach((d) -> {
                out.println(encode(d));
            });
        } catch (IOException ex) {
            Logger.getLogger(DVDLibraryV2Impl.class.getName()).log(Level.SEVERE, null, ex);
        }
        fileName = fileName.substring(fileName.lastIndexOf("/") + 1);
        cio.prompt("\n" + fileName + " Saved\n");
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
        r = dvd.getComments().stream().map((str) -> str + "::").reduce(r, String::concat);
        return r;
    }

    @Override
    public void load(String type) {

        loadDVDLibrary(type);
    }

    //load dvd library file
    private void loadDVDLibrary(String type) {

        String path = "C:/DVDLibrary/temp";
        File dirPath = new File(path);
        String fileName = "";
        File file = new File(fileName);
        String currentLine = "";
        if (type.equalsIgnoreCase("manual")) {
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
        } else {
            fileName = "dvdLibrary.txt";
            libraryOpen = true;
        }

        try {
            Scanner sc = new Scanner(
                    new BufferedReader(new FileReader(path + "/" + fileName)));
            // go through the file line by line
            while (sc.hasNext()) {
                currentLine = sc.nextLine();
                DVD d = decode(currentLine);
                dvdLibrary.add(d);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DVDLibraryV2Impl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*initialize folders
    create folders for invnetory and sales files if they do not exist
     */
    public void initialize() {

        String path = "C:/DVDLibrary/temp";
        makeDirectory(path);
        File f = new File(path + "/dvdLibrary.txt");
        if (f.exists()) {
            loadDVDLibrary("auto");
            if (dvdLibrary.size() > 0) {
                cio.prompt("dvdLibrary.txt loaded");
            }
        }
    }

    private void makeDirectory(String path) {

        /*Creating directory*/
        File dirPath1 = new File(path);
        if (!dirPath1.exists()) {
            if (dirPath1.mkdirs()) {
                System.out.println("Directory created successfully");
            } else {
                System.out.println("Fail to create directory");
            }
        }
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
            c.addAll(Arrays.asList(cTemp));
        }
        DVD dvd = new DVD(Integer.parseInt(dInfo[0]), Boolean.parseBoolean(dInfo[1]),
                dInfo[2], date, dInfo[4], dInfo[5], dInfo[6], c);
        return dvd;
    }

}

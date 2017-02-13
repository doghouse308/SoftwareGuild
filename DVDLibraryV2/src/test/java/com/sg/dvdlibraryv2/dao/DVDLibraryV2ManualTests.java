
package com.sg.dvdlibraryv2.dao;

import com.sg.dvdlibraryv2.dto.DVD;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author Paul Peterson
 */
public class DVDLibraryV2ManualTests {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
    DVDLibraryV2Impl test = new DVDLibraryV2Impl();

    public void displayAllTest() {
        Predicate<DVD> all = dvd -> true;
        Consumer<DVD> consumer = (dvd) -> System.out.println(dvd.getTitle());
        List<DVD> dvdLib = new ArrayList<>();
        int DVDId = 1;
        boolean isArchive = false;
        String title = "Star Wars";
        LocalDate releaseDate = LocalDate.parse("05/25/1977", formatter);
        String MPAArating = "PG";
        String director = "George Lucas";
        String studio = "Lucasfilm, Inc";
        List<String> comments = Arrays.asList("May the force be with you...", "bye-bye obi-wan");
        DVD dvd1;
        dvd1 = new DVD(DVDId, false, title, releaseDate, MPAArating, director,
                studio, comments);
        dvdLib.add(dvd1);


        DVDId = 2;
        title = "Jaws";
        releaseDate = LocalDate.parse("06/20/1975", formatter);
        MPAArating = "R";
        director = "Steven Spielberg";
        studio = "Universal Studios";
        comments = Arrays.asList("Wanna Swim?", "Testing");
        DVD dvd2;
        dvd2 = new DVD(DVDId, false, title, releaseDate, MPAArating, director,
                studio, comments);
        dvdLib.add(dvd2);
        
        DVDId = 3;
        title = "Rocky";
        releaseDate = LocalDate.parse("12/03/1976", formatter);
        MPAArating = "PG";
        director = "John G. Avildsen";
        studio = "Chartoff-Winkler Productions";
        comments = Arrays.asList();
        DVD dvd3 = new DVD(DVDId, false, title, releaseDate, MPAArating, director,
                studio, comments);
        dvdLib.add(dvd3);
        test.displayResults(test.dvdLibrary, all, consumer);
    }
}


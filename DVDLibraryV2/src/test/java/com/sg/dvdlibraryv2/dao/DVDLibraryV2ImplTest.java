
package com.sg.dvdlibraryv2.dao;

import com.sg.dvdlibraryv2.dto.DVD;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class DVDLibraryV2ImplTest {

    DVDLibraryV2Impl test = new DVDLibraryV2Impl();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    public DVDLibraryV2ImplTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void addDVDTest() {

        //arrange
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
        test.dvdLibrary.add(dvd1);

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
        test.dvdLibrary.add(dvd2);

        DVDId = 3;
        title = "Rocky";
        releaseDate = LocalDate.parse("12/03/1976", formatter);
        MPAArating = "PG";
        director = "John G. Avildsen";
        studio = "Chartoff-Winkler Productions";
        comments = Arrays.asList();
        DVD dvd3 = new DVD(DVDId, false, title, releaseDate, MPAArating, director,
                studio, comments);
        test.dvdLibrary.add(dvd3);

        int expected = 3;

        //actual
        int actual = test.dvdLibrary.size();

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void displayAllTest() {

        //arrange
        List<DVD> dlib = new ArrayList<>();
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
        test.dvdLibrary.add(dvd1);

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
        test.dvdLibrary.add(dvd2);

        DVDId = 3;
        title = "Rocky";
        releaseDate = LocalDate.parse("12/03/1976", formatter);
        MPAArating = "PG";
        director = "John G. Avildsen";
        studio = "Chartoff-Winkler Productions";
        comments = Arrays.asList();
        DVD dvd3 = new DVD(DVDId, false, title, releaseDate, MPAArating, director,
                studio, comments);
        test.dvdLibrary.add(dvd3);

        int expected = 3;

        //actual
        Predicate<DVD> all = dvd -> true;
        Consumer<DVD> consumer = (dvd) -> System.out.println(dvd.getTitle());
        List<DVD> results = test.searchResults(all);
        int actual = test.displayResults(results, all, consumer).size();

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void displaySearchByTitleTest() {
        //arrange
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
        test.dvdLibrary.add(dvd1);

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
        test.dvdLibrary.add(dvd2);

        DVDId = 3;
        title = "Rocky";
        releaseDate = LocalDate.parse("12/03/1976", formatter);
        MPAArating = "PG";
        director = "John G. Avildsen";
        studio = "Chartoff-Winkler Productions";
        comments = Arrays.asList();
        DVD dvd3 = new DVD(DVDId, false, title, releaseDate, MPAArating, director,
                studio, comments);
        test.dvdLibrary.add(dvd3);

        int expected = 1;

        //actual
        String titleSearched = "Jaws";
        Predicate<DVD> searchByTitle = dvd -> dvd.getTitle().toLowerCase()
                .contains(titleSearched.toLowerCase());
        Consumer<DVD> consumer = (dvd) -> System.out.println(dvd);
        List<DVD> results = test.searchResults(searchByTitle);
        int actual = test.displayResults(results, searchByTitle, consumer).size();

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void displayByDirectorTest() {
        //arrange
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
        test.dvdLibrary.add(dvd1);

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
        test.dvdLibrary.add(dvd2);

        DVDId = 3;
        title = "Rocky";
        releaseDate = LocalDate.parse("12/03/1976", formatter);
        MPAArating = "PG";
        director = "John G. Avildsen";
        studio = "Chartoff-Winkler Productions";
        comments = Arrays.asList();
        DVD dvd3 = new DVD(DVDId, false, title, releaseDate, MPAArating, director,
                studio, comments);
        test.dvdLibrary.add(dvd3);

        int expected = 1;

        //actual
        String directorSearched = "George Lucas";
        Predicate<DVD> searchByDirector = dvd-> dvd.getDirector().toLowerCase()
                            .contains(directorSearched.toLowerCase());
        Consumer<DVD> consumer = (dvd) -> System.out.println(dvd);
        List<DVD> results = test.searchResults(searchByDirector);
        int actual = test.displayResults(results, searchByDirector, consumer).size();

        //assert
        assertEquals(expected, actual);
    }
    
    @Test
    public void displayByDirectorTest2() {
        //arrange
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
        test.dvdLibrary.add(dvd1);

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
        test.dvdLibrary.add(dvd2);

        DVDId = 3;
        title = "Rocky";
        releaseDate = LocalDate.parse("12/03/1976", formatter);
        MPAArating = "PG";
        director = "John G. Avildsen";
        studio = "Chartoff-Winkler Productions";
        comments = Arrays.asList();
        DVD dvd3 = new DVD(DVDId, false, title, releaseDate, MPAArating, director,
                studio, comments);
        test.dvdLibrary.add(dvd3);

        int expected = 0;

        //actual
        String directorSearched = "Donald Duck";
        Predicate<DVD> searchByDirector = dvd-> dvd.getDirector().toLowerCase()
                            .contains(directorSearched.toLowerCase());
        Consumer<DVD> consumer = (dvd) -> System.out.println(dvd);
        List<DVD> results = test.searchResults(searchByDirector);
        int actual = test.displayResults(results, searchByDirector, consumer).size();

        //assert
        assertEquals(expected, actual);
    }
    
        @Test
    public void displayByRatingTest() {
        //arrange
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
        test.dvdLibrary.add(dvd1);

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
        test.dvdLibrary.add(dvd2);

        DVDId = 3;
        title = "Rocky";
        releaseDate = LocalDate.parse("12/03/1976", formatter);
        MPAArating = "PG";
        director = "John G. Avildsen";
        studio = "Chartoff-Winkler Productions";
        comments = Arrays.asList();
        DVD dvd3 = new DVD(DVDId, false, title, releaseDate, MPAArating, director,
                studio, comments);
        test.dvdLibrary.add(dvd3);

        int expected = 1;

        //actual
        String ratingSearched = "r";
        Predicate<DVD> searchByRating = dvd -> dvd.getMPAArating().toLowerCase()
                            .contains(ratingSearched.toLowerCase());
        Consumer<DVD> consumer = (dvd) -> System.out.println(dvd);
        List<DVD> results = test.searchResults(searchByRating);
        int actual = test.displayResults(results, searchByRating, consumer).size();

        //assert
        assertEquals(expected, actual); 
    }
}
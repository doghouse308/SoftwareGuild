
package com.sg.dvdlibrary.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paul Peterson
 */
public class ConsoleIO {

    Scanner kb = new Scanner(System.in);

    public void prompt(String prompt) {
        System.out.println(prompt);
    }

    public void inlinePrompt(String prompt) {
        System.out.print(prompt);
    }

    public String promptForString(String prompt) {
        System.out.print(prompt);
        return kb.next();
    }

    public String promptForLine(String prompt) {
        String str = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(prompt);
        try {
            str = reader.readLine();
        } catch (IOException ex) {
            Logger.getLogger(ConsoleIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return  str;
    }

    public int promptForInt(String prompt) {
        int n = 0;
        boolean isValid = true;
        do {
            try {
                System.out.print(prompt);
                n = Integer.parseInt(kb.next());
                isValid = true;
            } catch (NumberFormatException e) {
                isValid = false;
                System.out.println("Plese enter an integer value");
            }
        } while (!isValid);

        return n;
    }

    public int promptForIntInRange(String prompt, int min, int max, String error) {
        int n = 0;
        boolean isValid = true;
        do {
            try {
                do {
                    System.out.print(prompt);
                    n = Integer.parseInt(kb.next());
                    isValid = true;
                    if (n < min || n > max) {
                        if (!error.equals("")) {
                            System.out.println(error + min + " and " + max);
                        } else {
                            System.out.println("Please enter an integer between " + min
                                    + " and " + max);
                        }
                    }
                } while (n < min || n > max);
                isValid = true;
            } catch (NumberFormatException e) {
                isValid = false;
                if (!error.equals("")) {
                    System.out.println(" " + min
                            + " and " + max);
                } else {
                    System.out.println("Please enter an integer between " + min
                            + " and " + max);
                }
            }
        } while (!isValid);

        return n;
    }

    public double promptForDouble(String prompt) {
        double n = 0;
        boolean isValid = true;
        do {
            try {
                System.out.print(prompt);
                n = Double.parseDouble(kb.next());
                isValid = true;
            } catch (NumberFormatException e) {
                isValid = false;
                System.out.println("Plese enter a numeric value");
            }
        } while (!isValid);

        return n;
    }

    public double promptForDoubleInRange(String prompt, double min, double max, String error) {
        double n = min - 1;
        boolean isValid = true;
        do {
            try {
                do {
                    System.out.print(prompt);
                    n = Integer.parseInt(kb.next());
                    if (n < min || n > max) {
                        if (!error.equals("")) {
                            System.out.println(" " + min
                                    + " and " + max);
                        } else {
                            System.out.println("Please enter an integer between " + min
                                    + " and " + max);
                        }
                    }
                } while (n < min || n > max);
                isValid = true;
            } catch (NumberFormatException e) {
                isValid = false;
                if (!error.equals("")) {
                    System.out.println(" " + min
                            + " and " + max);
                } else {
                    System.out.println("Please enter an integer between " + min
                            + " and " + max);
                }
            }
        } while (!isValid);

        return n;
    }

    public boolean promptForBoolean(String prompt, String condition) {
        System.out.print(prompt);

        return kb.next().equalsIgnoreCase(condition);
    }

    public Date promptForDate(String prompt) {
        SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        System.out.print(prompt);
        Date d = new Date();
        try {
            d = df.parse(kb.nextLine());
        } catch (ParseException ex) {
            Logger.getLogger(ConsoleIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return d;
    }

    public LocalDate promptForLocalDate(String prompt) {
        boolean isValid = true;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse("01/01/1970", formatter);
        do {
            try {
                System.out.print(prompt);
                date = LocalDate.parse(kb.next(), formatter);
                isValid = true;
            } catch (DateTimeParseException e) {
                isValid = false;
                System.out.println("Invalid date format (mm/dd/yyyy)");
            }
        } while (!isValid);
        return date;
    }

    public int displayMenu(String title1, String title2, String[] menuItems) {
        int count = 1;
        int width = 80;
        int side = 3;
        String border = "*";
        int offset = width - (side * 2);
        int right1 = 0, left1 = 0, right2 = 0, left2 = 0;
        if (title1.length() % 2 == 0) {
            right1 = ((width - side * 2) - title1.length()) / 2;
            left1 = right1;
        } else {
            left1 = ((width - side * 2) - title1.length()) / 2;
            right1 = left1 + 1;
        }
        if (title2.length() % 2 == 0) {
            right2 = ((width - side * 2) - title2.length()) / 2;
            left2 = right2;
        } else {
            left2 = ((width - side * 2) - title2.length()) / 2;
            right2 = left2 + 1;
        }
        prompt(repeat(border, width));
        prompt(repeat(border, width));
        prompt(repeat(border, side) + repeat(" ", width - side * 2)
                + repeat(border, side));
        prompt(repeat(border, side) + repeat(" ", width - side * 2)
                + repeat(border, side));
        prompt(repeat(border, side) + repeat(" ", left1) + title1
                + repeat(" ", right1) + repeat(border, side));
        prompt(repeat(border, side) + repeat(" ", width - side * 2)
                + repeat(border, side));
        if (!title2.equals("")) {
            prompt(repeat(border, side) + repeat(" ", left2)
                    + title2 + repeat(" ", right2) + repeat(border, side));
            prompt(repeat(border, side) + repeat(" ", width - side * 2)
                    + repeat(border, side));
        }
        prompt(repeat(border, side) + repeat(" ", width - side * 2)
                + repeat(border, side));
        for (Object items : menuItems) {
            String listItem = count + ". " + items;
            offset = 68 - listItem.length();
            prompt(repeat(border, side) + repeat(" ", 6) + listItem
                    + repeat(" ", offset) + repeat(border, side));
            prompt(repeat(border, side) + repeat(" ", width - side * 2)
                    + repeat(border, side));
            count++;
        }
        prompt(repeat(border, side) + repeat(" ", width - side * 2)
                + repeat(border, side));
        prompt(repeat(border, side) + repeat(" ", width - side * 2)
                + repeat(border, side));
        prompt(repeat(border, width));
        prompt(repeat(border, width));
        return promptForIntInRange("\n\nPlease Enter Selection:  ", 1, menuItems.length,
                "\nSelection not avaialble.  Please make a selection between ");
    }

    public static String repeat(String str, int times) {
        return new String(new char[times]).replace("\0", str);
    }
}


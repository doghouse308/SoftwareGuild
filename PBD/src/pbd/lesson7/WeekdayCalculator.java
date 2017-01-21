package pbd.lesson7;

/**
 *
 * @author Paul Peterson
 */
import java.util.Scanner;

public class WeekdayCalculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Mr. Mitchell's fantastic birth-o-meter!");
        System.out.println();
        System.out.println("All you have to do is enter your birth date, and it will");
        System.out.println("tell you the day of the week on which you were born.");
        System.out.println();
        System.out.println("Some automatic tests....");
        System.out.println("12 10 2003 => " + weekday(12, 10, 2003));
        System.out.println(" 2 13 1976 => " + weekday(2, 13, 1976));
        System.out.println(" 2 13 1977 => " + weekday(2, 13, 1977));
        System.out.println(" 7  2 1974 => " + weekday(7, 2, 1974));
        System.out.println(" 1 15 2003 => " + weekday(1, 15, 2003));
        System.out.println("10 13 2000 => " + weekday(10, 13, 2000));
        System.out.println();

        System.out.println("Now it's your turn!  What's your birthday?");
        System.out.print("Birth date (mm dd yyyy): ");
        int mm = keyboard.nextInt();
        int dd = keyboard.nextInt();
        int yyyy = keyboard.nextInt();

        // put a function call for weekday() here
        System.out.println("You were born on " + weekday(mm, dd, yyyy));
    }

    public static String weekday(int mm, int dd, int yyyy) {
        int yy, total;
        String date = "";
        // bunch of calculations go here 
        yy = yyyy - 1900;
        total = (yy / 4) + yy + dd + month_offset(mm);
        if (is_leap(yyyy) && (mm == 1 || mm == 2)) {
            total--;
        }

        date = weekday_name(total % 7) + ", " + month_name(mm) + " " + dd + ", " + yyyy;

        return date;
    }

    public static boolean is_leap(int year) {
        // years which are evenly divisible by 4 are leap years,
        // but years divisible by 100 are not leap years,
        // though years divisible by 400 are leap years
        boolean result;

        if (year % 400 == 0) {
            result = true;
        } else if (year % 100 == 0) {
            result = false;
        } else if (year % 4 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public static String month_name(int month) {
        switch (month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                return "error";
        }
    }

    public static int month_offset(int month) {
        switch (month) {
            case 1:
                return 1;
            case 2:
                return 4;
            case 3:
                return 4;
            case 4:
                return 0;
            case 5:
                return 2;
            case 6:
                return 5;
            case 7:
                return 0;
            case 8:
                return 3;
            case 9:
                return 6;
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 6;
            default:
                return -1;
        }
    }

    public static String weekday_name(int weekday) {
        String result = "";
        if (weekday == 1) {
            result = "Sunday";
        } else if (weekday == 2) {
            result = "Monday";
        } else if (weekday == 3) {
            result = "Tuesday";
        } else if (weekday == 4) {
            result = "Wednesday";
        } else if (weekday == 5) {
            result = "Thursday";
        } else if (weekday == 6) {
            result = "Friday";
        } else if (weekday == 7 || weekday == 0) {
            result = "Saturday";
        } else if (weekday < 0 || weekday > 7) {
            result = "error";
        }
        return result;
    }
}

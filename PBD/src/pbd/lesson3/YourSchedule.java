package pbd.lesson3;

/**
 *
 * @author Paul Peterson
 */
public class YourSchedule {

    public static void main(String[] args) {
        String[] course = {"English III", "Precalculus", "Music Theory",
            "Biotechnology", "Principles of Technology I", "Latin II", "AP US History",
            "Business Computer Infomation Systems"};
        String[] instructor = {"Ms. Lapan", "Mrs. Gideon", "Mr. Davis", "Ms. Palmer ",
            "Ms. Garcia", "Mrs. Barnett", "Ms. Johannessen", "Mr. James"};

        //print top line
        System.out.print("+");
        for (int i = 0; i < 60;i++) {
            System.out.print("-");
        }
        System.out.println("+");
        
        //print schedule
        for (int i = 0; i < course.length; i++){
            System.out.printf("| %d | %-36s | %-15s |%n", i + 1, course[i], instructor[i]);
        }

        //print bottom line
        System.out.print("+");
        for (int i = 0; i < 60;i++) {
            System.out.print("-");
        }
        System.out.println("+");

    }
}

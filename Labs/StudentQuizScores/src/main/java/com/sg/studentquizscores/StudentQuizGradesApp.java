package com.sg.studentquizscores;

/**
 *
 * @author Paul Peterson
 */
public class StudentQuizGradesApp {

    public static void main(String[] args) {
        ConsoleIO cio = new ConsoleIO();

        StudentQuizGrades grades = new StudentQuizGrades();
        int selection = 0;
        boolean isSaved = false;

        while (selection != grades.menuItems.length) {
            selection = grades.displayMenu();

            switch (selection) {
                //add new student
                case 1:
                    grades.addStudent();
                    break;
                //retrieve all students    
                case 2:
                    grades.displayStudents(grades.retrieveStudentList("all"), false);
                    break;
                //retrieve quiz scores for individual student with average
                case 3:
                    String student = grades.searchStudent();
                    if (student.equalsIgnoreCase("error")) {
                        break;
                    }
                    grades.displayStudents(grades.retrieveStudentList(student), true);
                    break;
                //retrieve class stats
                case 4:
                    grades.displayClassStats();
                    break;
                //update student - modify name, quiz scores, add score 
                case 5:
                    student = grades.searchStudent();
                    if (student.equalsIgnoreCase("error")) {
                        break;
                    }
                    grades.updateStudent(student);
                    break;
                //delete student
                case 6:
                    student = grades.searchStudent();
                    if (student.equalsIgnoreCase("error")) {
                        break;
                    }
                    grades.deleteStudent(student);
                    break;
                //save file
                case 7:
                    grades.saveQuizScores();
                    isSaved = true;
                    break;
                //load file
                case 8:
                    grades.loadQuizScores();
                    break;
                //verify data saved and exit
                case 9:
                    if (!isSaved) {
                        if (cio.promptForBoolean("Save before exit (Y or N) ", "y")) {
                            grades.saveQuizScores();
                            isSaved = true;
                        }
                    }
                    break;
            }
        }

    }
}

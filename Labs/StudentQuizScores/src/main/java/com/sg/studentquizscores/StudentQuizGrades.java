package com.sg.studentquizscores;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Paul Peterson
 */
public class StudentQuizGrades {

    ConsoleIO cio = new ConsoleIO();

    Student student = new Student();
    HashMap<String, Student> classGrades = new HashMap();
    ArrayList<Integer> quizzes = new ArrayList();
    String[] menuItems = {"Add Student", "Retrieve All Students", "Retrieve Student Data",
        "Retrieve Class Stats", "Update Student", "Delete Student", "Save Data",
        "Load File", "Exit"};
    String title1 = "Main Menu";
    String title2 = "Student Quiz Scores";

    //generate and display menu
    public int displayMenu() {
        return cio.displayMenu(title1, title2, menuItems);
    }

    //add student
    public void addStudent() {
        String firstName;
        String lastName;
        String fullName;
        ArrayList<Integer> scores = new ArrayList();
        boolean enter = true;
        do {
            firstName = cio.promptForString("Student First Name:  ");
            lastName = cio.promptForString("Student Last Name:  ");

            if (classGrades.containsKey(lastName + firstName)) {
                cio.prompt("Record for " + firstName + " " + lastName
                        + " already exists");
                return;
            }
        } while (classGrades.containsKey(lastName + firstName));

        scores = enterQuizScores(scores);
        fullName = lastName + firstName;
        student = new Student(firstName, lastName, scores);
        classGrades.put(fullName, student);
    }

    //retrieve list of students
    public ArrayList<Student> retrieveStudentList(String name) {
        ArrayList<Student> studentList = new ArrayList();

        for (String key : classGrades.keySet()) {
            if (name.equalsIgnoreCase("all") || key.equalsIgnoreCase(name)) {
                studentList.add(classGrades.get(key));
            }
        }
        Comparator<Student> sortByLastName = (s, o) -> s.getLastName().compareToIgnoreCase(o.getLastName());
        return studentList;
    }

    //search for student
    public String searchStudent() {
        String firstName = "";
        String lastName = "";
        boolean isValid = false;

        while (!isValid || !classGrades.containsKey(lastName + firstName)) {
            cio.prompt("Enter Student's name or 'exit' to return to Main Menu");
            firstName = cio.promptForString("Student First Name:  ");
            if (firstName.equalsIgnoreCase("exit")) {
                return "error";
            }
            lastName = cio.promptForString("Student Last Name:  ");
            if (firstName.equalsIgnoreCase("exit") || lastName.equalsIgnoreCase("exit")) {
                return "error";
            }
            if (!classGrades.containsKey(lastName + firstName)) {
                cio.prompt("No Record for " + firstName + " " + lastName + ".");
            }
            isValid = true;
        }
        return lastName + firstName;
    }

    //display student information
    public void displayStudents(ArrayList<Student> studentList, boolean scores) {
        DecimalFormat df = new DecimalFormat("0.00");
        double total = 0;
        for (Student s : studentList) {
            cio.prompt(s.getLastName() + ", " + s.getFirstName());
            if (scores) {
                cio.prompt("Quiz Scores:");
                cio.inlinePrompt("\t");
                for (int score : s.getQuizzes()) {
                    cio.inlinePrompt(score + " ");
                    total += score;
                }
                cio.prompt("\n\tAverage:  " + df.format(total / s.getQuizzes().size()));
            }
        }
    }

    //display class stats
    public void displayClassStats() {
        DecimalFormat df = new DecimalFormat("0.00");
        ArrayList<Student> studentList = new ArrayList();
        String highName = "", lowName = "";
        int highScore = 0, lowScore = 100, numQuiz = 0;
        double classTotal = 0, total = 0;

        studentList = retrieveStudentList("all");

        for (Student s : studentList) {
            int count = 1;
            numQuiz = s.getQuizzes().size();
            cio.prompt(s.getLastName() + ", " + s.getFirstName());
            cio.prompt("Quiz Scores:");
            cio.inlinePrompt("\t");
            for (int score : s.getQuizzes()) {
                if (score < lowScore) {
                    lowScore = score;
                    lowName = s.getFirstName() + " " + s.getLastName();
                }
                if (score > highScore) {
                    highScore = score;
                    highName = s.getFirstName() + " " + s.getLastName();
                }
                cio.inlinePrompt(score + " ");
                if (count % 10 == 0) {
                    cio.prompt("");
                    cio.inlinePrompt("\t");
                }
                total += score;
            }
            cio.prompt("\n\tAverage:  " + df.format(total / s.getQuizzes().size()) + "\n");
            classTotal += total;
            total = 0;
        }
        cio.prompt("\nClass Average:  " + df.format(classTotal / (studentList.size() * numQuiz)));
        cio.prompt("\n\t" + highName + " has the higest quiz score:  " + highScore);
        cio.prompt("\n\t" + lowName + " has the lowest quiz score:  " + lowScore);
    }

    //update Student
    public void updateStudent(String name) {
        int selection = 0;
        Student editStudent = classGrades.get(name);
        String editTitle1 = "Update Student Menu";
        String editTitle2 = "Edit Record for " + editStudent.getFirstName()
                + " " + editStudent.getLastName();
        String[] editMenuItems = {"Change Name", "Modify Quiz Score", "Add Quiz Score",
            "Change Student", "Exit"};
        while (selection != editMenuItems.length) {
            selection = cio.displayMenu(editTitle1, editTitle2, editMenuItems);

            switch (selection) {
                //edit name
                case 1:
                    if (editName(editStudent)) {
                        classGrades.remove(name);
                        classGrades.put(editStudent.getLastName() + editStudent.getFirstName(), editStudent);
                    }
                    break;
                //edit scores
                case 2:
                    editStudent.setQuizzes(editQuizScores(editStudent.getQuizzes()));
                    break;
                //add scores
                case 3:
                    editStudent.setQuizzes(enterQuizScores(editStudent.getQuizzes()));
                    break;
                //edit different student
                case 4:
                    classGrades.put(editStudent.getLastName() + editStudent.getFirstName(), editStudent);
                    updateStudent(searchStudent());
                    break;
                //exit
                case 5:
                    cio.prompt("\nReturning to Main Menu\n");
                    return;
            }
        }

    }

    //edit student name
    private boolean editName(Student editStudent) {
        boolean isChanged = false;
        if (cio.promptForBoolean("Current First Name:  (" + editStudent.getFirstName()
                + ") Change ( Y or N) ", "y")) {
            editStudent.setFirstName(cio.promptForString("New First Name:  "));
            isChanged = true;
        }
        if (cio.promptForBoolean("Current Last Name:  (" + editStudent.getLastName()
                + ") Change ( Y or N) ", "y")) {
            editStudent.setLastName(cio.promptForString("New Last Name:  "));
            isChanged = true;
        }
        return isChanged;
    }

    //edit quiz scores
    private ArrayList<Integer> editQuizScores(ArrayList<Integer> qScores) {
        ArrayList<Integer> newScores = new ArrayList();
        int count = 1;
        for (int eScores : qScores) {
            if (cio.promptForBoolean("Score for Quiz " + count + ":  (" + eScores
                    + ") Change ( Y or N) ", "y")) {
                qScores.set(count - 1, cio.promptForIntInRange("New Score:  ", 0, 100));
            }
            count++;
        }
        return qScores;
    }

    //delete student
    public void deleteStudent(String name) {
        classGrades.remove(name);
    }

    //save file
    public void saveQuizScores() {
        String fileName = cio.promptForString("Enter file name to save data:  ");
        try (PrintWriter out = new PrintWriter(new FileWriter(fileName))) {
            for (HashMap.Entry<String, Student> entry : classGrades.entrySet()) {
                out.println(encode(entry.getKey(), entry.getValue()));
            }
            out.flush();
            System.out.println("Data Saved");
        } catch (IOException ex) {
            Logger.getLogger(StudentQuizGrades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //load file
    public void loadQuizScores() {
        classGrades.clear();;
        String fileName = "";
        File file = new File(fileName);
        String currentLine = "";
        do {
            fileName = cio.promptForString("Enter file name:  ");
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
                decode(currentLine.split("::"));
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudentQuizGrades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //enter quiz scores
    private ArrayList<Integer> enterQuizScores(ArrayList<Integer> scores) {
        ArrayList<Integer> quizScores = new ArrayList();
        int score = 1, min = 0, max = 100;
        if (scores.isEmpty()) {
            while (cio.promptForBoolean("Enter Score (Y or N):  ", "y")) {
                score = cio.promptForIntInRange("\nEnter Quiz Score:  ", min, max);
                quizScores.add(score);
            }
        } else {
            int count = 1;
            for (int quizScore : scores) {
                cio.prompt("Quiz " + count + ":  " + quizScore);
                quizScores.add(quizScore);
                count++;
            }
            while (cio.promptForBoolean("Enter Score (Y or N):  ", "y")) {
                score = cio.promptForIntInRange("\nEnter Quiz Score:  ", min, max);
                quizScores.add(score);
            }
        }

        return quizScores;
    }

    //encode entry
    private String encode(String studentKey, Student encodeStudent) {
        String message = studentKey + "::" + encodeStudent.getFirstName()
                + "::" + encodeStudent.getLastName();
        for (int score : encodeStudent.getQuizzes()) {
            message += "::" + score;
        }

        return message;
    }

    //decode line
    private void decode(String[] newRecord) {
        ArrayList<Integer> sQuizzes = new ArrayList();
        for (int i = 3; i < newRecord.length; i++) {
            sQuizzes.add(Integer.parseInt(newRecord[i]));
        }
        Student loadStudent = new Student(newRecord[1], newRecord[2], sQuizzes);
        classGrades.put(newRecord[2] + newRecord[1], loadStudent);
    }
}

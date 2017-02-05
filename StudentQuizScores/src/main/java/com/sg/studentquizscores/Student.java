
package com.sg.studentquizscores;

import java.util.ArrayList;

/**
 *
 * @author Paul Peterson
 */
public class Student {
    
    private String firstName;
    private String lastName;
    private ArrayList<Integer> quizzes;

    public Student(){
        
    }

    public Student(String firstName, String lastName, ArrayList<Integer> quizzes) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.quizzes = quizzes;
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return the quizzes
     */
    public ArrayList<Integer> getQuizzes() {
        return quizzes;
    }

    /**
     * @param quizzes the quizzes to set
     */
    public void setQuizzes(ArrayList<Integer> quizzes) {
        this.quizzes = quizzes;
    }
    
}

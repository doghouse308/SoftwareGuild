package pbd.records;

/**
 *
 * @author Paul Peterson
 */
public class Student2 {
    
    private int studentId;
    private int gradeNumber;
    private double grade;
    private String letterGrade;
    
    public Student2(){
        
    }
    
    public Student2(int id, int gNum, double grade, String lGrade){
        this.studentId = id;
        this.gradeNumber = gNum;
        this.grade = grade;
        this.letterGrade = lGrade;
    }

    /**
     * @return the studentId
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * @param studentId the studentId to set
     */
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    /**
     * @return the gradeNumber
     */
    public int getGradeNumber() {
        return gradeNumber;
    }

    /**
     * @param gradeNumber the gradeNumber to set
     */
    public void setGradeNumber(int gradeNumber) {
        this.gradeNumber = gradeNumber;
    }

    /**
     * @return the grade
     */
    public double getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(double grade) {
        this.grade = grade;
    }

    /**
     * @return the letterGrade
     */
    public String getLetterGrade() {
        return letterGrade;
    }

    /**
     * @param letterGrade the letterGrade to set
     */
    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }
}


package pbd.lesson9;

/**
 *
 * @author Paul Peterson
 */
public class Person {
    
    private String name;
    private int age;

    public Person(){
        
    }
    
    public Person (String pName, int pAge){
        this.name = pName;
        this.age = pAge;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }
    
}

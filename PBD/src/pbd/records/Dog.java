
package pbd.records;

/**
 *
 * @author Paul Peterson
 */
public class Dog {
    
    private String breed;
    private int age;
    private double weight;
    
    public Dog(){
        
    }
    
    public Dog(String dogBreed, int dogAge, double dogWeight){
        this.breed = dogBreed;
        this.age = dogAge;
        this.weight = dogWeight;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
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

    /**
     * @return the weight
     */
    public double getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }
}

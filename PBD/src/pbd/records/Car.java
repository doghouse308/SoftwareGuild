
package pbd.records;

/**
 *
 * @author Paul Peterson
 */
public class Car {
    
    private String make;
    private String model;
    private int year;
    private String licensePlate;
    
    public Car(){
        
    }
    
    public Car(String cMake, String cModel, int cYear, String cPlate){
        this.make = cMake;
        this.model = cModel;
        this.year = cYear;
        this.licensePlate = cPlate;
    }

    @Override
    public String toString(){
        return "\n\tMake:  " + this.make + "\n\tModel:  " + this.model 
                + "\n\tYear:  " + this.year + "\n\tLicense:  " + this.licensePlate;
    }
    public String encode(Car car){
        return this.make + "::" + this.model + "::" + this.year + "::" + this.licensePlate;
    }
    /**
     * @return the make
     */
    public String getMake() {
        return make;
    }

    /**
     * @param make the make to set
     */
    public void setMake(String make) {
        this.make = make;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the licensePlate
     */
    public String getLicensePlate() {
        return licensePlate;
    }

    /**
     * @param licensePlate the licensePlate to set
     */
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    
}

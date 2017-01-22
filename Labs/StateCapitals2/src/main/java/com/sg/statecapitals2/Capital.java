
package com.sg.statecapitals2;

/**
 *
 * @author Paul Peterson
 */
public class Capital {
    
    private String name;
    private int population;
    private double sqMiles;
    
    public Capital(){
        
    }

    public Capital(String name, int population, double sqMiles) {
        this.name = name;
        this.population = population;
        this.sqMiles = sqMiles;
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
     * @return the population
     */
    public int getPopulation() {
        return population;
    }

    /**
     * @param population the population to set
     */
    public void setPopulation(int population) {
        this.population = population;
    }

    /**
     * @return the sqMiles
     */
    public double getSqMiles() {
        return sqMiles;
    }

    /**
     * @param sqMiles the sqMiles to set
     */
    public void setSqMiles(double sqMiles) {
        this.sqMiles = sqMiles;
    }
    
}


package com.sg.vendingmachine.dto;

/**
 *
 * @author Paul Peterson
 */
public class Change {
    
    private int dollar;
    private int quarter;
    private int dime;
    private int nickel;
    
    public Change(){
        
    }

    public Change(int dollar, int quarter, int dime, int nickle) {
        this.dollar = dollar;
        this.quarter = quarter;
        this.dime = dime;
        this.nickel = nickle;
    }

    /**
     * @return the dollar
     */
    public int getDollar() {
        return dollar;
    }

    /**
     * @param dollar the dollar to set
     */
    public void setDollar(int dollar) {
        this.dollar = dollar;
    }

    /**
     * @return the quarter
     */
    public int getQuarter() {
        return quarter;
    }

    /**
     * @param quarter the quarter to set
     */
    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    /**
     * @return the dime
     */
    public int getDime() {
        return dime;
    }

    /**
     * @param dime the dime to set
     */
    public void setDime(int dime) {
        this.dime = dime;
    }

    /**
     * @return the nickel
     */
    public int getNickel() {
        return nickel;
    }

    /**
     * @param nickel the nickel to set
     */
    public void setNickel(int nickel) {
        this.nickel = nickel;
    }
    
    @Override
    public String toString(){
        return "Change Returned:\n\n\tDollars:  " + dollar + "\n\tQuarters:  "
                + quarter + "\n\tDimes:  " + dime + "\n\tNickels:  " + nickel;
    }
}

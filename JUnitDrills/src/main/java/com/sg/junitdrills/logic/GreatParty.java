/*
When squirrels get together for a party, they like to have cigars. A squirrel 
party is successful when the number of cigars is between 40 and 60, inclusive. 
Unless it is the weekend, in which case there is no upper bound on the number of
cigars.

Return true if the party with the given values is successful, or false otherwise. 

GreatParty(30, false) → false
GreatParty(50, false) → true
GreatParty(70, true) → true

public boolean GreatParty(int cigars, boolean isWeekend) {
  
}
 */
package com.sg.junitdrills.logic;

/**
 *
 * @author Paul Peterson
 */
public class GreatParty {

    public boolean greatParty(int cigars, boolean isWeekend) {
        int min = 40, max = 60;
        return (!isWeekend && (cigars >= min && cigars <= max))
                || (isWeekend && cigars >= min);
    }
}

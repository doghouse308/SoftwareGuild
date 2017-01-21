/*
You and your date are trying to get a table at a restaurant. The parameter 
"you" is the stylishness of your clothes, in the range 0..10, and "date" is the
stylishness of your date's clothes. The result getting the table is encoded as 
an int value with 0=no, 1=maybe, 2=yes. If either of you is very stylish, 
8 or more, then the result is 2 (yes). With the exception that if either of you 
has style of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe). 

CanHazTable(5, 10) → 2
CanHazTable(5, 2) → 0
CanHazTable(5, 5) → 1

public int CanHazTable(int yourStyle, int dateStyle) {
  
}
 */
package com.sg.junitdrills.logic;

/**
 *
 * @author Paul Peterson
 */
public class CanHazTable {

    public int canHazTable(int yourStyle, int dateStyle) {
        int min = 2, max = 8;
        if (yourStyle <= min || dateStyle <= min){
            return 0;
        } else if (yourStyle >= max || dateStyle >= max ){
            return 2;
        } else {
            return 1;
        }
    }
}

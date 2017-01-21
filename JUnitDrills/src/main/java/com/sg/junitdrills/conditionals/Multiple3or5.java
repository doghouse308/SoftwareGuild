/*
Return true if the given non-negative number is a multiple of 3 or a multiple
of 5. Use the % "mod" operator

Multiple3or5(3) -> true
Multiple3or5(10) -> true
Multiple3or5(8) -> false

public boolean Multiple3or5(int number) {

}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class Multiple3or5 {

    public boolean multiple3or5(int number) {
        return ((Math.abs(number) % 3 == 0) || (Math.abs(number) % 5 == 0));
    }
}

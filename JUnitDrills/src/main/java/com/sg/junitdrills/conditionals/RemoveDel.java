/*
Given a string, if the string "del" appears starting at index 1, return a string
where that "del" has been deleted. Otherwise, return the string unchanged. 

RemoveDel("adelbc") -> "abc"
RemoveDel("adelHello") -> "aHello"
RemoveDel("adedbc") -> "adedbc"

public string RemoveDel(string str) {

}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class RemoveDel {

    public String removeDel(String str) {
        if (str.substring(1, 4).equalsIgnoreCase("del")) {
            return str.replace(str.substring(1, 4), "");
        } else {
            return str;
        }
    }
}

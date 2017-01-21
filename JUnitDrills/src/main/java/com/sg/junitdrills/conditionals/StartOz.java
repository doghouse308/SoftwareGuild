/*
Given a string, return a string made of the first 2 chars (if present),
however include first char only if it is 'o' and include the second only if it 
is 'z', so "ozymandias" yields "oz". 

StartOz("ozymandias") -> "oz"
StartOz("bzoo") -> "z"
StartOz("oxx") -> "o"

public string StartOz(string str) {

}
 */
package com.sg.junitdrills.conditionals;

/**
 *
 * @author Paul Peterson
 */
public class StartOz {

    public String startOz(String str) {
        String r = "";
        if (str.length() < 2){
            if (str.isEmpty()){
                return str;
            } else if (Character.toString(str.charAt(0)).equalsIgnoreCase("o")){
                r += "o";
            }
        } else {
            if (str.substring(0,1).equalsIgnoreCase("o")){
                r += "o";
            }
            if (str.substring(1,2).equalsIgnoreCase("z")){
                r += "z";
            }
        }
        return r;
    }

}

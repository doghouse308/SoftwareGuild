/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... 
so "kittens" yields "kien". 

AltPairs("kitten") -> "kien"
AltPairs("Chocolate") -> "Chole"
AltPairs("CodingHorror") -> "Congrr"

public string AltPairs(string str) {

}
 */
package com.sg.junitdrills.loops;

/**
 *
 * @author Paul Peterson
 */
public class AltPairs {

    public String altPairs(String str) {
        String r = "";
        int count = 0;
        for (int i = 0; i < str.length(); i = i + 2){
            if (i + 2 < str.length()){
                if (count % 2 == 0){
                    r += str.substring(i, i + 2);
                }
            } else {
                if (count % 2 == 0){
                    r += str.substring(i);
                }                
            }
            count ++;
        }
        return r;
    }
}

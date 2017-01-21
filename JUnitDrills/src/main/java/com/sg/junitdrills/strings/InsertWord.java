/*
Given an "out" string length 4, such as "<<>>", and a word, return a new string 
where the word is in the middle of the out string, e.g. "<<word>>".

Hint: Substrings are your friend here 

InsertWord("<<>>", "Yay") -> "<<Yay>>"
InsertWord("<<>>", "WooHoo") -> "<<WooHoo>>"
InsertWord("[[]]", "word") -> "[[word]]"

public string InsertWord(string container, string word) 
 */
package com.sg.junitdrills.strings;

/**
 *
 * @author Paul Peterson
 */
public class InsertWord {
    
    public String insertWord(String out, String word){
        return out.substring(0, 2) + word + out.substring(out.length() - 2);
    }
    
}

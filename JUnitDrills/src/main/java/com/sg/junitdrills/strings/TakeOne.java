/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.junitdrills.strings;

/**
 *
 * @author Paul Peterson
 */
public class TakeOne {
    
    public String takeOne(String str, boolean fromFront) {
        if (fromFront) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }
}

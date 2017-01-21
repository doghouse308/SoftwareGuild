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
public class MiddleTwo {

    public String middleTwo(String str) {
        return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
    }
}

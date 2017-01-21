/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbd.lesson5;

/**
 *
 * @author Paul Peterson
 */
public class CompareToChallenge {
    public static void main(String[] args) {
        
        String str1 = "cat", str2 = "dog", str3 = "apple", str4 = "bananna";
        
        System.out.println("Comparing \"zebra\" to \"alpha\" yields " + "zebra".compareTo("alpha"));
        System.out.println("Comparing \"abc\" to \"def\" yields " + "abc".compareTo("def"));
        System.out.println("Comparing \"dog\" to \"god\" yields " + "dog".compareTo("god"));
        System.out.println("Comparing \"blue\" to \"aqua\" " + "zebra".compareTo("aqua"));
        System.out.println("Comparing \"red\" to \"yellow\" yields " + "red".compareTo("yellow"));
        System.out.println("Comparing \"PURPLE\" to \"purple\" yields " + "PURPLE".compareTo("purple"));
        System.out.println("Comparing \"zebra\" to \"zebra\" yields " + "zebra".compareTo("zebra"));
        System.out.println("Comparing \"apple\" to \"apple\" yields " + str3.compareTo("apple"));
        System.out.println("Comparing \"" + str4 + "\" to \"amber\" yields " + str4.compareTo("amber"));
        System.out.println("Comparing \"" + str2 + "\" to \"" + str1 + "\" yields " + str2.compareTo(str1));
        System.out.println("Comparing \"Alabama\" to \"Alaska\" yields " + "Alabama".compareTo("Alaska"));
        System.out.println("Comparing \"North Dakota\" to \"North Carolina\" yields " + "North Dakota".compareTo("North Carolina"));
    }
}

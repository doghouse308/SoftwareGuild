/*
Create an ArrayList of Integers. Fill up the list with 1,000 random numbers, 
each from 10 to 99. Then display the contents of the ArrayList on the screen in 
any way you like.
 */
package pbd.arraylists;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Paul Peterson
 */
public class BasicArraylists3 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> a3 = new ArrayList();
        Random r = new Random();
        int aSize = 1000;
        
        for (int i = 0; i < aSize; i ++) {
            a3.add(i, 1 + r.nextInt(10));
        }
        for (int i = 0; i < a3.size(); i ++){
            System.out.printf("%2d, ", a3.get(i));
            if ((i + 1) % 20 == 0){
                System.out.println("");
            }
        }
        System.out.println("");
    }
    
}

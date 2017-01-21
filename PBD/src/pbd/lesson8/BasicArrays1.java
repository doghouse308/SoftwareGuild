
package pbd.lesson8;

/**
 *
 * @author Paul Peterson
 */
public class BasicArrays1 {
    
    public static void main(String[] args) {
        
        int [] number = {-113, -113, -113, -113, -113, -113, -113, -113, -113, -113};
        
        for (int i = 0; i < number.length; i++){
            System.out.printf("Slot %d contains %d%n", i, number[i]);  
        }
    }
    
}

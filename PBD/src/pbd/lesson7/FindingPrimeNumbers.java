
package pbd.lesson7;

/**
 *
 * @author Paul Peterson
 */
public class FindingPrimeNumbers {
    
    public static void main(String[] args) {
        
        for (int i = 2; i < 100; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
    
    public static boolean isPrime(int n){
        for (int p = 2; p <= n / 2; p++){
            if (n % p == 0){
                return false;
            }
        }
        return true;
    }
    
}

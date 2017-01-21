package javaobjectorientedconcepts;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Paul Peterson
 */
public class Factorizor {

    ArrayList<Integer> factors = new ArrayList();

    boolean isPrime = false, isPerfect = false;

    public void factorize(int number) {

        for (int i = number - 1; i >= 1; i--) {
            if (isFactor(number, i)) {
                factors.add(i);
            }
        }
        Collections.sort(factors);
        displayResults(number, factors, isPrime(factors), isPerfect(factors, number));
    }

    public void displayResults(int number, ArrayList<Integer> factors, boolean prime, boolean perfect) {
        System.out.println("The factors of " + number + " are:");
        for (int n : factors) {
            System.out.print(n + " ");
        }
        System.out.println("");
        if (prime) {
            System.out.println(number + " is a priome number");
        } else {
            System.out.println(number + " ia not a prime number");
        }
        if (perfect) {
            System.out.println(number + " is a perfect number");
        } else {
            System.out.println(number + " ia not a perfect number");
        }
    }

    public boolean isPrime(ArrayList<Integer> factors) {
        return factors.size() == 1;
    }

    public boolean isPerfect(ArrayList<Integer> factors, int number) {
        int temp = 0;
        for (int n : factors) {
            temp += n;
        }
        return temp == number;
    }

    public boolean isFactor(int number, int test) {
        return number % test == 0;
    }
}

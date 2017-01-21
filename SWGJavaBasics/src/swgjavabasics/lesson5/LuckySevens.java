package swgjavabasics.lesson5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class LuckySevens {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        Random rand = new Random();

        //variable declaration
        int die1, die2, startingBank = 0, balance, rolls = 0, maxBank = 0,
                maxRolls = 0;
        
        //set starting value
        do {
            System.out.print("How much money can you afford to lose?  ");
            startingBank = Integer.parseInt(kb.next());
            if (startingBank < 1) {
                System.out.println("Nice try, please enter a number larger than 1");
            } else {
            }
        } while (startingBank < 1);
        
        balance = startingBank;
        maxBank = balance;
        
        //run game
        while (balance > 1){
            
            die1 = rand.nextInt(6) + 1;
            die2 = rand.nextInt(6) + 1;
            rolls ++;
            
            if ( die1 + die2 == 7){
                balance += 4;
            } else {
                balance --;
            }
            
            if (balance > maxBank) {
                maxBank = balance;
                maxRolls = rolls;
            }
        }
        
        //dsiplay results
        System.out.printf("%nYou busted in %d rolls%n%n", rolls);
        System.out.printf("You should have stopped after %d rolls when you had"
                + " $%d.00 %n%n", maxRolls, maxBank);
    }

}

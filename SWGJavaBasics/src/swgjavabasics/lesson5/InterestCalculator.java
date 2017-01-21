
package swgjavabasics.lesson5;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class InterestCalculator {

    public static void main(String[] args) {

        double annualRate, principal, balance;
        int nYears, periods;
        Calendar calendar = new GregorianCalendar();
        int year = calendar.get(Calendar.YEAR);
        String sYear = "Year", sPrincipal = "Principal", sInterest = "Interest",
                sBalance = "Balance";
        Scanner kb = new Scanner(System.in);

        //user input
        System.out.print("Annual Interest Rate:  ");
        annualRate = Double.parseDouble(kb.next());
        System.out.print("Initial Principal:  ");
        principal = Double.parseDouble(kb.next());
        System.out.print("Years to Invest:  ");
        nYears = Integer.parseInt(kb.next());
        System.out.print("Compounding Periods 1 = Quarterly, 2 = Monthly, 3 = Daily:  ");
        periods = Integer.parseInt(kb.next());
        switch (periods) {
            case 1:
                periods = 4;
                break;
            case 2:
                periods = 12;
                break; 
            case 3:
                periods = 360;
                break;
            default:
                periods = 1;
                break;
        }
        balance = principal;
        
        System.out.printf("%4s %18s %11s %18s%n", sYear, sPrincipal, sInterest,sBalance );
        for (int s = 0; s < 55; s++){
            System.out.print("-");
        }
        System.out.println("");
        
        for (int i = 0; i < nYears; i++) {
            double temp = principal;
            for (int j = 1; j <= periods; j++){
                temp = balance * ( 1 + ((annualRate / periods) / 100));
                balance = temp;
            }

            System.out.printf("%d | $%15.2f | $%8.2f | $%15.2f%n", year + i,
                    principal, balance - principal, balance);
            principal = balance;
        }
    }

}

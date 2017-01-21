package javaobjectorientedconcepts;

import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Paul Peterson
 */
public class InterestCalculator {

    ConsoleIO c = new ConsoleIO();
    Calendar calendar = new GregorianCalendar();

    private double principal;
    private double balance;
    private double annualInterest;
    private int periods;
    private int years;
    private int year = calendar.get(Calendar.YEAR);

    public void run() {
        enterData();
        System.out.printf("%4s %18s %11s %18s%n", "Year", "Principal", "Interest", "Balance");
        balance = principal;
        for (int i = 0; i < years; i++) {
            calculateBalance();
            System.out.printf("%d | $%15.2f | $%8.2f | $%15.2f%n", year + i,
                    principal, balance - principal, balance);
            principal = balance;
        }

    }

    public void enterData() {
        String[] periodNames = {"annual", "quarterly", "monthly", "daily"};
        String periodName = "";
        principal = c.promptForDoubleInRange("Initial Investment:  ", 0, 1000000000);
        annualInterest = c.promptForDoubleInRange("Annual Interest Rate:  ", 0, 25);
        while (!Arrays.asList(periodNames).contains(periodName)) {
            periodName = c.promptForString("Compounding Periods:  ").toLowerCase();
            if (!Arrays.asList(periodNames).contains(periodName)) {
                c.prompt("Please enter valid compound period \"Annual\", \"Quarterly\", "
                        + "\"Monthly\", \"Daily\"");
            }
        }
        setYears(c.promptForIntInRange("Years to Invest:  ", 1, 100));
        switch (periodName) {
            case "annual":
                periods = 1;
                break;
            case "quarterly":
                periods = 4;
                break;
            case "monthly":
                periods = 12;
                break;
            case "daily":
                periods = 360;
                break;
        }
    }

    public void calculateBalance() {
        double temp = principal;
        for (int i = 1; i <= periods; i++) {
            temp = balance * (1 + ((annualInterest / periods) / 100));
            balance = temp;
        }
    }

    /**
     * @return the principal
     */
    public double getPrincipal() {
        return principal;
    }

    /**
     * @param principal the principal to set
     */
    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the annualInterest
     */
    public double getAnnualInterest() {
        return annualInterest;
    }

    /**
     * @param annualInterest the annualInterest to set
     */
    public void setAnnualInterest(double annualInterest) {
        this.annualInterest = annualInterest;
    }

    /**
     * @return the periods
     */
    public int getPeriods() {
        return periods;
    }

    /**
     * @param periods the periods to set
     */
    public void setPeriods(int periods) {
        this.periods = periods;
    }

    /**
     * @return the years
     */
    public int getYears() {
        return years;
    }

    /**
     * @param years the years to set
     */
    public void setYears(int years) {
        this.years = years;
    }

}

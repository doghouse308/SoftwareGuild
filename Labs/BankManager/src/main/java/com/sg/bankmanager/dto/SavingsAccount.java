package com.sg.bankmanager.dto;

/**
 *
 * @author Paul Peterson
 */
public class SavingsAccount extends Account {

    private double interestRate;
    private double interestEarned;

    public SavingsAccount(){
        
    }
    
    public SavingsAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    public void addInterest() {
        interestEarned += balance * interestRate;
        balance += interestEarned;
    }

}

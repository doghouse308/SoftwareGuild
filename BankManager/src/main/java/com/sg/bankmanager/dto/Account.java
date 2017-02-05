package com.sg.bankmanager.dto;

/**
 *
 * @author Paul Peterson
 */
public class Account {

    private final int PIN = 1234;
    protected int accountNumber;
    protected String name;
    protected double balance;
    protected boolean isLocked;
    

    public Account() {

    }

    public Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
        this.isLocked = false;
    }

    public void deposit(double amount, boolean isTransfer) {
        balance += amount;
        if (amount >= 10000 && !isTransfer) {
            isLocked = true;
        }
    }

    public void withdraw(double amount, String acctTpye) {
        if (balance >= amount) {
            balance -= amount;
        }
    }

    /**
     * @return the accountNumber
     *
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the isLocked
     */
    public boolean isLocked() {
        return isLocked;
    }

    /**
     * @param isLocked the isLocked to set
     */
    public void setIsLocked(boolean isLocked) {
        this.isLocked = isLocked;
    }

    /**
     * @return the PIN
     */
    public int getPIN() {
        return PIN;
    }

}

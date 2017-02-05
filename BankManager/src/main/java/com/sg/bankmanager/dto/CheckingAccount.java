package com.sg.bankmanager.dto;

/**
 *
 * @author Paul Peterson
 */
public class CheckingAccount extends Account {

    private int OVERDRAFT_FEE = 10;
    private int OVERDRAFT_PROTECTION = 100;
    private boolean overdrawn;

    public CheckingAccount() {

    }

    public CheckingAccount(int accountNumber, String name, double balance) {
        super(accountNumber, name, balance);
    }

    @Override
    public void withdraw(double amount, String acctTpye) {
        if (amount > balance && amount <= balance + getOVERDRAFT_PROTECTION()) {
            setOverdrawn(true);
            balance -= (amount + 10);
        }
        if (balance >= amount) {
            balance -= amount;
        }
    }

    /**
     * @return the OVERDRAFT_FEE
     */
    public int getOVERDRAFT_FEE() {
        return OVERDRAFT_FEE;
    }

    /**
     * @param OVERDRAFT_FEE the OVERDRAFT_FEE to set
     */
    public void setOVERDRAFT_FEE(int OVERDRAFT_FEE) {
        this.OVERDRAFT_FEE = OVERDRAFT_FEE;
    }

    /**
     * @return the OVERDRAFT_PROTECTION
     */
    public int getOVERDRAFT_PROTECTION() {
        return OVERDRAFT_PROTECTION;
    }

    /**
     * @param OVERDRAFT_PROTECTION the OVERDRAFT_PROTECTION to set
     */
    public void setOVERDRAFT_PROTECTION(int OVERDRAFT_PROTECTION) {
        this.OVERDRAFT_PROTECTION = OVERDRAFT_PROTECTION;
    }

    /**
     * @return the overdrawn
     */
    public boolean isOverdrawn() {
        return overdrawn;
    }

    /**
     * @param overdrawn the overdrawn to set
     */
    public void setOverdrawn(boolean overdrawn) {
        this.overdrawn = overdrawn;
    }
}

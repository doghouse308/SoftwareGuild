
package com.sg.bankmanager.ops;

import com.sg.bankmanager.controller.ConsoleIO;
import com.sg.bankmanager.dto.Account;
import com.sg.bankmanager.dto.CheckingAccount;
import com.sg.bankmanager.dto.SavingsAccount;

/**
 *
 * @author Paul Peterson
 */
public class BankManager {

    ConsoleIO cio = new ConsoleIO();
    Account account = new Account();
    CheckingAccount checking = new CheckingAccount();
    SavingsAccount savings = new SavingsAccount();
    private int loginAttempt = 0;

    public void initializeAccounts() {
        checking = new CheckingAccount(123456, "Paul Peterson", 5000);
        savings = new SavingsAccount(456789, "Paul Peterson", 20000);
    }

    public boolean login(String title1, String title2) {
        String loginPrompt = "\n\nPlease Enter PIN:  ";
        int side = 3;
        int width = 60;
        String border = "*";
        int right1 = 0, left1 = 0, right2 = 0, left2 = 0;
        if (title1.length() % 2 == 0) {
            right1 = ((width - side * 2) - title1.length()) / 2;
            left1 = right1;
        } else {
            left1 = ((width - side * 2) - title1.length()) / 2;
            right1 = left1 + 1;
        }
        if (title2.length() % 2 == 0) {
            right2 = ((width - side * 2) - title2.length()) / 2;
            left2 = right2;
        } else {
            left2 = ((width - side * 2) - title2.length()) / 2;
            right2 = left2 + 1;
        }
        cio.prompt(ConsoleIO.repeat(border, width));
        cio.prompt(ConsoleIO.repeat(border, width));
        cio.prompt(cio.repeat(border, side) + cio.repeat(" ", width - side * 2)
                + cio.repeat(border, side));
        cio.prompt(cio.repeat(border, side) + cio.repeat(" ", width - side * 2)
                + cio.repeat(border, side));
        cio.prompt(cio.repeat(border, side) + cio.repeat(" ", left1) + title1
                + cio.repeat(" ", right1) + cio.repeat(border, side));
        cio.prompt(cio.repeat(border, side) + cio.repeat(" ", width - side * 2)
                + cio.repeat(border, side));
        cio.prompt(cio.repeat(border, side) + cio.repeat(" ", width - side * 2)
                + cio.repeat(border, side));
        if (!title2.equals("")) {
            cio.prompt(cio.repeat(border, side) + cio.repeat(" ", left2)
                    + title2 + cio.repeat(" ", right2) + cio.repeat(border, side));
        }
        cio.prompt(cio.repeat(border, side) + cio.repeat(" ", width - side * 2)
                + cio.repeat(border, side));
        cio.prompt(cio.repeat(border, side) + cio.repeat(" ", width - side * 2)
                + cio.repeat(border, side));
        cio.prompt(ConsoleIO.repeat(border, width));
        cio.prompt(ConsoleIO.repeat(border, width));
        int pin = cio.promptForInt(loginPrompt);
        if (pin != account.getPIN()) {
            loginAttempt++;
        }
        if (getLoginAttempt() == 3) {
            cio.prompt("Too many failed login attempts.  Account locked");
            account.setIsLocked(true);
            return true;
        }
        return pin == account.getPIN();
    }

    //verify acct status
    public boolean verifyStatus(String transactionType, String acctType) {
        boolean r = true;
        if (account.isLocked()) {
            cio.prompt("Account Locked.  Please contact the Bank Manager");
            r = false;
        }
        if (checking.isOverdrawn() && acctType.equalsIgnoreCase("checking")) {
            cio.prompt("Account is overdrawn, please make deposit");
            r = false;
        }
        return r;
    }

    //deposit
    public void depositToAcct(double amount, String toAcct, boolean isTransfer) {
        if (account.isLocked()) {
            cio.prompt("Account Locked.  Please contact the Bank Manager");
            return;
        }
        if (toAcct.equalsIgnoreCase("checking")) {
            checking.deposit(amount, isTransfer);
            cio.prompt("$" + String.format("%.2f", amount)
                    + " deposited in " + toAcct + " account for "
                    + checking.getName());
            cio.prompt("\nNew balance:  $" + String.format("%.2f", checking.getBalance()));
        }
        if (toAcct.equalsIgnoreCase("savings")) {
            savings.deposit(amount, isTransfer);
            cio.prompt("$" + String.format("%.2f", amount)
                    + " deposited in " + toAcct + " account for "
                    + savings.getName());
            cio.prompt("\nNew balance:  $" + String.format("%.2f", savings.getBalance()));
        }
        if (amount >= 10000 && !isTransfer) {
            cio.prompt("Deposit Exceeds Daily Limit!\nYour Account is Locked\n"
                    + "Please contact Bank Manager.");
            account.setIsLocked(true);
        }
    }

    //withdraw
    public void withdraw(double amount, String fromAcct) {
        if (account.isLocked()) {
            cio.prompt("Account Locked.  Please contact the Bank Manager");
            return;
        }
        if (checking.isOverdrawn() && fromAcct.equalsIgnoreCase("checking")) {
            cio.prompt("Account is overdrawn, please make deposit");
            return;
        }
        if (fromAcct.equalsIgnoreCase("checking")) {
            if (amount > checking.getBalance()
                    && amount <= (checking.getBalance() + checking.getOVERDRAFT_PROTECTION())) {
                checking.withdraw(amount, fromAcct);
                cio.prompt("\nNew balance:  $" + String.format("%.2f", checking.getBalance()));
                cio.prompt("\n\nAccount is overdrawn, please make deposit");
                return;
            }
            if (checking.getBalance() >= amount) {
                checking.withdraw(amount, fromAcct);
                cio.prompt("$" + String.format("%.2f", amount) + " withdrawn from "
                        + fromAcct + " account for " + checking.getName());
                cio.prompt("\nNew balance:  $" + String.format("%.2f", checking.getBalance()));
            } else {
                cio.prompt("Insufficient funds for transaction");
            }
        }
        if (fromAcct.equalsIgnoreCase("savings")) {
            if (savings.getBalance() >= amount) {
                savings.withdraw(amount, fromAcct);
                cio.prompt("$" + String.format("%.2f", amount) + " withdrawn from "
                        + fromAcct + " account for " + savings.getName());
                cio.prompt("\nNew balance:  $" + String.format("%.2f", savings.getBalance()));
            } else {
                cio.prompt("Insufficient funds for transaction");
            }
        }
    }

    //transfer from one account to another
    public void transfer(double amount, String fromAccount) {
        if (account.isLocked()) {
            cio.prompt("Your Account is Locked\nPlease contact Bank Manager.");
            return;
        }
        if (fromAccount.equalsIgnoreCase("checking")) {
            if (checking.getBalance() >= amount) {
                checking.withdraw(amount, fromAccount);
                balance("checking");
                savings.deposit(amount, true);
                balance("savings");
            } else {
                cio.prompt("Insufficient funds for transfer.");
            }
        } else if (fromAccount.equalsIgnoreCase("savings")) {
            if (savings.getBalance() >= amount) {
                savings.withdraw(amount, fromAccount);
                balance("savings");
                checking.deposit(amount, true);
                balance("checking");
            } else {
                cio.prompt("Insufficient funds for transfer.");
            }
        }
    }

    //balance
    public void balance(String acct) {
        if (acct.equalsIgnoreCase("checking")) {
            cio.prompt("Balance in " + acct + ":  $"
                    + String.format("%.2f", checking.getBalance()));
        } else if (acct.equalsIgnoreCase("savings")) {
            cio.prompt("Balance in " + acct + ":  $"
                    + String.format("%.2f", savings.getBalance()));
        }
    }

    /**
     * @return the loginAttempt
     */
    public int getLoginAttempt() {
        return loginAttempt;
    }
}

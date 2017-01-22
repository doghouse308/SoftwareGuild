package com.sg.bankmanager.controller;

import com.sg.bankmanager.ops.BankManager;

/**
 *
 * @author Paul Peterson
 */
public class BankManagerController {

    public static void main(String[] args) {

        ConsoleIO cio = new ConsoleIO();
        String title1 = "Bank Manager";
        String mainTitle2 = "Login";
        String accountTitle2 = "Account Selection";
        String[] accountMenu = {"Checking", "Savings", "Exit"};
        int accountSelection = 0;
        String transactionTitle2 = "Transaction Menu";
        String[] transactionMenu = {"Deposit", "Withdraw", "Transfer", "Balance",
            "Main Menu"};
        int transactionSelection = 0;
        int selection = 0;
        boolean isValid = false;

        BankManager bank = new BankManager();
        bank.initializeAccounts();
        while (!bank.login(title1, mainTitle2));
        if (bank.getLoginAttempt() == 3){
            System.exit(0);
        }

        do {
            accountSelection = cio.displayMenu(title1, accountTitle2, accountMenu);
            switch (accountSelection) {
                //checking transactions
                case 1:
                    //checking1234
                    
                    do {
                        transactionSelection = cio.displayMenu(title1, transactionTitle2, transactionMenu);
                        switch (transactionSelection) {
                            //deposit
                            case 1:
                                if (bank.verifyStatus("deposit", "checking")) {
                                    bank.depositToAcct(
                                            cio.promptForDoubleWithFloor(
                                                    "Deposit Ammount ", 0,
                                                    "Deposit must be greater than "),
                                            "checking", false);
                                }
                                transactionSelection = 0;
                                break;
                            //withdrawal
                            case 2:
                                if (bank.verifyStatus("withdrawal", "checking")) {
                                    bank.withdraw(cio.promptForDoubleWithFloor(
                                            "Withdrawal Ammount ", 0,
                                            "Withdrawal must be greater than "), "checking");
                                }
                                transactionSelection = 0;
                                break;
                            //tranfser
                            case 3:
                                if (bank.verifyStatus("withdrawal", "checking")) {
                                    double amount = cio.promptForDoubleWithFloor(
                                            "Transfer Ammount from Checking:  ",
                                            0, "Transfer must be greater than ");
                                    bank.transfer(amount, "checking");
                                }
                                transactionSelection = 0;
                                break;
                            //balance
                            case 4:
                                bank.balance("checking");
                                transactionSelection = 0;
                                break;
                            //return to main menu
                            case 5:
                                cio.prompt("Returning to Main Menu");
                                break;
                        }

                    } while (transactionSelection != transactionMenu.length);
                    accountSelection = 0;
                    break;
                //Savings transactions
                case 2:
                    //savings
                    do {
                        transactionSelection = cio.displayMenu(title1, transactionTitle2, transactionMenu);
                        switch (transactionSelection) {
                            //deposit
                            case 1:
                                if (bank.verifyStatus("deposit", "savings")) {
                                    bank.depositToAcct(
                                            cio.promptForDoubleWithFloor(
                                                    "Deposit Ammount ", 0,
                                                    "Deposit must be greater than "),
                                            "savings", false);
                                }
                                transactionSelection = 0;
                                break;
                            //withdrawal
                            case 2:
                                if (bank.verifyStatus("withdrawal", "savings")) {
                                    bank.withdraw(cio.promptForDoubleWithFloor(
                                            "Withdrawal Ammount ", 0,
                                            "Withdrawal must be greater than "), "savings");
                                }
                                transactionSelection = 0;
                                break;
                            //tranfser
                            case 3:
                                if (bank.verifyStatus("withdrawal", "savings")) {
                                    double amount = cio.promptForDoubleWithFloor(
                                            "Transfer Ammount from Savings:  ", 
                                            0, "Transfer must be greater than ");
                                    bank.transfer(amount, "savings");
                                }
                                transactionSelection = 0;
                                break;
                            //balance
                            case 4:
                                bank.balance("savings");
                                transactionSelection = 0;
                                break;
                            //return to main menu
                            case 5:
                                cio.prompt("Returning to Main Menu");
                                break;
                        }

                    } while (transactionSelection != transactionMenu.length);
                    accountSelection = 0;
                    break;
                //exit
                case 3:
                    cio.prompt("Thank You\n\nGood Bye");
                    break;
            }
        } while (accountSelection != accountMenu.length);

    }

}

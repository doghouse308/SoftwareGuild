package com.sg.bankmanager.ops;

import com.sg.bankmanager.dto.CheckingAccount;
import com.sg.bankmanager.dto.SavingsAccount;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Paul Peterson
 */
public class BankManagerTest {

    public BankManagerTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    //checking account deposit tests
    @Test
    public void depositTest() {
        //arrange
        double amount = 5000;
        double balance = 5000;
        boolean expected = false;

        //acutal
        CheckingAccount checking = new CheckingAccount(123456, "Paul", balance);
        boolean actual = checking.isLocked();

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void depositTest2() {
        //arrange
        double amount = 5000;
        double balance = 5000;
        double expected = 10000;

        //acutal
        CheckingAccount checking = new CheckingAccount(123456, "Paul", balance);
        checking.deposit(amount, true);
        double actual = checking.getBalance();

        //assert
        assertEquals(expected, actual, .001);

    }

    @Test
    public void depositTest3() {
        //arrange
        double amount = 5000;
        double balance = 5000;
        double expected = 10000;

        //acutal
        CheckingAccount checking = new CheckingAccount(123456, "Paul", balance);
        checking.deposit(amount, false);
        double actual = checking.getBalance();

        //assert
        assertEquals(expected, actual, .001);
    }

    @Test
    public void depositTest4() {
        //arrange
        double amount = 10000;
        double balance = 5000;
        double expected = 15000;

        //acutal
        CheckingAccount checking = new CheckingAccount(123456, "Paul", balance);
        checking.deposit(amount, false);
        double actual = checking.getBalance();

        //assert
        assertEquals(expected, actual, .001);
    }

    @Test
    public void depositTest5() {
        //arrange
        double amount = 10000;
        double balance = 5000;
        boolean expected = true;

        //acutal
        CheckingAccount checking = new CheckingAccount(123456, "Paul", balance);
        checking.deposit(amount, false);
        boolean actual = checking.isLocked();

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void depositTest6() {
        //arrange
        double amount = 10000;
        double balance = 5000;
        boolean expected = false;

        //acutal
        CheckingAccount checking = new CheckingAccount(123456, "Paul", balance);
        checking.deposit(amount, true);
        boolean actual = checking.isLocked();

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void depositTest7() {
        //arrange
        double amount = 5000;
        double balance = 5000;
        boolean expected = false;

        //acutal
        SavingsAccount savings = new SavingsAccount(123456, "Paul", balance);
        boolean actual = savings.isLocked();

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void depositTest8() {
        //arrange
        double amount = 5000;
        double balance = 5000;
        double expected = 10000;

        //acutal
        SavingsAccount savings = new SavingsAccount(123456, "Paul", balance);
        savings.deposit(amount, true);
        double actual = savings.getBalance();

        //assert
        assertEquals(expected, actual, .001);

    }

    @Test
    public void depositTest9() {
        //arrange
        double amount = 5000;
        double balance = 5000;
        double expected = 10000;

        //acutal
        SavingsAccount savings = new SavingsAccount(123456, "Paul", balance);
        savings.deposit(amount, false);
        double actual = savings.getBalance();

        //assert
        assertEquals(expected, actual, .001);
    }

    @Test
    public void depositTest10() {
        //arrange
        double amount = 10000;
        double balance = 5000;
        double expected = 15000;

        //acutal
        SavingsAccount savings = new SavingsAccount(123456, "Paul", balance);
        savings.deposit(amount, false);
        double actual = savings.getBalance();

        //assert
        assertEquals(expected, actual, .001);
    }

    @Test
    public void depositTest11() {
        //arrange
        double amount = 10000;
        double balance = 5000;
        boolean expected = true;

        //acutal
        SavingsAccount savings = new SavingsAccount(123456, "Paul", balance);
        savings.deposit(amount, false);
        boolean actual = savings.isLocked();

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void depositTest12() {
        //arrange
        double amount = 10000;
        double balance = 5000;
        boolean expected = false;

        //acutal
        SavingsAccount savings = new SavingsAccount(123456, "Paul", balance);
        savings.deposit(amount, true);
        boolean actual = savings.isLocked();

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void depositToAcctTest() {
        //arrange
        double amount = 5000;
        double balance = 5000;
        boolean expected = false;

        //acutal
        BankManager bank = new BankManager();
        CheckingAccount checking = new CheckingAccount(123456, "Paul", balance);
        bank.depositToAcct(amount, "checking", true);
        boolean actual = checking.isLocked();

        //assert
        assertEquals(expected, actual);
    }

    @Test
    public void depositToAcctTest2() {
        //arrange
        double amount = 5000;
        double balance = 5000;
        double expected = 10000;

        //acutal
        BankManager bank = new BankManager();
        CheckingAccount checking = new CheckingAccount(123456, "Paul", balance);
        bank.depositToAcct(amount, "checking", true);
        double actual = checking.getBalance();

        //assert
        assertEquals(expected, actual, .001);

    }
}

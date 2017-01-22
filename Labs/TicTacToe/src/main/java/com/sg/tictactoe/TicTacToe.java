
package com.sg.tictactoe;

import java.util.Scanner;

/**
 *
 * @author Paul Peterson
 */
public class TicTacToe {

    private static char[][] board = new char[3][3];
    static Scanner kb = new Scanner(System.in);
    static int play = 0;
    static boolean gameOver = false;

    public static void main(String[] args) {

        initBoard();
        displayBoard();
        while (!gameOver) {
            gameOver = play();
        }
    }

    public static boolean play() {
        String prompt;
        int row, column;

        if (play % 2 == 0) {
            play++;
            do {
                row = promptForIntInRange("'O', choose your row:  ", 0, 2);
                column = promptForIntInRange("'O', choose your column:  ", 0, 2);
                if (!isOpen(row, column)) {
                    System.out.println(row + " " + column + " is taken");
                    System.out.println("Select another space.");
                }
            } while (!isOpen(row, column));
            board[row][column] = 'O';
            displayBoard();
            return (isFull() || isWinner('O'));
        } else {
            play++;
            do {
                row = promptForIntInRange("'X', choose your row:  ", 0, 2);
                column = promptForIntInRange("'X', choose your column:  ", 0, 2);
                if (!isOpen(row, column)) {
                    System.out.println(row + " " + column + " is taken");
                    System.out.println("Select another space.");
                }
            } while (!isOpen(row, column));
            board[row][column] = 'X';
            displayBoard();
            return (isFull() || isWinner('O'));
        }
    }

    public static boolean isFull() {
        for (int r = 0; r <= 2; r++) {
            for (int c = 0; c <= 2; c++) {
                if (board [r][c] == ' '){
                    return false;
                }
            }
        }
        System.out.println("Tie game");
        return true;
    }

    public static boolean isWinner(char l) {
        //check rows
        for (int r = 0; r <= 2; r++) {
            if (board[r][0] == l && board[r][1] == l && board[r][2] == l) {
                System.out.println(l + " Wins!");
                return true;
            }
        }
        //check columns
        for (int c = 0; c <= 2; c++) {
            if (board[0][c] == l && board[1][c] == l && board[2][c] == l) {
                System.out.println(l + " Wins!");
                return true;
            }
        }
        if (board[0][0] == l && board[1][1] == l && board[2][2] == l) {
            System.out.println(l + " Wins!");
            return true;
        }
        if (board[0][2] == l && board[1][1] == l && board[2][0] == l) {
            System.out.println(l + " Wins!");
            return true;
        }
        return false;
    }

    public static boolean isOpen(int row, int column) {
        return (board[row][column] == ' ');
    }

    public static int promptForIntInRange(String prompt, int low, int high) {
        int n;
        do {
            System.out.print(prompt);
            n = Integer.parseInt(kb.next());
            if (n < low || n > high) {
                System.out.printf("Please enter a number between %d and %d%n", low, high);
            }
        } while (n < low || n > high);
        return n;
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                board[r][c] = ' ';
            }
        }
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static void displayBoard2() {
        for (int r = 0; r < 3; r++) {
            System.out.print("\t" + r + " ");
            for (int c = 0; c < 3; c++) {
                System.out.print(board[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println("\t  0 1 2 ");
    }
}


package org.example;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[][] board = new char[3][3];
        int[][] example = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        printExample(example);
         //printTicTacToe(board);

        while(true){

        }

    }

    public static void printTicTacToe(char[][] board) {
        System.out.println("BOARD");
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[0].length ; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void printExample(int[][] example) {
        System.out.println("TEMPLAT");
        for (int i = 0; i <example.length ; i++) {
            for (int j = 0; j <example[0].length ; j++) {
                System.out.print(example[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int isDone(int[][] board) {

        for (int i = 0; i <board.length ; i++) {
                if(board[i][0]==board[i][1]&& board[i][1]==board[i][2] ) {
                    return 'X'==board[0][0]?1:2;
                }
        }
        for (int i = 0; i <board[0].length ; i++) {
            if(board[0][i]==board[1][i]&& board[1][i]==board[2][i] ) {
                return 'X'==board[0][0]?1:2;
            }
        }

        if(board[0][0]==board[1][1]&& board[1][1]==board[2][2] ) {
            return 'X'==board[0][0]?1:2;
        }
        if(board[0][2]==board[1][1]&& board[1][1]==board[2][0] ) {
            return 'X'==board[0][0]?1:2;
        }


        return 0;
    }
}

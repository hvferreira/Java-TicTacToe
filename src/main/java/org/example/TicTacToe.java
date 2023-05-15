package org.example;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char[][] board = {{' ',' ',' '},
                        {' ',' ',' '},
                        {' ',' ',' '}};
        int[][] example = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        //printExample(example);
         //printTicTacToe(board);
        int countSize=0;
        int player =0;
        while(countSize!=9){

            if(player%2==0){
                printExample(example);
                System.out.println("Player 1 ");


                addLetter(board,'X',sc);
                player=1;
                countSize++;

                printTicTacToe(board);
            }else
            {
                printExample(example);
                System.out.println("Player 2 ");

                addLetter(board,'Y',sc);
                player=0;
                countSize++;

                printTicTacToe(board);
            }
            if (isDoneCheck(board)==1){
                System.out.println("Player 1 Win");
                countSize=9;
            } else if (isDoneCheck(board)==2) {
                System.out.println("Player 2 Win");
                countSize=9;
            }
        }

    }

    private static void addLetter(char[][] board, char x, Scanner sc) {

        boolean bool = true;

        while (bool){
            int space = sc.nextInt();
            int count =0;
            if(space<10){
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j <board[0].length ; j++) {

                        count++;
                        if (count==space){
                            if (board[i][j]==' '){
                                board[i][j]=x;
                                bool=false;
                            }
                            else {
                                System.out.println("Choose Other");
                            }
                        }
                    }
                }
            }else {
                System.out.println("Choose Other");
            }
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
    public static int isDoneCheck(char[][] board) {
        for (int i = 0; i <board.length ; i++) {
                if(board[i][0]==board[i][1]&& board[i][1]==board[i][2] && board[i][0]!=' ') {
                    return 'X'==board[i][0]?1:2;
                }
        }
        for (int i = 0; i <board[0].length ; i++) {
            if(board[0][i]==board[1][i]&& board[1][i]==board[2][i] && board[0][i]!=' ') {
                return 'X'==board[0][i]?1:2;
            }
        }
        if(board[0][0]==board[1][1]&& board[1][1]==board[2][2] && board[0][0]!=' ') {
            return 'X'==board[0][0]?1:2;
        }
        if(board[0][2]==board[1][1]&& board[1][1]==board[2][0] && board[1][1]!=' ') {
            return 'X'==board[0][0]?1:2;
        }
        return 0;
    }
}

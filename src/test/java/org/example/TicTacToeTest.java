package org.example;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @org.junit.jupiter.api.Test
    void testPrintExample() {

        char[][] board = {{'X','X','X'},
                        {'X','X','X'},
                        {'X','X','X'}};
        TicTacToe.printTicTacToe(board);
    }
}
package org.example;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {

    @Test
    void testPrintExample() {
        char[][] board = {{'X','X','X'},
                        {'X','X','X'},
                        {'X','X','X'}};
        TicTacToe.printTicTacToe(board);
    }

    @Test
    void testCheckLine() {
        char[][] board = {{'X','X','X'},
                {' ','X','X'},
                {' ','X','X'}};
        assertEquals(1,TicTacToe.isDoneCheck(board));
    }
}
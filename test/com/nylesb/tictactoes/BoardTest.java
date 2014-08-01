package com.nylesb.tictactoes;

import static org.junit.Assert.*;

public class BoardTest {
    @org.junit.Test
    public void shouldReturnTheBoardString() throws Exception {
        String expected = "  |   |  \n" +
                "---------\n" +
                "  |   |  \n" +
                "---------\n" +
                "  |   |  \n";
        Board board = new Board();
        assertEquals(expected, board.display());
    }
}
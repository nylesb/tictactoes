package com.nylesb.tictactoes;

import static org.junit.Assert.*;

public class GameTest {
    @org.junit.Test
    public void shouldReturnABoardString() throws Exception {
        String expected = "  |   |  \n" +
                          "---------\n" +
                          "  |   |  \n" +
                          "---------\n" +
                          "  |   |  \n";
        Game game = new Game();
        assertEquals(expected, game.displayBoard());
    }
}
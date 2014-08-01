package com.nylesb.tictactoes;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameTest {
    @org.junit.Test
    public void shouldPrintABoardString() throws Exception {
        Printer mockPrinter = mock(Printer.class);
        String expected = "  |   |  \n" +
                          "---------\n" +
                          "  |   |  \n" +
                          "---------\n" +
                          "  |   |  \n";
        Game game = new Game(mockPrinter);
        game.displayBoard();
        verify(mockPrinter).display(expected);
    }
}
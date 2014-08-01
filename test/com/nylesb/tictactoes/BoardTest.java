package com.nylesb.tictactoes;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BoardTest {
    @org.junit.Test
    public void shouldDisplayTheBoard() throws Exception {
        Printer mockPrinter = mock(Printer.class);
        String expected = "  |   |  \n" +
                "---------\n" +
                "  |   |  \n" +
                "---------\n" +
                "  |   |  \n";

        Board board = new Board(mockPrinter);
        board.display();

        verify(mockPrinter).print(expected);
    }
}
package com.nylesb.tictactoes;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GameTest {
    @org.junit.Test
    public void shouldPrintABoardString() throws Exception {
        Printer mockPrinter = mock(Printer.class);
        Board stubBoard = mock(Board.class);
        when(stubBoard.display()).thenReturn("mock");

        Game game = new Game(mockPrinter, stubBoard);
        game.displayBoard();

        verify(mockPrinter).display("mock");
    }
}
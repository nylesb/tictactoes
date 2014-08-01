package com.nylesb.tictactoes;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GameTest {
    @org.junit.Test
    public void shouldPrintABoardString() throws Exception {
        Board mockBoard = mock(Board.class);

        Game game = new Game(mockBoard);
        game.displayBoard();

        verify(mockBoard).display();
    }
}
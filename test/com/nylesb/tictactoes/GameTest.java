package com.nylesb.tictactoes;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameTest {
    @org.junit.Test
    public void shouldPrintABoardString() throws Exception {
        Board mockBoard = mock(Board.class);
        Player mockPlayer1 = mock(Player.class);

        Game game = new Game(mockBoard, mockPlayer1);
        game.displayBoard();

        verify(mockBoard).display();
    }

    @org.junit.Test
    public void shouldTellPlayer1ToMakeAMove()  {
        Board mockBoard = mock(Board.class);
        Player mockPlayer1 = mock(Player.class);

        Game game = new Game(mockBoard, mockPlayer1);
        game.tellPlayer1ToMakeAMove();

        verify(mockPlayer1).move();
    }
}
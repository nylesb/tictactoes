package com.nylesb.tictactoes;

import org.junit.Before;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class GameTest {

    private Board mockBoard;
    private Player mockPlayer1;
    private Game game;

    @Before
    public void setUp() throws Exception {
        mockBoard = mock(Board.class);
        mockPlayer1 = mock(Player.class);
        game = new Game(mockBoard, mockPlayer1);
    }

    @org.junit.Test
    public void shouldPrintABoardString() throws Exception {
        game.displayBoard();

        verify(mockBoard).display();
    }

    @org.junit.Test
    public void shouldTellPlayer1ToMakeAMove()  {
        game.tellPlayer1ToMakeAMove();

        verify(mockPlayer1).move();
    }
}
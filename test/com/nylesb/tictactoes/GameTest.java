package com.nylesb.tictactoes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

public class GameTest {

    @Mock private Board mockBoard;
    @Mock private Player mockPlayer1;
    @Mock private Printer mockPrinter;
    private Game game;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        game = new Game(mockBoard, mockPlayer1, mockPrinter);
    }

    @Test
    public void shouldPrintABoardString() throws Exception {
        game.displayBoard();

        verify(mockBoard).display();
    }

    @Test
    public void shouldTellPlayer1ToMakeAMove()  {
        game.tellPlayer1ToMakeAMove();

        verify(mockPlayer1).move();
    }

    @Test
    public void shouldDisplayPromptMessageForPlayer1ToMakeMove() throws Exception {
        String expected = "Player 1 enter a number between 1 and 9 to indicate your move: ";

        game.tellPlayer1ToMakeAMove();

        verify(mockPrinter).print(expected);
    }
}
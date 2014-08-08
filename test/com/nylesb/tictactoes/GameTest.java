package com.nylesb.tictactoes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class GameTest {

    @Mock private Board mockBoard;
    @Mock private Player mockPlayer1;
    @Mock private Player mockPlayer2;
    @Mock private GameOutput mockGameOutput;
    private Game game;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        game = new Game(mockBoard, mockPlayer1, mockPlayer2, mockGameOutput);
    }

    @Test
    public void shouldPrintABoardString() throws Exception {
        game.displayBoard();

        verify(mockBoard).display();
    }

    @Test
    public void shouldTellPlayer1ToMakeAMove()  {
        String expected = "Player 1 - Enter a number between 1 and 9 to indicate your move: ";

        game.tellPlayerToMakeAMove(1);

        verify(game.getPlayer(1)).move();
        verify(mockGameOutput).print(expected);
    }

    @Test
    public void shouldContainTwoPlayerObjects() throws Exception {
        assert(game.getPlayer(1) instanceof Player);
        assert(game.getPlayer(2) instanceof Player);
    }

    @Test
    public void shouldTellPlayer2ToMakeAMove() throws Exception {
        String expected = "Player 2 - Enter a number between 1 and 9 to indicate your move: ";

        game.tellPlayerToMakeAMove(2);

        verify(game.getPlayer(2)).move();
        verify(mockGameOutput).print(expected);
    }

    @Test
    public void shouldSetPlayerTokens() throws Exception {
        game.getPlayer(1).setToken("X");
        game.getPlayer(2).setToken("O");

        when(mockPlayer1.getToken()).thenReturn("X");
        assertEquals("X", game.getPlayer(1).getToken());

        when(mockPlayer2.getToken()).thenReturn("O");
        assertEquals("O", game.getPlayer(2).getToken());
    }
}
package com.nylesb.tictactoes;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class PlayerTest {
    private UserInput mockUserInput;
    private Board board;
    private GameOutput mockGameOutput;
    private Player player;

    @Before
    public void setUp() throws Exception {
        this.mockUserInput = mock(UserInput.class);
        this.mockGameOutput = mock(GameOutput.class);
        this.board = new Board(mockGameOutput);
        this.player = new Player(mockUserInput, board);
    }

    @Test
    public void shouldGetUserInput() throws Exception {
        when(mockUserInput.readChoice()).thenReturn("1");

        player.move();

        verify(mockUserInput).readChoice();
    }

    @Test
    public void shouldUpdateBoardFromUserInput() throws Exception {
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("X");
        for (int i = 0; i < 8; i++) {
            expected.add(" ");
        }
        when(mockUserInput.readChoice()).thenReturn("1");

        player.setToken("X");
        player.move();

        assertEquals(expected, board.getBoard());
    }

    @Test
    public void shouldUpdateBoardFromPlayerToken() throws Exception {
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("O");
        for (int i = 0; i < 8; i++) {
            expected.add(" ");
        }
        when(mockUserInput.readChoice()).thenReturn("1");

        player.setToken("O");
        player.move();

        assertEquals(expected, board.getBoard());
    }

    @Test
    public void shouldPromptAgainIfChoiceAlreadyTaken() throws Exception {
        when(mockUserInput.readChoice()).thenReturn("1", "1", "2");

        player.move();
        player.move();

        verify(mockUserInput, atLeast(3)).readChoice();
    }
}
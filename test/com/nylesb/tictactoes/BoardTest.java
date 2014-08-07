package com.nylesb.tictactoes;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BoardTest {
    @org.junit.Test
    public void shouldDisplayTheBoard() throws Exception {
        GameOutput mockGameOutput = mock(GameOutput.class);
        ArrayList<String> boardData = new ArrayList<String>();
        for (int i = 0; i < 9; i++) {
            boardData.add(" ");
        }

        Board board = new Board(mockGameOutput);
        board.display();

        verify(mockGameOutput).printBoard(boardData);
    }

    @Test
    public void shouldInitializeEmptyBoard() throws Exception {
        ArrayList<String> expected = new ArrayList<String>();
        for (int i = 0; i < 9; i++) {
            expected.add(" ");
        }
        GameOutput mockGameOutput = mock(GameOutput.class);

        Board board = new Board(mockGameOutput);

        assertEquals(expected, board.getBoard());

    }
}
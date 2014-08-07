package com.nylesb.tictactoes;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.MockitoAnnotations.initMocks;

public class BoardTest {
    private ArrayList<String> emptyBoard = new ArrayList<String>();
    @Mock private GameOutput mockGameOutput;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        for (int i = 0; i < 9; i++) {
            emptyBoard.add(" ");
        }
    }

    @org.junit.Test
    public void shouldDisplayEmptyBoard() throws Exception {
        Board board = new Board(mockGameOutput);
        board.display();

        verify(mockGameOutput).printBoard(emptyBoard);
    }

    @Test
    public void shouldInitializeEmptyBoard() throws Exception {
        ArrayList<String> expected = emptyBoard;

        Board board = new Board(mockGameOutput);

        assertEquals(expected, board.getBoard());
    }

    @Test
    public void shouldModifyBoardState() throws Exception {
        ArrayList<String> expected = emptyBoard;
        expected.set(0, "X");

        Board board = new Board(mockGameOutput);
        board.update(1, "X");

        assertEquals(expected, board.getBoard());
    }
}
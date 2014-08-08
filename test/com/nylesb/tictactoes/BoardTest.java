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
    private Board board;
    @Mock private GameOutput mockGameOutput;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        for (int i = 0; i < 9; i++) {
            emptyBoard.add(" ");
        }
        board = new Board(mockGameOutput);
    }

    @org.junit.Test
    public void shouldDisplayEmptyBoard() throws Exception {
        board.display();

        verify(mockGameOutput).printBoard(emptyBoard);
    }

    @Test
    public void shouldInitializeEmptyBoard() throws Exception {
        ArrayList<String> expected = emptyBoard;

        assertEquals(expected, board.getBoard());
    }

    @Test
    public void shouldModifyBoardState() throws Exception {
        ArrayList<String> expected = emptyBoard;
        expected.set(0, "X");

        board.update(1, "X");

        assertEquals(expected, board.getBoard());
    }

    @Test
    public void shouldNotifyOfInvalidUpdates() throws Exception {
        String expected = "Location already taken, try again: ";

        board.update(1, "X");
        board.update(1, "O");

        verify(mockGameOutput).print(expected);
    }

    @Test
    public void shouldNotifyAboutFullBoard() throws Exception {
        String expectedReturn = "Full";
        String message = "Board is full!";
        for (int i = 1; i <= 9; i++) {
            board.update(i, "X");
        }

        String result = board.update(1, "X");

        assertEquals(expectedReturn, result);
        verify(mockGameOutput).print(message);
    }
}
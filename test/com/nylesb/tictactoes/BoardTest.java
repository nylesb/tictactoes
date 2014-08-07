package com.nylesb.tictactoes;

import java.util.ArrayList;

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
}
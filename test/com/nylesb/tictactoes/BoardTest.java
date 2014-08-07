package com.nylesb.tictactoes;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BoardTest {
    @org.junit.Test
    public void shouldDisplayTheBoard() throws Exception {
        GameOutput mockGameOutput = mock(GameOutput.class);
        String expected = "   |   |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   \n";

        Board board = new Board(mockGameOutput);
        board.display();

        verify(mockGameOutput).print(expected);
    }
}
package com.nylesb.tictactoes;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GameOutputTest {

    @Test
    public void testPrintsEmptyBoard() throws Exception {
        ArrayList<String> boardData = new ArrayList<String>();
        for (int i = 0; i < 9; i++) {
            boardData.add(" ");
        }
        String expected = "   |   |   \n" +
                          "-----------\n" +
                          "   |   |   \n" +
                          "-----------\n" +
                          "   |   |   \n";
        ByteArrayOutputStream consoleOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consoleOut));

        GameOutput gameOutput = new GameOutput();
        gameOutput.printBoard(boardData);

        assertEquals(expected, consoleOut.toString());
    }

    @Test
    public void testPrintsInAllPositions() throws Exception {
        ArrayList<String> boardData = new ArrayList<String>();
        boardData.add(" ");
        for (int i = 0; i < 4; i++) {
            boardData.add("O");
            boardData.add("X");
        }
        String expected = "   | O | X \n" +
                          "-----------\n" +
                          " O | X | O \n" +
                          "-----------\n" +
                          " X | O | X \n";
        ByteArrayOutputStream consoleOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consoleOut));

        GameOutput gameOutput = new GameOutput();
        gameOutput.printBoard(boardData);

        assertEquals(expected, consoleOut.toString());
    }
}
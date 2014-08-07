package com.nylesb.tictactoes;

import java.util.ArrayList;

/**
 * Created by Nyles on 7/31/2014.
 */
public class GameOutput {
    void print(String text) {
        System.out.println(text);
    }

    public void printBoard(ArrayList<String> boardData) {
        String boardString = "   |   |   \n" +
                "-----------\n" +
                "   |   |   \n" +
                "-----------\n" +
                "   |   |   \n";
        System.out.print(boardString);
    }
}

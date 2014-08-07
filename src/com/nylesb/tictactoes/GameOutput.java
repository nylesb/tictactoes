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
        String boardString = String.format(" %s | %s | %s \n" +
                "-----------\n" +
                " %s | %s | %s \n" +
                "-----------\n" +
                " %s | %s | %s \n"
                , boardData.get(0)
                , boardData.get(1)
                , boardData.get(2)
                , boardData.get(3)
                , boardData.get(4)
                , boardData.get(5)
                , boardData.get(6)
                , boardData.get(7)
                , boardData.get(8));

        System.out.print(boardString);
    }
}

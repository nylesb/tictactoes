package com.nylesb.tictactoes;

import java.util.ArrayList;

/**
 * Created by Nyles on 7/31/2014.
 */
public class Board {
    private GameOutput gameOutput;

    public Board(GameOutput gameOutput) {
        this.gameOutput = gameOutput;
    }

    public void display() {
        ArrayList<String> boardData = new ArrayList<String>();
        for (int i = 0; i < 9; i++) {
            boardData.add(" ");
        }
        gameOutput.printBoard(boardData);
    }
}

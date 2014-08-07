package com.nylesb.tictactoes;

import java.util.ArrayList;

/**
 * Created by Nyles on 7/31/2014.
 */
public class Board {
    private GameOutput gameOutput;
    private ArrayList<String> state = new ArrayList<String>(); // Why new here?

    public Board(GameOutput gameOutput) {
        this.gameOutput = gameOutput;
        for (int i = 0; i < 9; i++) {
            this.state.add(" ");
        }
    }

    public void display() {
        ArrayList<String> boardData = new ArrayList<String>();
        for (int i = 0; i < 9; i++) {
            boardData.add(" ");
        }
        gameOutput.printBoard(boardData);
    }

    public ArrayList<String> getBoard() {
        return this.state;
    }
}

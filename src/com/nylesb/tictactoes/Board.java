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
        gameOutput.printBoard(state);
    }

    public ArrayList<String> getBoard() {
        return this.state;
    }

    public void update(int position, String value) {
        state.set(position - 1 , value);
    }
}

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

    public boolean update(int position, String value) {
        if(state.get(position - 1) == " ") {
            state.set(position - 1, value);
            return true;
        }
        else {
            gameOutput.print("Location already taken");
            return false;
        }
    }
}

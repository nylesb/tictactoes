package com.nylesb.tictactoes;

import java.util.ArrayList;

/**
 * Created by Nyles on 7/31/2014.
 */
public class Board {
    private GameOutput gameOutput;
    private ArrayList<String> state = new ArrayList<String>(); // Why new here?
    private int emptySpaces = 9;

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

    public String update(int position, String value) {
        if(emptySpaces == 0) {
            gameOutput.print("Board is full!");
            return "Full";
        }
        else if(state.get(position - 1) == " ") {
            state.set(position - 1, value);
            emptySpaces--;
            return "Updated";
        }
        else {
            gameOutput.print("Location already taken, try again: ");
            return "Taken";
        }
    }
}

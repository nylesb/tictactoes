package com.nylesb.tictactoes;

/**
 * Created by Nyles on 7/31/2014.
 */
public class Board {
    private GameOutput gameOutput;

    public Board(GameOutput gameOutput) {
        this.gameOutput = gameOutput;
    }

    public void display() {
        String boardString = "   |   |   \n" +
                             "-----------\n" +
                             "   |   |   \n" +
                             "-----------\n" +
                             "   |   |   \n";
        gameOutput.print(boardString);
    }
}

package com.nylesb.tictactoes;

/**
 * Created by Nyles on 7/31/2014.
 */
public class Game {
    private Board board;

    public Game(Board board) {
        this.board = board;
    }

    public void displayBoard() {
        board.display();
    }
}

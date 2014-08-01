package com.nylesb.tictactoes;

/**
 * Created by Nyles on 7/31/2014.
 */
public class Game {
    private Printer printer;
    private Board board;

    public Game(Printer printer, Board board) {
        this.printer = printer;
        this.board = board;
    }

    public void displayBoard() {
        printer.display(board.display());
    }
}

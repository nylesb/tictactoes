package com.nylesb.tictactoes;

/**
 * Created by Nyles on 7/31/2014.
 */
public class Game {
    private Printer printer;

    public Game(Printer printer) {
        this.printer = printer;
    }

    public void displayBoard() {
        Board board = new Board();
        printer.display(board.display());
    }
}

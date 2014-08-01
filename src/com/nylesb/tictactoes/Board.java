package com.nylesb.tictactoes;

/**
 * Created by Nyles on 7/31/2014.
 */
public class Board {
    private Printer printer;

    public Board(Printer printer) {
        this.printer = printer;
    }

    public void display() {
        String boardString = "  |   |  \n" +
                             "---------\n" +
                             "  |   |  \n" +
                             "---------\n" +
                             "  |   |  \n";
        printer.print(boardString);
    }
}

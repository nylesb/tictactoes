package com.nylesb.tictactoes;

/**
 * Created by Nyles on 7/31/2014.
 */
public class Main {
    public static void main(String[] args) {
        Board board = new Board(new Printer());
        Game game = new Game(board);
        game.displayBoard();
    }
}

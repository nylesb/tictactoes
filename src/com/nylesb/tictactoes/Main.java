package com.nylesb.tictactoes;

/**
 * Created by Nyles on 7/31/2014.
 */
public class Main {
    public static void main(String[] args) {
        Game game = new Game(new Printer(), new Board());
        game.displayBoard();
    }
}

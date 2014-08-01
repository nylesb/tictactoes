package com.nylesb.tictactoes;

/**
 * Created by Nyles on 7/31/2014.
 */
public class Game {
    private Board board;
    private Player player1;

    public Game(Board board, Player player1) {
        this.board = board;
        this.player1 = player1;
    }

    public void displayBoard() {
        board.display();
    }

    public void tellPlayer1ToMakeAMove() {
        player1.move();
    }
}

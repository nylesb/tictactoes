package com.nylesb.tictactoes;

/**
 * Created by Nyles on 7/31/2014.
 */
public class Game {
    private Board board;
    private Player player1;
    private Printer printer;

    public Game(Board board, Player player1, Printer printer) {
        this.board = board;
        this.player1 = player1;
        this.printer = printer;
    }

    public void displayBoard() {
        board.display();
    }

    public void tellPlayer1ToMakeAMove() {
        String message = "Player 1 enter a number between 1 and 9 to indicate your move: ";
        printer.print(message);
        player1.move();
    }
}

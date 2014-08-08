package com.nylesb.tictactoes;

/**
 * Created by Nyles on 7/31/2014.
 */
public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private GameOutput gameOutput;

    public Game(Board board, Player player1, Player player2, GameOutput gameOutput) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
        this.gameOutput = gameOutput;
    }

    public void displayBoard() {
        board.display();
    }

    public void tellPlayerToMakeAMove() {
        String message = "Player 1 - Enter a number between 1 and 9 to indicate your move: ";
        gameOutput.print(message);
        player1.move();
    }

    public Player getPlayer(int number) {
        if(number == 1){
            return player1;
        }
        else{
            return player2;
        }
    }
}

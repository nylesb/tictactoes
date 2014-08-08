package com.nylesb.tictactoes;

import java.util.ArrayList;

/**
 * Created by Nyles on 7/31/2014.
 */
public class Game {
    private Board board;
    private ArrayList<Player> player = new ArrayList<Player>();
    private GameOutput gameOutput;

    public Game(Board board, Player player1, Player player2, GameOutput gameOutput) {
        this.board = board;
        player1.setToken("X");
        this.player.add(player1);
        player2.setToken("O");
        this.player.add(player2);
        this.gameOutput = gameOutput;
    }

    public void displayBoard() {
        board.display();
    }

    public void tellPlayerToMakeAMove(int number) {
        String message = String.format("Player %s - Enter a number between 1 and 9 to indicate your move: ", number);
        gameOutput.print(message);
        player.get(number - 1).move();
    }

    public Player getPlayer(int number) {
        return player.get(number - 1);
    }
}

package com.nylesb.tictactoes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Nyles on 7/31/2014.
 */
public class Main {
    public static void main(String[] args) {
        GameOutput gameOutput = new GameOutput();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Board board = new Board(gameOutput);
        Player player1 = new Player(new UserInput(bufferedReader), board);
        Game game = new Game(board, player1, gameOutput);
        game.displayBoard();
        game.tellPlayerToMakeAMove();
    }
}
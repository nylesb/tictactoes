package com.nylesb.tictactoes;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by Nyles on 7/31/2014.
 */
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Board board = new Board(printer);
        Player player1 = new Player(new UserInput(bufferedReader));
        Game game = new Game(board, player1, printer);
        game.displayBoard();
        game.tellPlayerToMakeAMove();
    }
}
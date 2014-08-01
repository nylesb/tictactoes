package com.nylesb.tictactoes;

/**
 * Created by Nyles on 7/31/2014.
 */
public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Board board = new Board(printer);
        Player player1 = new Player();
        Game game = new Game(board, player1, printer);
        game.displayBoard();
        game.tellPlayer1ToMakeAMove();

//        String input = "";
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            input = bufferedReader.readLine();
//        } catch (IOException e) {
//            //input already assigned to ""
//        }
    }
}
package com.nylesb.tictactoes;

/**
 * Created by Nyles on 8/1/2014.
 */
public class Player {
    private UserInput userInput;
    private Board board;

    public Player(UserInput userInput, Board board) {
        this.userInput = userInput;
        this.board = board;
    }

    public void move() {
        int choice = Integer.parseInt(userInput.readChoice());
        board.update(choice, "X");
        board.display();
    }
}

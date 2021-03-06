package com.nylesb.tictactoes;

/**
 * Created by Nyles on 8/1/2014.
 */
public class Player {
    private UserInput userInput;
    private Board board;
    private String token = "D";

    public Player(UserInput userInput, Board board) {
        this.userInput = userInput;
        this.board = board;
    }

    public void move() {
        while(true) {
            int choice = Integer.parseInt(userInput.readChoice());
            if(board.update(choice, token) == "Updated") {
                break;
            }
        }
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}

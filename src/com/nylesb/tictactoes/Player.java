package com.nylesb.tictactoes;

/**
 * Created by Nyles on 8/1/2014.
 */
public class Player {
    private UserInput userInput;

    public Player(UserInput userInput) {

        this.userInput = userInput;
    }

    public void move() {
        userInput.readChoice();
    }
}

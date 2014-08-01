package com.nylesb.tictactoes;

import java.io.BufferedReader;
import java.io.IOException;

/**
 * Created by Nyles on 8/1/2014.
 */
public class UserInput {
    private BufferedReader bufferedReader;

    public UserInput(BufferedReader bufferedReader) {

        this.bufferedReader = bufferedReader;
    }

    public String readChoice() {
        String input = "";
        try {
            input = bufferedReader.readLine();
        } catch (IOException e) {
            //input already assigned to ""
        }
        return input;
    }
}

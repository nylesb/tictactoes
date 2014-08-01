package com.nylesb.tictactoes;

import org.junit.Test;

import java.io.BufferedReader;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class UserInputTest {
    @Test
    public void shouldReadLineFromBufferedStream() throws Exception {
        BufferedReader stubbedBufferedReader = mock(BufferedReader.class);
        when(stubbedBufferedReader.readLine()).thenReturn("9");

        UserInput userInput = new UserInput(stubbedBufferedReader);

        assertEquals("9", userInput.readChoice());
    }
}
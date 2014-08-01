package com.nylesb.tictactoes;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class PlayerTest {
    @Test
    public void shouldGetUserInput() throws Exception {
        UserInput mockedUserInput = mock(UserInput.class);
        Player player = new Player(mockedUserInput);

        player.move();

        verify(mockedUserInput).readChoice();
    }
}
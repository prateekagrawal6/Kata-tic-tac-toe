package com.bnpp.kata.tictactoe;

import com.bnpp.kata.tictactoe.exception.InvalidInputException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    Game game;

    @BeforeEach
    public void initSetup() {
        game = new Game();
    }

    @Test
    @DisplayName("Should initialise game variables or members")
    void initializeGame() {
        assertNotNull(game.getBoard());
        assertNull(game.getWinner());
    }

    @Test
    @DisplayName("Should allow user to give input and check for any exceptions")
    void play() throws InvalidInputException {
        System.setIn(new ByteArrayInputStream(("1".getBytes())));
        game.play();
        assertTrue(game.getBoard().showBoard().contains("X | _ | _"));
        System.setIn(new ByteArrayInputStream("12".getBytes()));
        try {
            game.play();
        } catch ( Exception exception ){
            assertSame(exception.getClass(), InvalidInputException.class);
        }
    }
}
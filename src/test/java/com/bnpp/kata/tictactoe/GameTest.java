package com.bnpp.kata.tictactoe;

import com.bnpp.kata.tictactoe.exception.InvalidInputException;
import com.bnpp.kata.tictactoe.exception.PositionAlreadyOccupiedException;
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
    void play() throws InvalidInputException, PositionAlreadyOccupiedException {
        System.setIn(new ByteArrayInputStream(("1".getBytes())));
        game.play();
        assertTrue(game.getBoard().showBoard().contains("X | _ | _"));
        System.setIn(new ByteArrayInputStream("12".getBytes()));
        try {
            game.play();
        } catch ( Exception exception ){
            assertSame(exception.getClass(), InvalidInputException.class);
        }
        System.setIn(new ByteArrayInputStream("1".getBytes()));
        try {
            game.play();
        } catch ( Exception exception ){
            assertSame(exception.getClass(), PositionAlreadyOccupiedException.class);
        }
        Game newGame = new Game();
        System.setIn(new ByteArrayInputStream(("1".getBytes())));
        newGame.play();
        System.setIn(new ByteArrayInputStream(("2".getBytes())));
        newGame.play();
        System.setIn(new ByteArrayInputStream(("5".getBytes())));
        newGame.play();
        System.setIn(new ByteArrayInputStream(("4".getBytes())));
        newGame.play();
        System.setIn(new ByteArrayInputStream(("3".getBytes())));
        newGame.play();
        assertEquals("X", newGame.getWinner());
    }

}
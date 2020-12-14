package com.bnpp.kata.tictactoe;

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
    @DisplayName("Should allow user to give input")
    void play() {
        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("1".getBytes());
        System.setIn(in);
        game.play();
        assertTrue(game.getBoard().showBoard().contains("X | _ | _"));
    }
}
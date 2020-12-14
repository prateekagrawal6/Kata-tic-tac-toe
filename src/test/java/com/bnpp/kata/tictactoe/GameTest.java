package com.bnpp.kata.tictactoe;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    @Test
    @DisplayName("Should initialise game variables or members")
    void initializeGame() {
        Game game = new Game();
        assertNull(game.getBoard());
        game.initializeGame();
        assertNotNull(game.getBoard());
        assertNull(game.getWinner());
    }
}
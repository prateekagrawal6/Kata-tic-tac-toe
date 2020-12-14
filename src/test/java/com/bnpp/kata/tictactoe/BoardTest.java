package com.bnpp.kata.tictactoe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {
    private Board board;

    @BeforeEach
    void initSetup() {
        board = new Board();
    }

    @Test
    @DisplayName("Should display plain board structure")
    void showBoard() {
        String structure = "_ | _ | _";
        assertTrue(board.showBoard().contains(structure));
    }

    @Test
    @DisplayName("Should switch player accordingly")
    void switchPlayer() {
        assertTrue(board.getCurrentPlayer().equals("X"));
        board.switchPlayer();
        assertTrue(board.getCurrentPlayer().equals("O"));
    }
}
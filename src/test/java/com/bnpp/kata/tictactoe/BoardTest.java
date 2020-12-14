package com.bnpp.kata.tictactoe;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {

    @Test
    @DisplayName("Should display plain board structure")
    void showBoard() {
        Board board = new Board();
        String structure = "_ | _ | _";
        assertTrue(board.showBoard().contains(structure));
    }
}
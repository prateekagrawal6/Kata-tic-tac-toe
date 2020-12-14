package com.bnpp.kata.tictactoe;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameUtilityTest {

    @Test
    @DisplayName("Should check if the input given is valid or not")
    void isValidInput() {
        String input = "1";
        assertTrue(GameUtility.isValidInput(input));
        String anotherInput = "a";
        assertFalse(GameUtility.isValidInput(anotherInput));
    }

    @Test
    @DisplayName("Should check if the input given is already present or occupied")
    void isPositionOccupied() {
        List<String> moves = new ArrayList<String>();
        moves.add("1");
        moves.add("2");
        assertTrue(GameUtility.isPositionOccupied(moves,"1"));
        assertFalse(GameUtility.isPositionOccupied(moves,"3"));
    }

    @Test
    @DisplayName("Should check if all the positions are exhausted in the board grid")
    void isBoardGridMovesExhausted() {
        List<String> moves = new ArrayList<String>();
        moves.add("1");
        moves.add("2");
        moves.add("3");
        moves.add("4");
        moves.add("5");
        moves.add("6");
        moves.add("7");
        moves.add("8");
        assertFalse(GameUtility.isBoardGridMovesExhausted(moves));
        moves.add("9");
        assertTrue(GameUtility.isBoardGridMovesExhausted(moves));
    }


    @Test
    @DisplayName("Should check if any player has met condition to be declared the Winner")
    void checkWinner() {
        Board board = new Board();
        board.placeInputAtBoardGrid("1");
        board.placeInputAtBoardGrid("2");
        assertTrue(GameUtility.checkWinner(board.getGrid()) == null);
        board.placeInputAtBoardGrid("3");
        assertTrue(GameUtility.checkWinner(board.getGrid()).equals("X"));
    }
}
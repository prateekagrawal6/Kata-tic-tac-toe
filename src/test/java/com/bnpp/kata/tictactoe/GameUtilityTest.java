package com.bnpp.kata.tictactoe;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

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
}
package com.bnpp.kata.tictactoe;

import java.util.Arrays;

public class GameUtility {

    static boolean isValidInput(String input) {
        return Arrays.stream(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"}).anyMatch(x -> x.equals(input));
    }
}

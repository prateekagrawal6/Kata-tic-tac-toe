package com.bnpp.kata.tictactoe;

import java.util.Arrays;
import java.util.List;

public class GameUtility {

    static boolean isValidInput(String input) {
        return Arrays.asList(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"}).contains(input);
    }

    static boolean isPositionOccupied(List<String> moves, String position){
        return moves.contains(position);
    }

    static boolean isBoardGridMovesExhausted (List<String> moves ) {
        return moves.size() > 8;
    }

}

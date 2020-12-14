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

    static String checkWinner(String [][] grid) {
        String winner = null;
        if (grid[0][0].equals(grid[0][1]) && grid[0][0].equals(grid[0][2])) {
            winner = grid[0][0];
        } else if (grid[0][2].equals(grid[1][2]) && grid[0][2].equals(grid[2][2])) {
            winner = grid[0][2];
        } else if (grid[2][0].equals(grid[2][1]) && grid[2][0].equals(grid[2][2])) {
            winner = grid[2][0];
        } else if (grid[2][0].equals(grid[1][0]) && grid[2][0].equals(grid[0][0])) {
            winner = grid[2][0];
        } else if (grid[2][0].equals(grid[1][1]) && grid[2][0].equals(grid[0][2])) {
            winner = grid[2][0];
        } else if (grid[0][0].equals(grid[1][1]) && grid[0][0].equals(grid[2][2])) {
            winner = grid[0][0];
        } else if (grid[0][1].equals(grid[1][1]) && grid[0][1].equals(grid[2][1])) {
            winner = grid[0][1];
        } else if (grid[1][0].equals(grid[1][1]) && grid[1][0].equals(grid[1][2])) {
            winner = grid[1][0];
        }
        if (winner.equals("_"))
            winner = null;
        return winner;
    }

}

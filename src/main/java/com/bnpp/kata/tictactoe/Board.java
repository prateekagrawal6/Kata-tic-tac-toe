package com.bnpp.kata.tictactoe;

public class Board {
    private String[][] grid;

    public Board() {
        grid = new String[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                grid[row][col] = "_";
            }
        }
    }

    String showBoard() {
        StringBuilder board = new StringBuilder("\n");
        for (int row = 0; row < 3; row++) {
            StringBuilder builder = new StringBuilder();
            for (int col = 0; col < 3; col++) {
                builder.append(grid[row][col] + (col != 2 ? " | " : ""));
            }
            board.append(builder.toString()).append("\n");
        }
        return board.toString();
    }


}

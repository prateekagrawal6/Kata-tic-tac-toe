package com.bnpp.kata.tictactoe;

public class Board {
    private String[][] grid;

    public Board() {
        grid = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = "_";
            }
        }
    }

    String showBoard() {
        String board = "\n";
        for (int i = 0; i < 3; i++) {
            String internalRow = "";
            for (int j = 0; j < 3; j++) {
                if(j!=2){
                    internalRow += grid[i][j] + " | ";
                }else
                    internalRow += grid[i][j];
            }
            board += internalRow+"\n";
        }
        return board;
    }


}

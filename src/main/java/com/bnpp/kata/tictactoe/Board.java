package com.bnpp.kata.tictactoe;

import java.util.ArrayList;

public class Board {
    private String[][] grid;
    private String currentPlayer;
    private ArrayList<String> moves;

    public Board() {
        grid = new String[3][3];
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                grid[row][col] = "_";
            }
        }

        currentPlayer = "X";

        moves = new ArrayList();
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

    void switchPlayer() {
        setCurrentPlayer("X".equals(currentPlayer) ? "O" : "X");
    }

    void placeInputAtBoardGrid(String inputPosition) {
        moves.add(inputPosition);
        switch (inputPosition) {
            case "1":
                grid[0][0] = currentPlayer;
                break;
            case "2":
                grid[0][1] = currentPlayer;
                break;
            case "3":
                grid[0][2] = currentPlayer;
                break;
            case "4":
                grid[1][0] = currentPlayer;
                break;
            case "5":
                grid[1][1] = currentPlayer;
                break;
            case "6":
                grid[1][2] = currentPlayer;
                break;
            case "7":
                grid[2][0] = currentPlayer;
                break;
            case "8":
                grid[2][1] = currentPlayer;
                break;
            case "9":
                grid[2][2] = currentPlayer;
                break;
        }
    }

    public String[][] getGrid() {
        return grid;
    }

    public void setGrid(String[][] grid) {
        this.grid = grid;
    }

    public String getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(String currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public ArrayList<String> getMoves() {
        return moves;
    }

    public void setMoves(ArrayList<String> moves) {
        this.moves = moves;
    }
}

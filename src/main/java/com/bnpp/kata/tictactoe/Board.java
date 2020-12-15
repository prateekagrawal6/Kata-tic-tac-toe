package com.bnpp.kata.tictactoe;

import java.util.ArrayList;

import static com.bnpp.kata.tictactoe.GameConstant.*;

public class Board {
    private String[][] grid;
    private String currentPlayer;
    private ArrayList<String> moves;

    public Board() {
        grid = new String[ROW_SIZE][COLUMN_SIZE];
        for (int row = INDEX_ZERO; row < ROW_SIZE; row++) {
            for (int col = INDEX_ZERO; col < COLUMN_SIZE; col++) {
                grid[row][col] = BLANK_VALUE;
            }
        }

        currentPlayer = PLAYER_X;

        moves = new ArrayList<>();
    }

    String showBoard() {
        StringBuilder board = new StringBuilder(NEWLINE_CHAR);
        for (int row = INDEX_ZERO; row < ROW_SIZE; row++) {
            StringBuilder builder = new StringBuilder();
            for (int col = INDEX_ZERO; col < COLUMN_SIZE; col++) {
                builder.append(grid[row][col]).append(col != INDEX_TWO ? PIPE : EMPTY_STRING);
            }
            board.append(builder.toString()).append(NEWLINE_CHAR);
        }
        return board.toString();
    }

    void switchPlayer() {
        setCurrentPlayer(PLAYER_X.equals(currentPlayer) ? PLAYER_O : PLAYER_X);
    }

    void placeInputAtBoardGrid(String inputPosition) {
        moves.add(inputPosition);
        switch (inputPosition) {
            case POSITION_ONE:
                grid[INDEX_ZERO][INDEX_ZERO] = currentPlayer;
                break;
            case POSITION_TWO:
                grid[INDEX_ZERO][INDEX_ONE] = currentPlayer;
                break;
            case POSITION_THREE:
                grid[INDEX_ZERO][INDEX_TWO] = currentPlayer;
                break;
            case POSITION_FOUR:
                grid[INDEX_ONE][INDEX_ZERO] = currentPlayer;
                break;
            case POSITION_FIVE:
                grid[INDEX_ONE][INDEX_ONE] = currentPlayer;
                break;
            case POSITION_SIX:
                grid[INDEX_ONE][INDEX_TWO] = currentPlayer;
                break;
            case POSITION_SEVEN:
                grid[INDEX_TWO][INDEX_ZERO] = currentPlayer;
                break;
            case POSITION_EIGHT:
                grid[INDEX_TWO][INDEX_ONE] = currentPlayer;
                break;
            case POSITION_NINE:
                grid[INDEX_TWO][INDEX_TWO] = currentPlayer;
                break;
        }
    }

    public String[][] getGrid() {
        return grid;
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
}

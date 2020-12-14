package com.bnpp.kata.tictactoe;

public class Game {
    private String winner;
    private Board board;

    void initializeGame() {
        board = new Board();
        winner = null;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }
}

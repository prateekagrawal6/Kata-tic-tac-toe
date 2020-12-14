package com.bnpp.kata.tictactoe;

import com.bnpp.kata.tictactoe.exception.InvalidInputException;

import java.util.Scanner;
import java.util.logging.Logger;

public class Game {
    private static final Logger logger = Logger.getLogger(Game.class.getName());

    private String winner;
    private Board board;

    public Game() {
        board = new Board();
        winner = null;
    }

    void play() throws InvalidInputException {
        logger.info(board.showBoard());
        Scanner scanner = new Scanner(System.in);
        logger.info("Enter the position(1-9) for " + board.getCurrentPlayer() + " : ");
        String inputPosition = scanner.next().trim();
        if (!GameUtility.isValidInput(inputPosition)) {
            throw new InvalidInputException(inputPosition+" Input position is invalid.");
        }
        board.placeInputAtBoardGrid(inputPosition);
        logger.info(board.showBoard());
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

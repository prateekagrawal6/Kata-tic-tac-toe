package com.bnpp.kata.tictactoe;

import com.bnpp.kata.tictactoe.exception.GameOverException;
import com.bnpp.kata.tictactoe.exception.InvalidInputException;
import com.bnpp.kata.tictactoe.exception.PositionAlreadyOccupiedException;

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

    void play() throws InvalidInputException, PositionAlreadyOccupiedException, GameOverException {
        logger.info(board.showBoard());
        Scanner scanner = new Scanner(System.in);
        while (true) {
            logger.info("Enter the position(1-9) for " + board.getCurrentPlayer() + " : ");
            String inputPosition = scanner.next().trim();
            if (!GameUtility.isValidInput(inputPosition)) {
                throw new InvalidInputException(inputPosition + " position is invalid.");
            }
            if (GameUtility.isPositionOccupied(board.getMoves(), inputPosition)) {
                throw new PositionAlreadyOccupiedException(" Input Position " + inputPosition + " is already occupied");
            }
            board.placeInputAtBoardGrid(inputPosition);
            logger.info(board.showBoard());
            board.switchPlayer();
            if (board.getMoves().size() > 4) {
                winner = GameUtility.checkWinner(board.getGrid());
                if (winner != null && !winner.equals("_")) {
                    logger.info("Player " + winner + " Wins!!");
                    break;
                }
            }
            if (GameUtility.isBoardGridMovesExhausted(board.getMoves())) {
                throw new GameOverException("It's a DRAW as all the moves got exhausted");
            }
        }
    }

    public String getWinner() {
        return winner;
    }

    public Board getBoard() {
        return board;
    }
}

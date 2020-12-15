package com.bnpp.kata.tictactoe;

import com.bnpp.kata.tictactoe.exception.GameOverException;
import com.bnpp.kata.tictactoe.exception.InvalidInputException;
import com.bnpp.kata.tictactoe.exception.PositionAlreadyOccupiedException;

import java.util.Scanner;
import java.util.logging.Logger;

import static com.bnpp.kata.tictactoe.GameConstant.*;

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
            logger.info( INPUT_MESSAGE + board.getCurrentPlayer());
            String inputPosition = scanner.next().trim();
            if (!GameUtility.isValidInput(inputPosition)) {
                throw new InvalidInputException(inputPosition + INVALID_POSITION_MESSAGE);
            }
            if (GameUtility.isPositionOccupied(board.getMoves(), inputPosition)) {
                throw new PositionAlreadyOccupiedException( inputPosition + POSITION_OCCUPIED_MESSAGE);
            }
            board.placeInputAtBoardGrid(inputPosition);
            logger.info(board.showBoard());
            board.switchPlayer();
            if (board.getMoves().size() > NUMBER_FOUR) {
                winner = GameUtility.checkWinner(board.getGrid());
                if (winner != null && !winner.equals(BLANK_VALUE)) {
                    logger.info(winner + WINNER_MESSAGE);
                    break;
                }
            }
            if (GameUtility.isBoardGridMovesExhausted(board.getMoves())) {
                throw new GameOverException( GAME_OVER_MESSAGE );
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

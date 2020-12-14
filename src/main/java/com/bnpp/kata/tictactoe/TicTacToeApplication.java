package com.bnpp.kata.tictactoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.logging.Logger;

@SpringBootApplication
public class TicTacToeApplication {
	private static final Logger logger = Logger.getLogger(TicTacToeApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(TicTacToeApplication.class, args);
		printMenu();
	}

	private static void printMenu() {
		logger.info("Welcome to BNPPF KATA Tic Tac Toe");
		logger.info("Rules for this game are as follows: ");
		logger.info("1. Player 1: X always goes first");
		logger.info("2. Players cannot play on a played position");
		logger.info("3. Players can play alternatively until one of them WINS the game or it leads to a DRAW");
		logger.info("4. A Player is said to WIN only if they have 3 X's or O's in a row completed");
		logger.info("5. Game is said to be DRAW if the players exhausts all the 9 positions");
		logger.info("6. You need to input your position starting from 1 till 9, where 1 is top left corner and 9 being bottom right corner");
	}

}

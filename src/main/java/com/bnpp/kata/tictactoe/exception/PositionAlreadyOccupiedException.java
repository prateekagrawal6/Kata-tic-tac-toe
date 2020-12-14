package com.bnpp.kata.tictactoe.exception;

public class PositionAlreadyOccupiedException extends Exception {
    public PositionAlreadyOccupiedException ( String message ) {
            super(message);
    }
}

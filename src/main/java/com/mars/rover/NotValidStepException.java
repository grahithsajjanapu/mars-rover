package com.mars.rover;

public class NotValidStepException extends RuntimeException {
    public NotValidStepException(String message) {
        super(message);
    }
}

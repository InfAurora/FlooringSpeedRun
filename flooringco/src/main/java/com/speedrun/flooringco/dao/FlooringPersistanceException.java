package com.speedrun.flooringco.dao;

public class FlooringPersistanceException extends Exception{
    
    public FlooringPersistanceException(String message) {
        super(message);
    }

    public FlooringPersistanceException(String message, Throwable cause) {
        super(message, cause);
    }
}

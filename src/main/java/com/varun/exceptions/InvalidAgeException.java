package com.varun.exceptions;

public class InvalidAgeException extends RuntimeException{
    public InvalidAgeException(String message){
        super(message);
    }
}

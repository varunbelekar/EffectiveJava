package com.varun.exceptions;

public class IncorrectFileNameException extends Exception{
    public IncorrectFileNameException(String message, Throwable e){
        super(message, e);
    }
}

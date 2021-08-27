package com.varun.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CustomCheckedExceptions {
    private static final String FILE_NAME = "/home/varun/sample.txt";

    public static void main(String[] args) throws IncorrectFileNameException {
        String fileName = "sdkjfksdjf";
        try(Scanner file = new Scanner(new File(fileName))) {
            System.out.println("Reading file");
        } catch (FileNotFoundException e) {
            if(! FILE_NAME.equals(fileName)){
                throw new IncorrectFileNameException("Incorrect file name" , e);
            }
        }
        System.out.println("Read file successfully");
    }
}

package com.For.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionTest {


    public static void main(String[] args) {

//        readFiles();
//        Exception exception = new Exception();
//
//        RuntimeException runtimeException = new RuntimeException();
//        Error error = new Error();

        try {
            throw new ClassCastException();
        }
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Errork");
        }


    }


    public static void readFiles() {

        File file = new File("fdgfdb");

        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //throw new RuntimeException(e);
        }


    }
}

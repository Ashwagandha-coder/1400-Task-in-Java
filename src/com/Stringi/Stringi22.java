package com.Stringi;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Stringi22 {


    public static void main(String[] args) {

        new MapString().map();

    }
}

final class MapString {

    private String word = "яблоко";

    public void map() {

        PrintStream printStream = new PrintStream(System.out,true, StandardCharsets.UTF_8);

        printStream.println(word.substring(1,5));
        printStream.println(word.substring(3));



    }



}

package com.Stringi;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Stringi3 {


    public static void main(String[] args) {

        QueryValues2 queryValues2 = new QueryValues2();

        queryValues2.init();
        queryValues2.query();

    }
}


class QueryValues2 {

    private String author;
    private String name_roman;

    public void init() {

        Scanner scanner = new Scanner(System.in);

        this.name_roman = scanner.nextLine();
        this.author = scanner.nextLine();


    }

    public void query() {

        PrintStream printStream = new PrintStream(System.out,true, StandardCharsets.UTF_8);

        printStream.println("Писатель" + " " + author + " " + " автор романа" + " " + name_roman);


    }


}

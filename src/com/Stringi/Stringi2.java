package com.Stringi;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Stringi2 {


    public static void main(String[] args) {

        QueryValues queryValues = new QueryValues();
        queryValues.init();
        queryValues.query();

    }
}

class QueryValues {

    private String city;
    private String country;


    public void init() {

        Scanner scanner = new Scanner(System.in);

        this.country = scanner.nextLine();
        this.city = scanner.nextLine();


    }

    public void query() {

        PrintStream printStream = new PrintStream(System.out,true, StandardCharsets.UTF_8);

        printStream.println("Столица государства" + " " + country + " " + "город" + " " + city);



    }


}

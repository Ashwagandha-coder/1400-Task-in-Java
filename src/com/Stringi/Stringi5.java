package com.Stringi;

import java.util.Scanner;

public class Stringi5 {


    public static void main(String[] args) {

        Letter letter = new Letter();
        letter.scannerName();
        letter.printNum();

    }
}

class Letter {

    private String string;

    public void scannerName() {

        Scanner scanner = new Scanner(System.in);

        string = scanner.nextLine();

    }

    public int countLetter() { return string.length(); }

    public void printNum() {
        System.out.println(countLetter());
    }


}

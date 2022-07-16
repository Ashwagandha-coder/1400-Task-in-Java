package com.Stringi;

import java.util.Scanner;

public class Stringi20 {


    public static void main(String[] args) {

        PartWord partWord = new PartWord();

        partWord.scannerWord();
        partWord.printPartWord();

    }
}

class PartWord {

    private String word;

    public void scannerWord() {

        Scanner scanner = new Scanner(System.in);

        word = scanner.nextLine();
    }

    public void printPartWord() {

        int end = word.length() / 2;

        System.out.println(word.substring(0,end));


    }


}

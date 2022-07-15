package com.Stringi;

import java.util.Scanner;

public class Stringi7 {


    public static void main(String[] args) {

        Family family = new Family();

        family.scannerValue();
        family.printValue();

    }
}

class Family implements doSome {

    private String family_1;
    private String family_2;


    public void scannerValue() {

        Scanner scanner = new Scanner(System.in);

        family_1 = scanner.nextLine();
        family_2 = scanner.nextLine();

    }

    @Override
    public int lengthFamily() {

        int count_1 = family_1.length();
        int count_2 = family_2.length();

        if (count_1 > count_2)
            return 1;
        else
            return 2;

    }

    public void printValue() {
        System.out.println(lengthFamily());
    }
}

interface doSome {

    int lengthFamily();

}

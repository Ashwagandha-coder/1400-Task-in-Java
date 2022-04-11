package com.VariantsAction;

import java.util.Scanner;

public class VariantsAction {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        Variants.Action(scanner.nextDouble(), scanner.nextDouble());

    }
}
class Variants {



    public static void Action(double first, double second) {

        if (first > second) {
            System.out.println(first + " > " + second);
            System.out.println(second + " < " + first);
        }
        else {
            System.out.println(second + " > " + first);
            System.out.println(first + " < " + second);
        }
    }


}

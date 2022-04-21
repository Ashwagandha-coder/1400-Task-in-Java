package com.VariantsAction;

import java.util.Scanner;

public class VariantsAction6 {


    public static void main(String[] args) {

        Read6 read6 = new Read6();
        read6.SoutValue6();

    }
}

final class Read6 implements PrintValue6 {

    @Override
    public void SoutValue6() {

        Scanner scanner = new Scanner(System.in);

        System.out.println(scanner.nextInt());
        System.out.println(scanner.nextInt() * -1);

    }

}

sealed interface PrintValue6 permits Read6 {

    void SoutValue6();


}

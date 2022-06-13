package com.RepeatActionOperation;

import java.util.Scanner;

import static java.lang.System.in;

public class RepeatActionOperation {


    public static void main(String[] args) {

        new RepeatAction().repeatActionOpr();

    }
}

class ScannerVal {

    public int[] scannerValue() {

        Scanner scanner = new Scanner(in);

        int[] value = new int[2];
        value[0] = scanner.nextInt();
        value[1] = scanner.nextInt();

        return value;

    }


}
class RepeatAction extends ScannerVal {

    public void repeatActionOpr() {

        int [] value;
        value = scannerValue();

        System.out.println(value[0] / value[1]);
        System.out.println(value[0] % value[1]);


    }


}

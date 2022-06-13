package com.RepeatActionOperation;

import java.util.Scanner;

public class RepeatActionOperation2 {


    public static void main(String[] args) {

        new RepeatAction2();

    }
}

sealed class ScannerVal2 permits RepeatAction2 {

    public int scannerValue2() {

        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();

    }

}

non-sealed class RepeatAction2 extends ScannerVal2 {


    public RepeatAction2() {

        repeatActionOpr2(scannerValue2());

    }

    public void repeatActionOpr2(int n) {

        for (int i = 0; i <= n; i++) {

            System.out.println(i);


        }



    }


}

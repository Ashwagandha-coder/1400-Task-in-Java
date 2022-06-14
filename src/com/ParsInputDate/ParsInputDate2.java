package com.ParsInputDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParsInputDate2 {


    public static void main(String[] args) {

        ChainSumNumbersDouble chainSumNumbersDouble = new ChainSumNumbersDouble();


        chainSumNumbersDouble.sumChain2(chainSumNumbersDouble.scannerValueAndWriteValue2());

    }
}


class ChainSumNumbersDouble {

    private ArrayList<Double> arrayList;
    private int count;

    private static final Scanner scanner = new Scanner(System.in);

    public ArrayList<Double> scannerValueAndWriteValue2() {


        count = scanner.nextInt();

        arrayList = new ArrayList<>();


        for (int i = 0; i < count; i++) {

            arrayList.add(scanner.nextDouble());

        }

      //  scanner.close();

        return arrayList;


    }


    public void sumChain2(List<Double> list) {

        int result = 0;

        for (int i = 0; i < count; i++) {

            result += list.get(i);

        }

        System.out.println(result);


    }


}
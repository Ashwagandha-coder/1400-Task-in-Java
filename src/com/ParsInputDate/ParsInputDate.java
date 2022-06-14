package com.ParsInputDate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParsInputDate {


    public static void main(String[] args) {

        ChainSumNumbers chainSumNumbers = new ChainSumNumbers();

        chainSumNumbers.sumChain(chainSumNumbers.scannerValueAndWriteValue());

        chainSumNumbers = null;



    }
}

class ChainSumNumbers {

    private ArrayList<Integer> arrayList;


    public ArrayList<Integer> scannerValueAndWriteValue() {

        Scanner scanner = new Scanner(System.in);

        arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            arrayList.add(scanner.nextInt());

        }

        return arrayList;

    }


    public void sumChain(List<Integer> list) {

        int result = 0;

        for (int i = 0; i < 10; i++) {

            result += arrayList.get(i);

        }

        System.out.println(result);


    }

}

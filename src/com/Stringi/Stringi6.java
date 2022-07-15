package com.Stringi;

import java.util.Scanner;

public class Stringi6 {


    public static void main(String[] args) {

        CityName cityName = new CityName();
        cityName.scannerName();
        cityName.printResponse();

    }
}


class CityName {

    private String city;

    public void scannerName() {

        Scanner scanner = new Scanner(System.in);

        city = scanner.nextLine();


    }

    public String cht() {

        int count = city.length();

        if (count % 2 == 0)
            return "YES";
        else
           return  "NO";


    }


    public void printResponse() {
        System.out.println(cht());
    }

}
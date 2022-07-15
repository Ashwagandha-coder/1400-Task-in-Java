package com.Stringi;

import java.util.Scanner;

public class Stringi8 {


    public static void main(String[] args) {

        CityName3 cityName3 = new CityName3();
        cityName3.scannerCityName();
        cityName3.cht3();

    }
}

class CityName3 {

    private String city1;
    private String city2;
    private String city3;

    public void scannerCityName() {

        Scanner scanner = new Scanner(System.in);

        city1 = scanner.nextLine();
        city2 = scanner.nextLine();
        city3 = scanner.nextLine();


    }


    public void cht3() {

        int count1 = city1.length();
        int count2 = city2.length();
        int count3 = city3.length();

        System.out.println(Math.max(Math.max(count1,count2), count3));
        System.out.println(Math.min(Math.min(count1,count2), count3));
    }

}

package com.VariantsAction.Test;

public class TestEnum {

    public static void main(String[] args) {

        Season season = Season.SPRING;

        switch (season) {
            case SPRING -> System.out.println("It's Spring");
            case AUTMN -> System.out.println("It's AUTMN");
            case SUMMER -> System.out.println("It's Summer");
            case WINTER -> System.out.println("It's Winter");
        }

    }
}

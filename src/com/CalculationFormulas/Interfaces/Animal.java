package com.CalculationFormulas.Interfaces;

public class Animal implements Info {

    private int id;
    private String name;

    public Animal(String name,int id) {

        this.name = name;
        this.id = id;
    }

    public void PrintHai() {

        System.out.println("I am" + this.name);

    }

    @Override
    public void SayHello() {

        System.out.println("Hello Animal");

    }

    @Override
    public void PrintName() {

        System.out.println("Print" + this.name);

    }
}

package com.CalculationFormulas.Interfaces;

public class PersonPeople implements Info {

    private int hight;
    private int weight;
    private String name;

    public PersonPeople(String name,int hight, int weight) {

        this.name = name;
        this.hight = hight;
        this.weight = weight;
    }


    public void PrintHello() {

        System.out.println("I am People" + "My weight and hight" + this.hight + " " + this.weight);

    }

    @Override
    public void SayHello() {
        System.out.println("Hello Person");
    }

    @Override
    public void PrintName() {

        System.out.println("Hello" + this.name);

    }
}

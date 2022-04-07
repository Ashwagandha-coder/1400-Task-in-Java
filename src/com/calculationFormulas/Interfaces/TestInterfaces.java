package com.calculationFormulas.Interfaces;

public class TestInterfaces {

    public static void main(String[] args) {

        Animal animal = new Animal("Giraf",1);
        PersonPeople personPeople = new PersonPeople("Bob",180,100);

        animal.SayHello();
        personPeople.SayHello();

        personPeople.PrintName();
        animal.PrintName();



    }
}

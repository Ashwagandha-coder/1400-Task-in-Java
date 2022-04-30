package com.Serealization;

public class Test {

    public static void main(String[] args) {

       // Bird bird = new Bird("Chirik",12,120,56);

        Orel orel = new Orel("Opa",21,32,45,7);
        orel.Fly();




    }
}
class Bird {

    public String name;
    public int weight;
    public int hight;
    public int size_wings;

    public void Fly() {

        System.out.println("I am Flying");

    }

    public void EatWorms() {


        System.out.println("I am eat worms ");
    }
    // constructor

    public Bird(String name, int weight, int hight, int size_wings) {

        this.name = name;
        this.weight = weight;
        this.hight = hight;
        this.size_wings = size_wings;

    }

}
class Orel extends Bird {

    public static int Rang;


    public Orel(String name, int weight, int hight, int size_wings, int Rang) {
        super(name, weight, hight, size_wings);
        this.Rang = Rang;
    }

    @Override
    public void EatWorms() {

        System.out.println("Join - Huein");
    }
}
class Vorobei {


}

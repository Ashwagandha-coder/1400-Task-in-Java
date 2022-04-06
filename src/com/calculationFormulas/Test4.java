package com.calculationFormulas;

import java.io.Serializable;

public class Test4 {

    public static void main(String[] args) {



    }
}
class Person implements Serializable {


    private static final long serialVersionUID = 7491455048615558638L;

    private int id;
    private String name;

    public Person(String name, int id) {

        this.name = name;
        this.id = id;

    }
    // get()

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // set()

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

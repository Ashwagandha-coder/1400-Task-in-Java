package com.calculationFormulas;

import java.io.Serializable;

public class Test5 {

    public static void main(String[] args) {



    }

}
class Pupils implements Serializable {


    private static final long serialVersionUID = 2906642554793891381L;

    private int id;
    private String name;

    public Pupils(String name, int id) {

        this.name = name;
        this.id = id;

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pupils{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

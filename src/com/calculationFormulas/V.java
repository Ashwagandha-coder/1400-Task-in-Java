package com.calculationFormulas;

public abstract class V {

    private transient int a;
    private transient int b;
    private transient int c;

    private transient int volume;

    public V(int a, int b, int c) {

        this.a = a;
        this.b = b;
        this.c = c;


    }
    public void Volume() {

        this.volume = this.a * this.b * this.c;

    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getVolume() {
        return volume;
    }
}

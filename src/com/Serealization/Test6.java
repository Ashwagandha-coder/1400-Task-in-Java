package com.Serealization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test6 implements Serializable {

    public static void main(String[] args) throws IOException {

        WriteObjectMassive();


    }
    public static void WriteObjectMassive() throws IOException {

        Pupils[] pupils123 = new Pupils[] {new Pupils("Rock",1),new Pupils("Don",2),new Pupils("Lion",3)};



        FileOutputStream fileOutputStream = new FileOutputStream("pupils_2.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(pupils123);

    }
}

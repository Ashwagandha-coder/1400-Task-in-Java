package com.calculationFormulas;

import org.jetbrains.annotations.NotNull;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectMassive {



    public static void main(String[] args) throws IOException {


        Write(Init());

    }

    public static Pupils @NotNull [] Init() {

        Pupils[] pupils = new Pupils[] {new Pupils("mike",1),new Pupils("Tom",2),new Pupils("Oleg",3)};


        return pupils;
    }

    public static void Write(Pupils @NotNull [] pupils) throws IOException {

        FileOutputStream fileOutputStream = new FileOutputStream("pupils.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        int pupilsCount = pupils.length;

        objectOutputStream.writeInt(pupilsCount);

        for (Pupils pupilsObject : pupils) {

            objectOutputStream.writeObject(pupilsObject);

        }

        objectOutputStream.close();

    }
}

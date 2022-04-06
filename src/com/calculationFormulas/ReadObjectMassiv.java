package com.calculationFormulas;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObjectMassiv {

    public static void main(String[] args) throws IOException, ClassNotFoundException {


        PrintConsole(Read(Init()));


    }
    @Contract(pure = true)
    public static Pupils @NotNull [] Init() {

        int pupilsCount = 3;

        Pupils[] pupilsRead = new Pupils[pupilsCount];

        return pupilsRead;

    }
    public static Pupils[] Read(Pupils @NotNull [] pupilsRead) throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("pupils.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        int count = objectInputStream.readInt();

        for (int i = 0; i < pupilsRead.length; i++) {

            pupilsRead[i] = (Pupils) objectInputStream.readObject();

        }
        objectInputStream.close();

        return pupilsRead;



    }
    public static void PrintConsole(Pupils[] pupilsPrintConsole) {

        System.out.println(Arrays.toString(pupilsPrintConsole));

    }

}

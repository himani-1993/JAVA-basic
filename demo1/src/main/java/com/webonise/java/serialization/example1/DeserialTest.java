package com.webonise.java.serialization.example1;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 * Created by webonise on 15/2/17.
 */
public class DeserialTest extends Parent implements Serializable {
    int version = 66;
    Contain con = new Contain();

    public int getVersion() {
        return version;
    }

    public static void main(String args[]) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("temp.out");
        ObjectInputStream ois = new ObjectInputStream(fis);
        SerialTest serialTest = (SerialTest)ois.readObject();
        System.out.println(serialTest.con.containVersion);
        System.out.println(serialTest.version);
    }
}

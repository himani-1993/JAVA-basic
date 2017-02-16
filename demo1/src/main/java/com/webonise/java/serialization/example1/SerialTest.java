package com.webonise.java.serialization.example1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by webonise on 15/2/17.
 */
public class SerialTest extends Parent {
    int version = 66;
    Contain con = new Contain();

    public int getVersion() {
        return version;
    }

    public static void main(String args[]) throws IOException {
        FileOutputStream fos = new FileOutputStream("temp.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        SerialTest st = new SerialTest();
        oos.writeObject(st);
        oos.flush();
        oos.close();
    }

/**
 * Forcelly stopping serialization at run-time by calling user defined writeObject() method and
 * throwing exception from inside it


     private void writeObject(ObjectOutputStream oos) throws IOException {
     throw new NotSerializableException();
     }

     private Object readObject() throws IOException {
     throw new NotSerializableException();
     }

 */

}

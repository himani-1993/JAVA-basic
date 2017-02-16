package com.webonise.java.serialization.example2;

import java.io.Serializable;

/**
 * Created by webonise on 16/2/17.
 */
public class superEmployee implements Serializable {
    public String lastName;
/*    static  String companyName;
    transient  String address;
    static transient String companyCEO;*/

    static String companyName = "TATA";
    transient final String address = "DEL";
    static transient String companyCEO = "Jayshree";
}

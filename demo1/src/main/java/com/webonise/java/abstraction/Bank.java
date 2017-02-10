package com.webonise.java.abstraction;

/**
 * Abtract class:
 * Class which contains atleast 1 abstract method
 *
 * Need to use abstract keyword before class if method present inside class is abstract
 *
 * Object of abstract class can't be created
 *
 * Advantage:
 *
 * Code reusability - Common methods are defined in abstract class eg deposit() and other methods which aren't common are left abstract.
 *
 *
 */
abstract public class Bank {

    /**
     * Need to use abstract keyword befor method
     */
    abstract void calculateInterest();

    void deposit() {
        System.out.println("Money deposited");
    }
    
}

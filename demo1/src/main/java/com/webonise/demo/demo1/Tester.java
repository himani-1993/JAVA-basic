package com.webonise.demo.demo1;

import java.util.Scanner;

public class Tester {
    public static String LetterChanges(String str) {

/*        String smallLetterRegex = smallLetterRegex = "[a-z]";
        String vowelRegex = "[]"

        String newLetter = "";
        for (int i=0; i<str.length(); i++) {

            String character = String.valueOf(str.charAt(i));
            if(character.matches(smallLetterRegex)) {
                newLetter = character + 1;
            }

            if(newLetter)

        }*/

        return str;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(LetterChanges(s.nextLine()));
    }
}
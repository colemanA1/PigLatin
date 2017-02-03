package com.company;

import java.util.Scanner;
/**
 * Created by MacUser on 2/2/17.
 */
public class PigLatin {
    String []vowelArray = {"a","e","i","o","u"};
    public static String userWord() {
        System.out.println("Welcome to Pig Latin Translator!");
        System.out.println("Enter a word to translate: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();

        System.out.println(word);
        return word;
    }

    public static String lowerCase(){
        String lowerWord = userWord().toLowerCase();
        return lowerWord;
    }

    /**public static String  vowelIterator() {
        Scanner scan = new Scanner(System.in);
        final int NUM_ELEMENTS = 5;
        char[] vowelArray = {'a', 'e', 'i', 'o','u'};

        int i;
        for (i = 0; i < NUM_ELEMENTS; i++) {
            vowelArray[i] = scan.next();


        }
        return vowelArray[i];
    }*/





    public static void translate(String lowerWord) {
        int place = 0;
        char startLetter = lowerWord.charAt(0);             //When tried to use regex here this
        if (startLetter == 'a' || startLetter == 'e' ||     //made lowerWord angry below
                startLetter == 'i' || startLetter == 'o' ||
                startLetter == 'u') {
            lowerWord = lowerWord.concat("way");

        } else {
            for (int i = 0; i < lowerWord.length(); i++) {
                if (lowerWord.matches("[aeiou]\\B")) {
                    String pigWord = lowerWord.substring(place, lowerWord.length());
                    


                }


            }
            System.out.println(lowerWord);
        }
    }





    public static void main(String[] args){
        lowerCase();
        translate();


    }
}

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





    public static String translate(String word){
        char startLetter = word.charAt(0);
        if (startLetter == 'a' || startLetter == 'e' || startLetter == 'i' || startLetter == 'o' || startLetter == 'u'){
            word = word.concat("way");



        }return word;
    }





    public static void main(String[] args){
        lowerCase();
        translate();


    }
}

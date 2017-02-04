import java.util.Scanner;

/**
 * Created by MacUser on 2/2/17.
 */
public class PigLatin {

    public static String userInput() {
        System.out.println("Welcome to Pig Latin Translator!");
        System.out.println("Enter a word to translate: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        return word;
    }

    public static String[] Split(String word){
        String lowerCase = word.toLowerCase();
        String[] splitWord = lowerCase.split(" ");
        return splitWord;
    }


    public static void translate(String word) {
        String lowerCase = word.toLowerCase();
        int place = 0;
        char startLetter = lowerCase.charAt(0);             //When tried to use regex here this
        if (startLetter == 'a' ||
            startLetter == 'e' ||
            startLetter == 'i' ||
            startLetter == 'o' ||
            startLetter == 'u') {
            lowerCase = lowerCase.concat("way");
            System.out.println(lowerCase);

        } else {
            for (int i = 0; i < lowerCase.length(); i++) {
                if (lowerCase.charAt(i) == 'a' ||
                    lowerCase.charAt(i) == 'e' ||
                    lowerCase.charAt(i) == 'i' ||
                    lowerCase.charAt(i) == 'o' ||
                    lowerCase.charAt(i) == 'u')
                {
                    String findVowels = lowerCase.substring(i)+ lowerCase.substring(0,i) + "ay";
                    System.out.println(findVowels);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        String userInputMain = userInput();
        String[] stringArrayMain = Split(userInputMain);
        for(int i = 0;i<stringArrayMain.length;i++){
            translate(stringArrayMain[i]);
        }
    }
}

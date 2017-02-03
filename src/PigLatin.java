import java.util.Scanner;

/**
 * Created by MacUser on 2/2/17.
 */
public class PigLatin {

    public static String userWord() {
        System.out.println("Welcome to Pig Latin Translator!");
        System.out.println("Enter a word to translate: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        return word;
    }

    public static String[] Split(String word){
        String lowerWord = word.toLowerCase();
        String[] splitWord = lowerWord.split(" ");
        return splitWord;
    }


    public static void translate(String word) {
        String lowerWord = word.toLowerCase();
        int place = 0;
        char startLetter = lowerWord.charAt(0);             //When tried to use regex here this
        if (startLetter == 'a' ||
            startLetter == 'e' ||
            startLetter == 'i' ||
            startLetter == 'o' ||
            startLetter == 'u') {
            lowerWord = lowerWord.concat("way");
            System.out.println(lowerWord);

        } else {
            for (int i = 0; i < lowerWord.length(); i++) {
                if (lowerWord.charAt(i) == 'a' ||
                    lowerWord.charAt(i) == 'e' ||
                    lowerWord.charAt(i) == 'i' ||
                    lowerWord.charAt(i) == 'o' ||
                    lowerWord.charAt(i) == 'u')
                {
                    String pigWord = lowerWord.substring(i)+ lowerWord.substring(0,i) + "ay";
                    System.out.println(pigWord);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        String translateWord = userWord();
        String[] stringArray = Split(translateWord);
        for(int i = 0;i<stringArray.length;i++){
            translate(stringArray[i]);
        }
    }
}

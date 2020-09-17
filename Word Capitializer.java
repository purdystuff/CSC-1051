//I know I did this a little wonky but I did the best I could under the time constraints.

package app;

import java.util.Scanner;

public class WordCapitializer {
    private static String upperCase;

	public static void main(String[] args) {
        System.out.println("Welcome to Justin's WORD CAPITIALIZER!");
        System.out.println("Please enter two words, separated by a space,"+
        "in lowercase below, \n and I will capitalize the first letter of each word.");

        Scanner keyboard = new Scanner(System.in);

        String userWord1 = keyboard.nextLine();
        String userWord2 = keyboard.nextLine();
        
        keyboard.close();

        String charIndex = userWord1.substring(0,1);
        String capitalLetter = charIndex.toUpperCase();
        String theRest = userWord1.substring(1);

        String charIndex2 = userWord2.substring(0,1);
        String capitalLetter2 = charIndex2.toUpperCase();
        String theRest2 = userWord2.substring(1);
        
        System.out.println("Your properly capitalized words are: " + capitalLetter + theRest + " " +
         capitalLetter2 + theRest2);
    }
}

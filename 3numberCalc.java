//a simple 3 number calculator for our first lab

package app;

import java.util.Scanner;

public class labOne{
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello. This is a cool calculator app! Let's try it out");
        System.out.println("We are going to add three numbers together.");
        System.out.print("Please enter your three numbers");

        Scanner keyboard = new Scanner(System.in);
        
        String firstToken = keyboard.next();
        String secondToken = keyboard.next();
        String thirdToken = keyboard.next();

        keyboard.close();
        
        double firstNumber = Double.parseDouble(firstToken);
        double secondNumber = Double.parseDouble(secondToken);
        double thirdNumber = Double.parseDouble(thirdToken);

        double sum = firstNumber + secondNumber + thirdNumber;

        System.out.println("Your sum is: " + sum);

    

    }
}
       

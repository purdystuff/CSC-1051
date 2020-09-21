package app;

import java.util.Scanner;

/* this code will ask a user for their age and then tell them which generation
they are a part of. */

public class genCondition{
    public static void main(String[] args) throws Exception {
        
        System.out.println();

        System.out.println("Let's find out what generation that you belong to!");
        System.out.println("-".repeat(50));
        System.out.println();
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        byte age = keyboard.nextByte();

        keyboard.close();
        System.out.println();

        if((age >=9) && (age <= 24)) {
                println("You are Generation Z");
        }
        else if ((age >24) && (age<=39)) {
            println("You are a Millenial");
        }   
        else if ((age >39) && (age <=54)) {
            println("You are Generation X");
        } 
        else if ((age >54) && (age <= 69)) {
            println("You are a Boomer");
        }
        else if ((age >69) && (age <=84)) {
            println("You are a Silent");
        } 
        else {
            println("You are without a generation, sorry Charlie.");
        }
        
        System.out.println();

        }

     public static void println(String message){
        System.out.println(message);
    }
}

package app;

import java.time.LocalDate;
import java.util.Scanner;

public class StudentInfo {
    public static void main(String[] args) {
        System.out.println("Welcome to Justin's Data Collection Emporium");
        System.out.println("Please answer the following questions");
        System.out.println("-------------------------------------------");
        System.out.println();

        Scanner keyboard = new Scanner(System.in);

        System.out.print("What is your full name?  ");
        String userName = keyboard.nextLine();
        System.out.print("How old are you?  ");
        Byte userAge = keyboard.nextByte();
        System.out.print("What is your expected graduation year?  ");
        short userGrad = keyboard.nextShort();

        keyboard.nextLine();

        System.out.print("What is your major?  ");
        String userMajor = keyboard.nextLine();

        keyboard.close();

        LocalDate todaysDate = LocalDate.now();
        int currentYear = todaysDate.getYear();
        int ageAtGraduation = userAge + (userGrad - currentYear);
        

        System.out.println();

        System.out.println();
        System.out.println("===========================================");
        System.out.println("Here is your information:");
        System.out.println();
        System.out.println("Name: \t \t \t" + userName);
        System.out.println("Age: \t \t \t" + userAge);
        System.out.println("Major: \t \t \t" + userMajor);
        System.out.println("Graduation Year: \t" + userGrad);
        System.out.println("Age at graduation: \t" + ageAtGraduation);


        
    }
}

package io.zipcoder.polymorphism;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        String petNumber = scanner.nextLine();
        System.out.println("Number of pets is " + petNumber);

        System.out.println("What kind of pets do you have?");
        String petKind = scanner.nextLine();
        System.out.println("I have this " + petKind + " kind of pet.");

        System.out.println("What are your pet names?");
        String petNames = scanner.nextLine();
        System.out.println("Their names are " + petNames + " .");


    }
}

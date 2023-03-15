package io.zipcoder.polymorphism;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args){
        //how many pets
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        String petNumber = scanner.nextLine();
        System.out.println("Number of pets is " + petNumber);

        //kind of pets
        System.out.println("What kind of pets do you have?");
        String petKind = scanner.nextLine();
        System.out.println("I have this " + petKind + " kind of pet.");

        // dogs
        System.out.println("How many dogs do you have?");
        String dogAmt = scanner.nextLine();
        System.out.println("I have this " + dogAmt + " number of dogs");

        System.out.println("What are your dogs' names?");
        String dogNames = scanner.nextLine();
        System.out.println("Their names are " + dogNames + " .");

        // cats
        System.out.println("How many cats do you have?");
        String catAmt = scanner.nextLine();
        System.out.println("I have this " + catAmt + " number of cats");

        System.out.println("What are your cats' names?");
        String catNames = scanner.nextLine();
        System.out.println("Their names are " + catNames + " .");

        // birds
        System.out.println("How many birds do you have?");
        String birdAmt = scanner.nextLine();
        System.out.println("I have this " + birdAmt + " number of birds");

        System.out.println("What are your birds' names?");
        String birdNames = scanner.nextLine();
        System.out.println("Their names are " + birdNames + " .");

    }
}

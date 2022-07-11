package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args){doYaLikeDags();}

    public static void doYaLikeDags() {
        List<Pet> petsList = new ArrayList<Pet>();
        Scanner scan = new Scanner(System.in);
        String name = "";
        String type = "";
        String speak = "";

        System.out.println("Hello! I want to know about your pets. How many pets do you have?");

        int numPets = scan.nextInt();

        scan.nextLine();

        for (int i = 1 ; i <= numPets ; i++){

            System.out.println("Cool! What type of pet is pet number " + i + "?\n" +
                    "Only dog, cat or turtle are valid choices.");

            type = scan.nextLine().toLowerCase();

            System.out.println("Sweet! What is it's name?\n");

            name = scan.nextLine();

        }
    }
}


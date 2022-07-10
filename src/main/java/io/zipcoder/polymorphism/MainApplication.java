package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args){doYaLikeDags();}
    public static void doYaLikeDags() {
        Scanner scan = new Scanner(System.in);
        String name = "";
        String type = "";
        String speak = "";


        System.out.println("Hello! I want to know about your pets. How many pets do you have?");

        int numPets = scan.nextInt();

        Pets.makeArray(numPets);

        for (int i = 1 ; i <= numPets ; i++){
            System.out.println("Cool! What type of pet is pet number " + i + "?\n" +
                    "If it's not a dog, cat or turtle I'm going end our conversation immediately.");
            type = scan.nextLine().toLowerCase();
            System.out.println("Sweet! What is it's name?");
            name = scan.nextLine();
            System.out.println("Noice! When it speaks what sound doe it make?");
            speak = scan.nextLine();
            System.out.println("Sick!!");
            if (type == "dog"){
                Dog dog = new Dog(name, speak, type);
                Pets.allPets[i-1] = dog;
            }else if (type == "cat"){
                Cat cat = new Cat(name, speak, type);
                Pets.allPets[i-1] = cat;
            }else if (type == "turtle"){
                Turtle turtle = new Turtle(name, speak, type);
                Pets.allPets[i-1] = turtle;
            }

            System.out.println("Well holy cow! Your pet or pets sound really cool!\n" +
                    "Just to review, here are your pets and all that I know about them!");


        }
    }
}


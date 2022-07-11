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
        String name;
        String type;

        System.out.println("Hello! I want to know about your pets. How many pets do you have?");

        int numPets = scan.nextInt();
        scan.nextLine();

        Pet[] allPets = new Pet[numPets];

        for (int i = 1 ; i <= numPets ; i++) {

            System.out.println("Cool! What type of pet is pet number " + i + "?\n" +
                    "Only dog, cat or turtle are valid choices.");

            type = scan.nextLine().toLowerCase();

            System.out.println("Sweet! What is it's name?\n");

            name = scan.nextLine();

            if (type.equals("dog")) {
                Dog dog = new Dog(name);
                petsList.add(dog);
                allPets[i - 1] = dog;
            } else if (type.equals("cat")) {
                Cat cat = new Cat(name);
                petsList.add(cat);
                allPets[i - 1] = cat;
            } else if (type.equals("turtle")) {
                Turtle turtle = new Turtle(name);
                petsList.add(turtle);
                allPets[i - 1] = turtle;
            }
        }
        System.out.println("Cool, so let me see if I remember all of your pets!");

//        for (int i = 0 ; i < petsList.size() ; i++){
//            System.out.println(Pet.toString());}

        Arrays.toString(allPets);

    }
}

//    @Override
//    public static String toString(){
//        return "Pet Type: " + this.type +
//                "Pet Name: " + this.name +
//                "Pet Sound: " + this.speak;}
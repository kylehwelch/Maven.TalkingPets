package io.zipcoder.polymorphism;

public class Pets {

    String speak;
    String name;
    String type;
    static Object[] allPets;

    public static void makeArray(int num){
        allPets = new Object[num];
    }

//    public static String daPets(){
//        for (int i = 0 ; i < allPets.length ; i++) {
//            String petStats = "Your first pet is " + allPets[i].name;
//        }
//    }


}
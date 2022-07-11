package io.zipcoder.polymorphism;

public class Dog extends Pet {
    public Dog () {
        this.name = "";
        this.speak = "Woof!";
        this.type = "Dog";
    }
    public Dog (String name){
        this.name = name;
        this.speak = "Woof!";
        this.type = "Dog";
    }

}
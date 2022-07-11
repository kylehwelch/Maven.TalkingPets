package io.zipcoder.polymorphism;

public class Cat extends Pet {
    public Cat () {
        this.name = "";
        this.speak = "Meow!";
        this.type = "Cat";
    }
    public Cat (String name) {
        this.name = name;
        this.type = "Cat";
        this.speak = "Meow!";
    }
}
package io.zipcoder.polymorphism;

public class Cat extends Pet {
    public Cat () {
        this.name = "";
        this.speak = "Meow!";
        this.type = "cat";
    }
    public Cat (String name) {
        this.name = name;
        this.type = "cat";
        this.speak = "Meow!";
    }
}
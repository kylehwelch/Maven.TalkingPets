package io.zipcoder.polymorphism;

public class Cat extends Pets {
    public Cat () {
        this.name = "";
        this.speak = "";
        this.type = "Cat";
    }
    public Cat (String name, String speak, String type) {
        this.name = name;
        this.speak = speak;
        this.type = type;
    }
}
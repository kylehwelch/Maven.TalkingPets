package io.zipcoder.polymorphism;

public class Turtle extends Pet {
    public Turtle () {
        this.name = "";
        this.speak = "Mweeerrrrrp";
        this.type = "turtle";
    }
    public Turtle (String name) {
        this.name = name;
        this.speak = "Mweeerrrrrp";
        this.type = "turtle";
    }
}
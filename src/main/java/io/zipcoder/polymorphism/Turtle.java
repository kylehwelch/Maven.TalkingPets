package io.zipcoder.polymorphism;

public class Turtle extends Pets {
    public Turtle () {
        this.name = "";
        this.speak = "";
        this.type = "Turtle";
    }
    public Turtle (String name, String speak, String type) {
        this.name = name;
        this.speak = speak;
        this.type = type;
    }
}
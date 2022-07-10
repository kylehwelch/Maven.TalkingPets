package io.zipcoder.polymorphism;

public class Dog extends Pets {
    public Dog () {
        this.name = "";
        this.speak = "";
        this.type = "dog";
    }
    public Dog (String name, String speak, String type){
        this.name = name;
        this.speak = speak;
        this.type = type;
    }

}
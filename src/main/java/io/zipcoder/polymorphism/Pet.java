package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class Pet {

    String speak;
    String name;
    String type;

    public Pet() {
        this.name = "";
        this.speak = "";
        this.type = "Pet";
    }
    @Override
    public String toString(){
        String studentString =  "Pet Name: " + getName() + "\n" +
                "> Pet Type: " + getType() + "\n" +
                "> Pet Sound:" + getSpeak();
        return studentString;}

    //SETTERS
    public void setName(String name) {this.name = name;}
    public void setSpeak(String speak) {this.speak = speak;}
    public void setType(String type) {this.type = type;}

    //GETTERS
    public String getName() {return this.name;}
    public String getSpeak() {return this.speak;}
    public String getType() {return this.type;}


}
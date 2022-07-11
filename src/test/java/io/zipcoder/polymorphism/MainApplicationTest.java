package io.zipcoder.polymorphism;


import org.junit.Assert;
import org.junit.Test;

public class MainApplicationTest {
@Test
    public void testSetName(){

    //Given
    Dog dog = new Dog();
    dog.setName("weewee");
    //When
    String expected = "weewee";
    String actual = dog.getName();
    //Then
    Assert.assertEquals(actual, expected);

    }
}

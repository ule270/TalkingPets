package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    @Test
    public void TestGetDogName(){

    }

    @Test
    public void TestSetDogName(){
        Dog dog = new Dog(null);
        String expected = "Pluto";
        dog.setName(expected);
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestDogSpeak(){
        Dog dog = new Dog(null);
        String expected = "Woof woof";
        dog.speak();
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestThatDogInheritsFromPet() {
        Dog dog = new Dog(null);
        Assert.assertTrue(dog instanceof Pet);
    }

    @Test
    public void TestConstructor(){
        //Given
        String givenName = "Snoop";

        //When
        Dog dog = new Dog(givenName);
        String retrievedName = dog.getName();

        //Then
        Assert.assertEquals(givenName, retrievedName);
    }

    @Test
    public void TestNullaryConstructor() {
        //Given
        String givenName = "Nameless";

        //When
       Dog dog = new Dog();
        String retrievedName = dog.getName();

        //Then
        Assert.assertEquals(givenName, retrievedName);
    }

}
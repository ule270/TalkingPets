package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BirdTest {

    @Test
    public void TestGetBirdName(){
    }
    @Test
    public void TestSetBirdName(){
        Bird bird = new Bird(null);
        String expected = "Tweety";
        bird.setName(expected);
        String actual = bird.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestBirdSpeak(){
        Bird bird = new Bird(null);
        String expected = "Watch it! I'm flying over here!";
        bird.speak();
        String actual = bird.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestThatBirdInheritsFromPet() {
        Bird bird = new Bird(null);
        Assert.assertTrue(bird instanceof Pet);
    }

    @Test
    public void TestConstructor(){
        //Given
        String givenName = "Big";

        //When
        Bird bird = new Bird(givenName);
        String retrievedName = bird.getName();

        //Then
        Assert.assertEquals(givenName, retrievedName);
    }

    @Test
    public void TestNullaryConstructor() {
        //Given
        String givenName = "Nameless";

        //When
        Bird bird = new Bird(null);
        String retrievedName = bird.getName();

        //Then
        Assert.assertEquals(givenName, retrievedName);
    }

}
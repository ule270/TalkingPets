package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void TestGetCatName(){

    }

    @Test
    public void TestSetCatName(){
        Cat cat = new Cat(null);
        String expected = "Sasha";
        cat.setName(expected);
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestCatSpeak(){
        Cat cat = new Cat(null);
        String expected = "Meeeeow";

        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestThatCatInheritsFromPet() {
        Cat cat = new Cat(null);
        Assert.assertTrue(cat instanceof Pet);
    }

    @Test
    public void TestConstructor(){
        //Given
        String givenName = "Nina";

        //When
        Cat cat = new Cat(givenName);
        String retrievedName = cat.getName();

        //Then
        Assert.assertEquals(givenName, retrievedName);
    }

    @Test
    public void TestNullaryConstructor() {
        //Given
        String name = null;

        //When
        Cat cat = new Cat(null);
        String retrievedName = cat.getName();

        //Then
        Assert.assertEquals(name, retrievedName);
    }

}
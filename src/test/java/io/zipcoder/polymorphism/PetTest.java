package io.zipcoder.polymorphism;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void TestGetPetType() {
        Pet pet = new Pet("Rover");
        String expected = Pet.petType(pet);
        String actual = Pet.petType(pet);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestGetPetTypeDog() {
        Dog dog = new Dog("Rover");
        String expected = Dog.petType(dog);
        String actual = Dog.petType(dog);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestGetPetTypeCat() {
        Cat cat = new Cat("Rover");
        String expected = Cat.petType(cat);
        String actual = Cat.petType(cat);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestGetPetTypeBird() {
        Bird bird = new Bird("Rover");
        String expected = Bird.petType(bird);
        String actual = Bird.petType(bird);
        Assert.assertEquals(expected, actual);
    }

}
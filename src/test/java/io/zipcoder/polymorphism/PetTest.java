package io.zipcoder.polymorphism;


import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    @Test
    public void TestGetPetType() {
        Pet pet = new Pet(null);
        boolean expected = true;
        boolean actual = Pet.petType(pet);
        Assert.assertEquals(expected, actual);
    }

}
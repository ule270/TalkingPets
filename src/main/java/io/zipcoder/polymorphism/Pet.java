package io.zipcoder.polymorphism;

public class Pet {
    String name;
    Object Cat;
    Object Bird;
    Object Dog;

    Pet pet;


    public Pet(String name) {
        this.name = name;
    }

    public static String petType(Pet pet) {
        String Dog = "Dog";
        String Cat = "Cat";
        String Bird = "Bird";
        String type = "";
        if (pet instanceof Dog) {
            type += Dog;
        } else if (pet instanceof Cat) {
            type += Cat;
        } else if (pet instanceof Bird) {
            type += Bird;
        }
        return type;
    }

//    The Pet class must have a name field with setters and getters.

    //The Pet class must have a speak method that each subclass overrides.
    public String speak(){
        String speak = "";
        return speak;
    }

}

package io.zipcoder.polymorphism;

public class Dog extends Pet{
    public Dog(String name) {
        super(name);
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String Speak(){
        String speak = "Woof woof";
        return speak;
    }
}

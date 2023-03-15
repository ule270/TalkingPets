package io.zipcoder.polymorphism;

public class Cat extends Pet{
    public Cat(String name) {
        super(name);
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String speak(){
        String speak = "Meeeeow";
        return speak;
    }
}


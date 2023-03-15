package io.zipcoder.polymorphism;

public class Bird extends Pet{
    public Bird(String name) {
        super(name);
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String speak(){
        String speak = "Watch it! I'm flying over here!";
        return speak;
    }
}

package io.zipcoder.polymorphism;

public class Cat extends Pet{
    String name;

    public Cat(String name){
        super(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String Speak(){
        String speak = "Meeeeow";
        return speak;
    }
}


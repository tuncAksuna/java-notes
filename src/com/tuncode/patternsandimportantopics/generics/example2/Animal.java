package com.tuncode.patternsandimportantopics.generics.example2;

public class Animal {

    private String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return animalName;
    }

    @Override
    public String toString(){
        return animalName;
    }
}

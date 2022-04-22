package com.tuncode.patternsandimportantopics.generics.example2;

public class AnimalRepository {

    void saveAnimal(Animal animal) {
        System.out.println(animal.getAnimalName() + " is being saved");
    }
}

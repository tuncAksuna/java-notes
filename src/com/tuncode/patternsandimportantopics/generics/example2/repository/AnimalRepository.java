package com.tuncode.patternsandimportantopics.generics.example2.repository;

import com.tuncode.patternsandimportantopics.generics.example2.repoclasses.Animal;

public class AnimalRepository {

    void saveAnimal(Animal animal) {
        System.out.println(animal.getAnimalName() + " is being saved");
    }
}

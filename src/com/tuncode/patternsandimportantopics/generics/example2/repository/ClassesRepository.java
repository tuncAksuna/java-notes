package com.tuncode.patternsandimportantopics.generics.example2.repository;

import com.tuncode.patternsandimportantopics.generics.example2.repoclasses.Clas;

public class ClassesRepository {

    void saveClasses(Clas clas) {
        System.out.println(clas.getClasName() + " is being saved");
    }
}

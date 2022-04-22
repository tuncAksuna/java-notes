package com.tuncode.patternsandimportantopics.generics.example2;

/*
 *  <T> Generic olarak TYPE aldığı için parametre <T> olarak verildi !
 */
public class AGenericRepository<T> {

    void saveByRepositoryType(T object) {
        System.out.println(object + " is being saved");
    }
}

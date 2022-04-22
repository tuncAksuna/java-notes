package com.tuncode.patternsandimportantopics.generics.example2;

public class Clas {
    private String clasName;

    public Clas(String clasName) {
        this.clasName = clasName;
    }

    public String getClasName() {
        return clasName;
    }

    @Override
    public String toString() {
        return clasName;
    }
}

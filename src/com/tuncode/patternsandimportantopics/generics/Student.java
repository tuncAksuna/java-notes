package com.tuncode.patternsandimportantopics.generics;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String studentObject = "";

        if (name.length() >= 3)
            studentObject += name;
        else
            return "The length of Student object is less than 3 ";

        return studentObject;
    }
}

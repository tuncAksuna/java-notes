package com.tuncode.patternsandimportantopics.Interfaces;

public class MongoDatabase implements Database {

    @Override
    public void add() {
        System.out.println("Add MongoDatabase");
    }

    @Override
    public void delete() {
        System.out.println("Delete MongoDatabase");
    }

    @Override
    public void update() {
        System.out.println("Update MongoDatabase");

    }

    @Override
    public void get() {
        System.out.println("Get MongoDatabase");
    }
}

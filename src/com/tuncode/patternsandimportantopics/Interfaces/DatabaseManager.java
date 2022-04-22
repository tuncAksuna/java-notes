package com.tuncode.patternsandimportantopics.Interfaces;

public class DatabaseManager {

    public void add(Database database) {
        database.add();
    }

    public void delete(Database database) {
        database.delete();
    }

    public void update(Database database) {
        database.update();
    }

    public void get(Database database) {
        database.get();
    }
}

package com.tuncode.patternsandimportantopics.Interfaces;

public interface Database {
    void add();

    void delete();

    void update();

    void get();

    default String defaultMethodDefining() {
        return "Default method invoked and classes that implement this interface no longer have to override this method !";
    }
}

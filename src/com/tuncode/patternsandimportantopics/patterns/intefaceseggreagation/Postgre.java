package com.tuncode.patternsandimportantopics.patterns.intefaceseggreagation;

public class Postgre implements DatabaseOperation {

    @Override
    public void createConnection() {
        System.out.println("Created connection");
    }

    @Override
    public long getMaxConnectionPoolCount() {
        return 0;
    }
}

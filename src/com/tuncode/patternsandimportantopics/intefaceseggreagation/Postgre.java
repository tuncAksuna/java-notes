package com.tuncode.patternsandimportantopics.intefaceseggreagation;

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

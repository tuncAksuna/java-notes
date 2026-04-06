package com.tuncode.javanotes.patternsandimportantopics.patterns.intefaceseggreagation;

public class Oracle implements DatabaseOperation{

    @Override
    public void createConnection() {
        System.out.println("Created connection..");
    }

    @Override
    public long getMaxConnectionPoolCount() {
        return 0;
    }
}

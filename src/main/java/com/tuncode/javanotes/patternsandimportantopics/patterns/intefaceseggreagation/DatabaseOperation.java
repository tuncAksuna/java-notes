package com.tuncode.javanotes.patternsandimportantopics.patterns.intefaceseggreagation;


public interface DatabaseOperation {

    void createConnection();

    long getMaxConnectionPoolCount();
}

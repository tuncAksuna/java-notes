package com.tuncode.patternsandimportantopics.patterns.intefaceseggreagation;


public interface DatabaseOperation {

    void createConnection();

    long getMaxConnectionPoolCount();
}

package com.tuncode.patternsandimportantopics.intefaceseggreagation;


public interface DatabaseOperation {

    void createConnection();

    long getMaxConnectionPoolCount();
}

package com.tuncode.patternsandimportantopics.intefaceseggreagation;

import java.util.Map;

public interface DatabaseOperationForNonRelationalDatabase {

    // Bu metod yaln�zca Mongo taraf�nca kullan�labilir. �li�kisel veritaban� bu i�lemi yapamaz !
    Map<Long, String> createJsonConnection();

}

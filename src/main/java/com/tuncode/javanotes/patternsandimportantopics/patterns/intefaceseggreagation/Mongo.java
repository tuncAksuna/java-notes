package com.tuncode.javanotes.patternsandimportantopics.patterns.intefaceseggreagation;

import java.util.Map;

public class Mongo implements DatabaseOperation, DatabaseOperationForNonRelationalDatabase {

    @Override
    public void createConnection() {
        System.out.println("Created connection..");
    }

    @Override
    public long getMaxConnectionPoolCount() {
        return 0;
    }

    // Bu metod yaln�zca "�uan i�in" Mongo yani ili�kisel olmayan d�kuman tabanl� bir veritaban� taraf�ndan implemente edilebilir !
    @Override
    public Map<Long, String> createJsonConnection() {
        return null;
    }
}

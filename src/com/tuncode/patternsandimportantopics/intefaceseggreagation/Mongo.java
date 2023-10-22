package com.tuncode.patternsandimportantopics.intefaceseggreagation;

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

    // Bu metod yalnýzca "þuan için" Mongo yani iliþkisel olmayan dökuman tabanlý bir veritabaný tarafýndan implemente edilebilir !
    @Override
    public Map<Long, String> createJsonConnection() {
        return null;
    }
}

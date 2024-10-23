package com.tuncode.patternsandimportantopics.patterns.intefaceseggreagation;

import java.util.Map;

public interface DatabaseOperationForNonRelationalDatabase {

    // Bu metod yalnýzca Mongo tarafýnca kullanýlabilir. Ýliþkisel veritabaný bu iþlemi yapamaz !
    Map<Long, String> createJsonConnection();

}

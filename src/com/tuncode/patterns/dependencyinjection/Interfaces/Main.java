package com.tuncode.patterns.dependencyinjection.Interfaces;

class DatabaseManager {
    public void add(Database database) {
        database.add();
    }

    public void delete(Database database) {
        database.delete();
    }

    public void update(Database database) {
        database.update();
    }

    public void get(Database database) {
        database.get();
    }
}

public class Main {
    /**
     * - Database classlarında bir değişiklik yaptığımız zaman bundan super classlar etkilenmeyecek !
     * - Yeni bir database kullanımına geçileceği zaman yalnızca 'main' metodunda databaseManager referansı üzerinden yeni database'i fonksiyona parametre olarak vermemiz yeterli
     */
    public static void main(String[] args) {
        DatabaseManager databaseManager = new DatabaseManager();

        // for using the Mongo database
        databaseManager.add(new MongoDatabase());

        // for using the MySQL database
        databaseManager.delete(new MySQLDatabase());

    }
}

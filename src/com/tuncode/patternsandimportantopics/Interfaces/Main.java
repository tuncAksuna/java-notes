package com.tuncode.patternsandimportantopics.Interfaces;

public class Main {
    /**
     * - Database classlarında bir değişiklik yaptığımız zaman bundan super classlar etkilenmeyecek !
     * - Yeni bir database kullanımına geçileceği zaman yalnızca 'main' metodunda databaseManager referansı üzerinden yeni database'i fonksiyona parametre olarak vermemiz yeterli !
     * - Artık daha kapsamlı ve ayno işleri yapan classlarımız var !
     */
    public static void main(String[] args) {
        DatabaseManager databaseManager = new DatabaseManager();

        // for using the Mongo database
        databaseManager.add(new MongoDatabase());

        // for using the MySQL database
        databaseManager.delete(new MySQLDatabase());

        // DEFAULT METHODS IN INTERFACE :
        Database database = new MySQLDatabase();
        System.out.println("Default method : " + database.defaultMethodDefining());


    }
}

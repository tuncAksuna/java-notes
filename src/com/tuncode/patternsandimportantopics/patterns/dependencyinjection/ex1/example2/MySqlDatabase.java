package com.tuncode.patternsandimportantopics.patterns.dependencyinjection.ex1.example2;

public class MySqlDatabase implements ICustomerDAL {

    @Override
    public void add() {
        System.out.println("Mysql veritabanýna eklendi" );
    }
}

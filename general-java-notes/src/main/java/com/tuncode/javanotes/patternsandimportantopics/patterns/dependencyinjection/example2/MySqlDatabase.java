package com.tuncode.javanotes.patternsandimportantopics.patterns.dependencyinjection.example2;

public class MySqlDatabase implements ICustomerDAL {

    @Override
    public void add() {
        System.out.println("Mysql veritaban�na eklendi" );
    }
}

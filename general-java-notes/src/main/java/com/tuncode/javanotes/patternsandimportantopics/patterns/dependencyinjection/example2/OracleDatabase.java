package com.tuncode.javanotes.patternsandimportantopics.patterns.dependencyinjection.example2;

public class OracleDatabase implements ICustomerDAL {

    @Override
    public void add() {
        System.out.println("Oracle veritaban�na eklendi"  );
    }
}

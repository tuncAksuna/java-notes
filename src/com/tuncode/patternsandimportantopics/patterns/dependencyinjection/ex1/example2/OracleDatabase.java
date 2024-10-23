package com.tuncode.patternsandimportantopics.patterns.dependencyinjection.ex1.example2;

public class OracleDatabase implements ICustomerDAL {

    @Override
    public void add() {
        System.out.println("Oracle veritabanýna eklendi"  );
    }
}

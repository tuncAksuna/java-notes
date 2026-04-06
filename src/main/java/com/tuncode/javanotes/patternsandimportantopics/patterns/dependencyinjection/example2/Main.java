package com.tuncode.javanotes.patternsandimportantopics.patterns.dependencyinjection.example2;

public class Main {

    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new MySqlDatabase());
        customerManager.add();

//        CustomerManager customerManager = new CustomerManager(new OracleDatabase());
//        customerManager.addNotDependencyInjection();
    }
}

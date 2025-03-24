package com.tuncode.patternsandimportantopics.patterns.dependencyinjection.ex1.example2;

/**
 * TODO : CustomerManager üst sýnýfý alt sýnýflara 'soyut bir class(ICustomerDal)' aracýlýðý ile dependency injection uygulanarak loosely coupled olmuþtur.
 */
public class CustomerManager {

    private final ICustomerDAL customerDAL;

    public CustomerManager(ICustomerDAL customerDAL) {
        this.customerDAL = customerDAL;
    }

    public void add() {
        customerDAL.add();
    }

//    Dependency injection kullanmadýðýmýz için ileriki bir zamanda MySQL veritabaný desteði gelmesi istendiðinde ifler ile spagetti kod yazmak zorunda kalacaðýz ve CustomerManager sýnýfý alt 'somut' classlara baðlýdýr.

//    public void addNotDependencyInjection() {
//        OracleDatabase oracleDatabase = new OracleDatabase();
//        oracleDatabase.add();
//    }
}

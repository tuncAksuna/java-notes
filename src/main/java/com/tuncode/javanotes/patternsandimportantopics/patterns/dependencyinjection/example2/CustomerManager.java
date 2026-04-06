package com.tuncode.javanotes.patternsandimportantopics.patterns.dependencyinjection.example2;

/**
 * TODO : CustomerManager �st s�n�f� alt s�n�flara 'soyut bir class(ICustomerDal)' arac�l��� ile dependency injection uygulanarak loosely coupled olmu�tur.
 */
public class CustomerManager {

    private final ICustomerDAL customerDAL;

    public CustomerManager(ICustomerDAL customerDAL) {
        this.customerDAL = customerDAL;
    }

    public void add() {
        customerDAL.add();
    }

//    Dependency injection kullanmad���m�z i�in ileriki bir zamanda MySQL veritaban� deste�i gelmesi istendi�inde ifler ile spagetti kod yazmak zorunda kalaca��z ve CustomerManager s�n�f� alt 'somut' classlara ba�l�d�r.

//    public void addNotDependencyInjection() {
//        OracleDatabase oracleDatabase = new OracleDatabase();
//        oracleDatabase.add();
//    }
}

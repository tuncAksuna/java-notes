package com.tuncode.patternsandimportantopics.abstractclasses;

public abstract class BaseATM {

    private final String COUNTRY_ATM = "Ankara/TURKEY";

    public abstract double calcInterestRate(double interestRate);

    public String getCOUNTRY_ATM() {
        System.out.println(this.COUNTRY_ATM);
        return COUNTRY_ATM;
    }
}

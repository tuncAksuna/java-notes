package com.tuncode.javanotes.patternsandimportantopics.abstractclasses;

public class AkbankATM extends BaseATM {

    @Override
    public double calcInterestRate(double interestRate) {
        return interestRate + 10;
    }

}

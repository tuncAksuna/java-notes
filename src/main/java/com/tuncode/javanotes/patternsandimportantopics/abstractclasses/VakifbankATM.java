package com.tuncode.javanotes.patternsandimportantopics.abstractclasses;

public class VakifbankATM extends BaseATM {

    @Override
    public double calcInterestRate(double interestRate) {
        return interestRate + 20;
    }
}

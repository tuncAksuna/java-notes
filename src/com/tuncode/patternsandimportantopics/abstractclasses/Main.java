package com.tuncode.patternsandimportantopics.abstractclasses;

public class Main {

    public static void main(String[] args) {

        BaseATM akbankATM = new AkbankATM(); // polymorphizm
        akbankATM.calcInterestRate(0.89);

        BaseATM vakifbankATMK = new VakifbankATM();
        vakifbankATMK.calcInterestRate(1.19);
        vakifbankATMK.getCOUNTRY_ATM();
    }
}

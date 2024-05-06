package com.tuncode.patternsandimportantopics.patterns.openclosedprenciple.example2;

/**
 * @author caksuna on 26.03.2024 22:20
 */
public class Main {

    public static void main(String[] args) {

        MevzuatFactory mevzuatFactory = new MevzuatFactoryImpl();

        Mevzuat birinciMevzuat = mevzuatFactory.getMevzuat("birinci mevzuat");
        Mevzuat ikinciMevzuat = mevzuatFactory.getMevzuat("ikinci mevzuat");

        MevzuatManager mevzuatManager = new MevzuatManager(birinciMevzuat);
        mevzuatManager.getMevzuat();
        mevzuatManager.getMevzuat();

    }

}

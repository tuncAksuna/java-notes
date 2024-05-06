package com.tuncode.patternsandimportantopics.patterns.openclosedprenciple.example2;

/**
 * @author caksuna on 30.03.2024 14:32
 */
public class MevzuatFactoryImpl implements MevzuatFactory {

    public Mevzuat getMevzuat(String mevzuatType) {
        if (mevzuatType.equalsIgnoreCase("Birinci mevzuat")) {
            return new BirinciMevzuat();
        } else if (mevzuatType.equalsIgnoreCase("ikinci mevzuat")) {
            return new IkinciMevzuat();
        } else {
            return null;
        }
    }
}

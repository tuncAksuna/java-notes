package com.tuncode.patternsandimportantopics.patterns.openclosedprenciple.example2;

/**
 * @author caksuna on 26.03.2024 23:13
 */
public class IkinciMevzuat implements Mevzuat {

    @Override
    public void getMevzuat() {
        System.out.println("Ikinci mevzuat isleme alindi.");
    }
}

package com.tuncode.patternsandimportantopics.patterns.openclosedprenciple.example2;

/**
 * @author caksuna on 26.03.2024 23:22
 */
public class MevzuatManager {

    private final Mevzuat mevzuat;

    public MevzuatManager(Mevzuat mevzuat) {
        this.mevzuat = mevzuat;
    }

    public void getMevzuat() {
        mevzuat.getMevzuat();
    }
}

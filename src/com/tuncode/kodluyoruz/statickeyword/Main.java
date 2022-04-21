package com.tuncode.kodluyoruz.statickeyword;

public class Main {
    public static void main(String[] args) {

        Classes mat = new Classes("mat", 80, "MAT-101");
        Classes phy = new Classes("phy", 62, "PHY-101");
        Classes geo = new Classes("geo", 22, "GEO-101");

        int[] notes = {mat.note, phy.note, geo.note};

        /**
           a function that can be called as needed without creating a object through another class !
           @return  average of given notes
         */
        Calculate.calculateAverage(notes);

    }
}

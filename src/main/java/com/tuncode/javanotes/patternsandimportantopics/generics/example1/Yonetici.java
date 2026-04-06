package com.tuncode.javanotes.patternsandimportantopics.generics.example1;

import com.tuncode.javanotes.patternsandimportantopics.generics.Calisan;

public class Yonetici extends Calisan {

    private String bagliOlduguKurum;

    public Yonetici(String departaman, String maas, String isim) {
        super(departaman, maas, isim);
    }

    public Yonetici(String departaman, String maas, String isim, String bagliOlduguKurum) {
        super(departaman, maas, isim);
        this.bagliOlduguKurum = bagliOlduguKurum;
    }
}

package com.tuncode.javanotes.patternsandimportantopics.generics;

public class Calisan {
    private String departaman;
    private String maas;
    private String isim;

    public Calisan(String departaman, String maas, String isim) {
        this.departaman = departaman;
        this.maas = maas;
        this.isim = isim;
    }

    public String getDepartaman() {
        return departaman;
    }

    public void setDepartaman(String departaman) {
        this.departaman = departaman;
    }

    public String getMaas() {
        return maas;
    }

    public void setMaas(String maas) {
        this.maas = maas;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }


}

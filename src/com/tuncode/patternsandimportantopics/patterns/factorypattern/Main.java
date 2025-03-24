package com.tuncode.patternsandimportantopics.patterns.factorypattern;

/**
 * @description : birbirleri ile benzer yap�da olan nesneleri( �rne�in Bmw,mercedes gibi nesneler yani arabay� temsil eden benzer nesneler ya da lojistik uygulamas� geli�tirirken kulland���m�z
 * deniz,araba,gemi lojisti�i gibi ayn� i�i yapan benzer nesneler ) nerede,nas�l en verimli �ekilde "yarataca��m�z(newlemek)" zaman kullan�lan patterndir.(Bu benzer
 * yap�daki nesnelerin �retimini ger�ekle�tiren s�n�flar�n bir soyut s�n�ftan(interface) �retilmesini sa�lamak da performans� artt�cakt�r !

 * Nesneyi yaratma, newleme i�lemini Factory class�na veririz
 * Nesne yaratma i�lemi i�in bir interface tasarlanmas�n� gerektirir ve alt s�n�flar�n bu interface �zerinden nesne �retmesine olanak sa�lar.

 * Di�er bir deyi�le yazd���m�z programda birbirine benzeyen birden fazla s�n�f olabilir. Bu t�r s�n�flar� olu�tururken her seferinde new operat�r�n� kullanmay�n ya da o s�n�flardan sanki birbirinden
 * ba��ms�zm�� gibi kod yazmayal�m diye b�yle bir �r�nt� tasarlam��lar.

 */
public class Main {
    public static void main(String[] args) {

        Car bmw = CarFactory.createCar("BMW", "Black", "2.500.000");
        Car mercedes = CarFactory.createCar("Mercedes", "White", "2.000.000");

        bmw.showCarInfo();
        System.out.println("  ");
        mercedes.showCarInfo();


    }
}

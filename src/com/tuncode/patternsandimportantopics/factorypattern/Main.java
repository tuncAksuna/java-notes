package com.tuncode.patternsandimportantopics.factorypattern;

/**
 * @description : birbirleri ile benzer yapýda olan nesneleri( Örneðin Bmw,mercedes gibi nesneler yani arabayý temsil eden benzer nesneler ya da lojistik uygulamasý geliþtirirken kullandýðýmýz
 * deniz,araba,gemi lojistiði gibi ayný iþi yapan benzer nesneler ) nerede,nasýl en verimli þekilde "yaratacaðýmýz(newlemek)" zaman kullanýlan patterndir.(Bu benzer
 * yapýdaki nesnelerin üretimini gerçekleþtiren sýnýflarýn bir soyut sýnýftan üretilmesini saðlamak da performansý arttýcaktýr !

 * Nesneyi yaratma, newleme iþlemini Factory classýna veririz
 * Nesne yaratma iþlemi için bir interface tasarlanmasýný gerektirir ve alt sýnýflarýn nesne üretmesine olanak saðlar.

 * Diðer bir deyiþle yazdýðýmýz programda birbirine benzeyen birden fazla sýnýf olabilir. Bu tür sýnýflarý oluþtururken her seferinde new operatörünü kullanmayýn ya da o sýnýflardan sanki birbirinden
 * baðýmsýzmýþ gibi kod yazmayalým diye böyle bir örüntü tasarlamýþlar.

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

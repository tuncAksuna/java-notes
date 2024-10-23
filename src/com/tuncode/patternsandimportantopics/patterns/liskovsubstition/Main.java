package com.tuncode.patternsandimportantopics.patterns.liskovsubstition;

/**
 * Alt sýnýfýn (türetilen sýnýf), üst sýnýfýn (türeyen sýnýf) yerine kullanýlabilmesidir.
 * Örneðin: Tavuk ve Kartal adlý iki sýnýfýmýz var ve bu sýnýflar Kuþ sýnýfýnýdý extend ediyor. Kuþ sýnýfý içerisinde de uç metodu var.
 * Ancak kartal uçabiliyorken tavuk uçamamakta yani tavuk sýnýfý uç metodunu boþuna bünyesinde barýndýrýyor. Ýþte bu durumda "Liskov Substition" yapabiliriz. Bunu yapmak için de. Ýki ayrý interface tanýmlayarak
 * Tavuk sýnýfýna uçma özelliði olmayan interfaceyi tanýmlayabiliriz.
 * Diðer bir örnek : Database adlý bir sýnýfýmýz var içerisinde gerekli fieldlar, metodlar var. Bu metodlardan birisi sql ortamýnda yazdýðýmýz java kodunu otomatik olarak compile edebiliyor.
 * Bu durumda Oracle PL/SQL ve PostgreSQL sýnýflarýmýz database sýnýfýnýmýzý extend etsinler. Ancak PostgreSQL sýnýfýmýz java kodunu sql tarafýndan otomatik olarak extends edemez. Yani gereksiz
 * yere bu metodu barýndýracak. Bu durumda Liskov uygulanabilir.
 */

public class Main {

    public static void main(String[] args) {

    }
}

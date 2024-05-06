package com.tuncode.patternsandimportantopics.patterns.strategypattern;

import java.math.BigDecimal;

/**
 * @description : Strategy pattern bir algoritmayý (ornegin bir file format converter uygulamasinde dosyalar
 * PDF -> Word, JPG -> PNG gibi farkli formatlara convert edilebiliyor yani her convert islemi icin farkli algoritma isleniyor) siniflandirip, her birini ayri bir sinif icerisinde
 * kapsulleyerek birbiriyle degistirebilir hale getirir ve bu sayede nesnenin davranisini "dinamik" olarak degistebilme imkani tanir. Örneðin: Bir odeme sisteminde farkli odeme yontemleri farklý algoritmalar gerektirir. Her odeme yontemi icin ayrý bir strateji sinifi olusturmamýza ve client tarafindan kullanilacak olan
 * odeme yontemini secmemize olanak tanir. Odeme islemi gerceklesirken, istemci sadece secilen odeme stratejisini cagirir ve gerisini dusunmez.

 * Kullanim durumlari :
       - Kod tekrarini azaltmak ve bakimi kolaylastirmak,
       - Bir nesnenin davranisinin dinamik olarak degismesi gerektiginde (bir odeme sisteminde kredi karti ile odeme isleminin artik sadece nakit ile yapilacagi bilgisi geldiginde dinamik olarak artik kredi karti odeme algoritmasini uygulayan
        sinifi degil nakit odeme algoritmasini uygulayan strategy sinifini cagirmak yeterli olacaktir.).
 */
public class StrategyPatternMain {

    public static void main(String[] args) {

//        PaymentStrategy payment = new CashPaymentStrategy();
        PaymentStrategyContex payment = new PaymentStrategyContex(new PayPalPaymentConcrete());
        payment.pay(BigDecimal.valueOf(12));

    }
}

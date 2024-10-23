package com.tuncode.patternsandimportantopics.patterns.factorypattern;


class CarFactory {

    public static Car createCar(String mark, String color, String price) throws UnsupportedOperationException {

        Car car = null; // bu interface üzerinden nesne yaratabileceðiz !

        if (mark.equalsIgnoreCase("BMW")) {
            car = new BMW(color, price);
        } else if (mark.equalsIgnoreCase("Mercedes")) {
            car = new Mercedes(color, price);
        }
        return car;
    }
}

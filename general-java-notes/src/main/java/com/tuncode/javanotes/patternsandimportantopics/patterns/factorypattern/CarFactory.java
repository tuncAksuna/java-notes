package com.tuncode.javanotes.patternsandimportantopics.patterns.factorypattern;


class CarFactory {

    public static Car createCar(String mark, String color, String price) throws UnsupportedOperationException {

        Car car = null; // bu interface �zerinden nesne yaratabilece�iz !

        if (mark.equalsIgnoreCase("BMW")) {
            car = new BMW(color, price);
        } else if (mark.equalsIgnoreCase("Mercedes")) {
            car = new Mercedes(color, price);
        }
        return car;
    }
}

package com.tuncode.patternsandimportantopics.factorypattern;

public class Mercedes implements Car {

    private String color;
    private String price;

    public Mercedes(String color, String price) {
        this.color = color;
        this.price = price;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public String getPrice() {
        return price;
    }

    @Override
    public void showCarInfo() {
        System.out.println("Color : " + color);
        System.out.println("Price : " + price);
    }
}

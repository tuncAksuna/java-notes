package com.tuncode.patternsandimportantopics.builderpattern;

public class PizzaMain {
    public static void main(String[] args) {

        /**
         * - The "size" or "name" parameters, which should not change after the object is created, cannot be changed internall
         * - When creating the object, it is not created by passing unnecassary null parameters,
         * */
        Pizza.PizzaBuilder pizzaBuilder = new Pizza.PizzaBuilder(20, "Margharita");

        pizzaBuilder.withOptionalCheese(true);
        pizzaBuilder.withOptionalOlive(true);

        Pizza myPizza = pizzaBuilder.buildPizza();
    }
}

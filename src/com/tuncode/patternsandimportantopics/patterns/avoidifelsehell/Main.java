package com.tuncode.patternsandimportantopics.patterns.avoidifelsehell;

public class Main {
    public static void main(String[] args) {


        // Context ile de bu yapı yönetilebilir. 1. Yöntem
        ShippingCostCalculatorContext.calculateShippingCost("STANDART",10.0);

        // Context sınıfı aradan çıkartılarak böyle bir 2. yöntemle de yapılabilir.
        ShippingCostStrategy standartShippingType = ShippingCostFactory.getStrategy("STANDART");
        standartShippingType.getCost(10.0);

    }

    /*
     * Bu yapıdan kurtulunması gerekiyor...
     */
    public static double calculateShippingCost(String shippingType, double weight) {
        if (shippingType.equalsIgnoreCase("STANDARD")) {
            return weight * 5.0;
        } else if (shippingType.equalsIgnoreCase("EXPRESS")) {
            return weight * 10.0;
        } else if (shippingType.equalsIgnoreCase("SAME_DAY")) {
            return weight * 20.0;
        }
        return 0;
    }
}

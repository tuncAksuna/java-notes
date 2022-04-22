package com.tuncode.patternsandimportantopics.builderpattern;

public class Pizza {

    private final int size; // final field - enter a value absolutely
    private final String name; // enter a value absolutely
    private boolean cheese;
    private boolean olive;
    private boolean pepperoni;
    private boolean bacon;

    /**
     * private constructor - we ensured that this object is not called from outside
     * */
    private Pizza(PizzaBuilder pizzaBuilder) {
        this.size = pizzaBuilder.size;
        this.name = pizzaBuilder.name;
        this.cheese = pizzaBuilder.cheese;
        this.olive = pizzaBuilder.olive;
        this.pepperoni = pizzaBuilder.pepperoni;
        this.bacon = pizzaBuilder.bacon;
    }

    public static class PizzaBuilder {
        private final int size;
        private final String name;
        private boolean cheese;
        private boolean olive;
        private boolean pepperoni;
        private boolean bacon;

        /**
         *  constructor for "final fields" and a new object cannot be created without these two parameters
         */
        public PizzaBuilder(int size, String name) {
            this.size = size;
            this.name = name;
        }

        public PizzaBuilder withOptionalCheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder withOptionalOlive(boolean olive) {
            this.olive = olive;
            return this;
        }

        public PizzaBuilder withOptionalPepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public PizzaBuilder withOptionalBacon(boolean bacon) {
            this.bacon = bacon;
            return this;
        }

        public Pizza buildPizza() {
            return new Pizza(this);
        }
    }

    /**
     * NE ZAMAN KULLANILIR ?
     * 1) Eğer çok fazla parametre alan bir objemiz varsa bazı parametlerini mecburen "null" geçmek zorundaysak !
     *  @ÖRNEK : new Pizza(20,true,true,null,null,null,null,true)

     * 2) Farklı parametre kombinasyonlarına sahip "birden çok constructor" varsa ve hangilerini kullanacağımız konuları net değilse !

     *  @ÖRNEK
     *  public Pizza(int size)
     *  public Pizza(int size,boolean cheese)
     *  public Pizza(int size, boolean cheese, boolean pepperoni)
     *  public Pizza(int size, boolean cheese, boolean pepperoni, boolean bacon)
     *  gibi uzayıp giden bir constructor yapısı var !

     * 3) Nesnenin oluşturulduktan sonra immutable(değişmez) olmasını istiyorsak !

     * @ÖRNEK
     * Pizza myPizza = new Pizza();
     * myPizza.setSize(20);
     * myPizza.setCheese(true);
     * firinaGonder();
     * myPizza.setSize(20);

     * firinaGonder(); metodu çalıştıktan sonra bile setSize() metodu çalışabiliyor. Yani obje değiştiriliyor ve haberimiz bile olmuyor !
     * */
}

package com.tuncode.patternsandimportantopics.generics.example2;

public class Main {
    /*
     * Her repository için ayrı bir sınıf oluşturduk ve bu repositoryler aslında hepsi aynı işi yapıyor, hepsi database'e veri kaydediyor !
     * Bu kadar kod kalabalığı kafa karıştırıcı olabilir ! Bunun yerine tek bir GENERIC CLASS yapısı oluşturarak class'a "referans veri tipini" vererek sorunu çözdük !
     */
    public static void main(String[] args) {
        ClassesRepository classes = new ClassesRepository();
        //classes.saveClasses(new Clas("First class"));

        AnimalRepository animal = new AnimalRepository();
        //animal.saveAnimal(new Animal("Bear"));

        PlanetRepository planet = new PlanetRepository();
        //planet.savePlanet(new Planet("Jupiter"));

        // Tek bir generic class üzerinden işlem yapalım :
        AGenericRepository<Clas> genericClas = new AGenericRepository<>();
        AGenericRepository<Planet> genericPlanet = new AGenericRepository<>();
        AGenericRepository<Animal> genericAnimal = new AGenericRepository<>();

        genericClas.saveByRepositoryType(new Clas("First class"));
        genericPlanet.saveByRepositoryType(new Planet("Earth"));
        genericAnimal.saveByRepositoryType(new Animal("Crocodile"));
    }
}

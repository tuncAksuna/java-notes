package com.tuncode.patternsandimportantopics.generics.example2.repository;

import com.tuncode.patternsandimportantopics.generics.example2.repoclasses.Planet;

public class PlanetRepository {

    void savePlanet(Planet planet) {
        System.out.println(planet.getPlanetName() + " is being saved");
    }


}

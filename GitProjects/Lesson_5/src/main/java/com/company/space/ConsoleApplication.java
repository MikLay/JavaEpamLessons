package com.company.space;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class ConsoleApplication {
    public static void main(String[] args) {
        ArrayList<Planet> planetsOfFirstSolarSystem = new ArrayList<>(asList(
                new Planet("Mercury", 3.3022E10, 2439.7*2),
                new Planet("Venus", 4.8675E24, 6051.8*2),
                new Planet("Earth", 5.97237E24, 6371D*2, Stream.of(
                        new Satellite("Moon",7.342E22,1737.1*2)
                ).collect(Collectors.toSet())),
                new Planet("Mars", 6.4171E23, 3389.5*2, Stream.of(
                        new Satellite("Phobos",1.0659E16,11.267*2)
                ).collect(Collectors.toSet())),
                new Planet("Jupiter", 1.8982E27, 69911D*2,Stream.of(
                        new Satellite("Europa",4.79984E22,1560.8*2),
                        new Satellite("Io",8.931938E22,1821.6*2)
                ).collect(Collectors.toSet())),
                new Planet("Saturn", 5.6834E26, 58232D*2),
                new Planet("Uranus", 8.6810E25, 25362D*2)
                ));


        StarSystem solarSystem = new StarSystem("Solar System", planetsOfFirstSolarSystem,Stream.of(new Star("Sun",1.9885E30,695700D*2,1.57E7)).collect(Collectors.toSet()));
        solarSystem.addPlanet(new Planet("Neptun", 1.02413E26,24622D*2, Stream.of(new Satellite("Triton",2.14E22,1353.4*2)).collect(Collectors.toSet())));
        System.out.println(solarSystem);
        System.out.println("Amount of planets on Solar System is: "+solarSystem.countPlanetsInSystem());
    }



}

package com.company.space;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;

public class StarSystem {
    private final String name;
    private ArrayList<Planet> planets;
    private Set<Star> stars;
    private final Long id;


    private static Long counter = 0L;

    public StarSystem(String name, ArrayList<Planet> planets, Set<Star> stars) {
        this.name = name;
        this.planets = planets;
        this.stars = stars;
        this.id = counter++;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StarSystem)) return false;
        StarSystem that = (StarSystem) o;
        return name.equals(that.name) &&
                Objects.equals(planets, that.planets) &&
                Objects.equals(stars, that.stars) &&
                id.equals(that.id);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Planet> getPlanets() {
        return planets;
    }

    public Set<Star> getStars() {
        return stars;
    }

    public Long getId() {
        return id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, planets, stars, id);
    }

    @Override
    public String toString() {
        return "StarSystem{ " +
                "\nid= " + id +
                " | name= '" + name +
                " | planets= \n" + planets.toString() +
                "|;\n stars= \n" + stars.toString() +
                ";";
    }

    public void addPlanet(Planet planet) {
        planets.add(planet);
    }

    public int countPlanetsInSystem() {
        return planets.size();
    }
}

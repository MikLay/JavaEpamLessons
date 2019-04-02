package com.company.space;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Planet extends AbstractCelestialBody {

    private Set<Satellite> satellites;

    public Set<Satellite> getSatellites() {
        return satellites;
    }

    Planet(String name, Double mass, Double diameter, Set<Satellite> satellites) {
        super(name, mass, diameter);
        this.satellites = new HashSet<>();
        this.satellites.addAll(satellites);
    }

    public Planet(String name, Double mass, Double diameter) {
        super(name, mass, diameter);
        this.satellites = new HashSet<>();
    }

    public void addSatellite(Satellite satellite) {
        satellites.add(satellite);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Planet)) return false;
        if (!super.equals(o)) return false;
        Planet planet = (Planet) o;
        return Objects.equals(satellites, planet.satellites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), satellites);
    }

    @Override
    public String toString() {
        return "\nPlanet: " + super.toString()+(!satellites.isEmpty()?" satellites: \n"+satellites.toString():"| No satellites|");
    }
}

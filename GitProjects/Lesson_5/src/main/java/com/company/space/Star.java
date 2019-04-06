package com.company.space;

import java.util.Objects;

public class Star extends AbstractCelestialBody {

    private Double temperature;

    Star(String name, Double mass, Double diameter, Double temperature) {
        super(name, mass, diameter);
        this.temperature = temperature;
    }

    public Double getTemperature() {
        return temperature;
    }

    @Override
    public String toString() {
        return "\nStar: | temperature: "+temperature+super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Star)) return false;
        if (!super.equals(o)) return false;
        Star star = (Star) o;
        return Objects.equals(temperature, star.temperature);
    }



    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), temperature);
    }
}

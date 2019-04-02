package com.company.space;

import java.util.Objects;

public abstract class AbstractCelestialBody {

    private final String name;
    private final Long id;
    private final Double mass;
    private final Double diameter;

    private static Long counter = 0L;

    AbstractCelestialBody(String name, Double mass, Double diameter) {
        this.name = name;
        this.id = counter++;
        this.mass = mass;
        this.diameter = diameter;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public Double getMass() {
        return mass;
    }

    public Double getDiameter() {
        return diameter;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        if (this == obj)
            return true;

        AbstractCelestialBody tempObj = (AbstractCelestialBody) obj;
        return this.id.equals(tempObj.getId()) && this.getMass().equals(tempObj.getMass()) &&
                this.getDiameter().equals(tempObj.getDiameter());
    }

    @Override
    public String toString() {
        return " | id: " + this.getId() + " | name:" + this.getName() + " | mass: " + this.getMass() + " | diameter: "
                + this.getDiameter();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, mass, diameter);
    }

}

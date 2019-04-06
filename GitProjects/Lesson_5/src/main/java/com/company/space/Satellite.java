package com.company.space;

public class Satellite extends AbstractCelestialBody {
    public Satellite(String name, Double mass, Double diameter) {
        super(name, mass, diameter);
    }

    @Override
    public String toString() {
        return "Natural satellite: \n" + super.toString()+"\n";
    }
}

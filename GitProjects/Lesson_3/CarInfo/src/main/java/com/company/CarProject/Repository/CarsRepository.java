package com.company.CarProject.Repository;

import com.company.CarProject.Entity.Car;

import java.util.Set;
import java.util.stream.Collectors;

public class CarsRepository {
    private final Set<Car> cars;

    public CarsRepository(Set<Car> cars) {
        this.cars = cars;
    }

    public Car findCarById(Long id) {
        return cars.stream().filter(car -> car.getId().equals(id)).findAny().orElse(null);
    }

    public Car findCarByRegNumber(String registrationNumber) {
        return cars.stream().filter(car -> car.getRegistrationNumber().equals(registrationNumber)).findAny().orElse(null);
    }

    public Set<Car> findCarsByBrand(String brand) {
        return cars.stream().filter(car -> car.getBrand().equals(brand)).collect(Collectors.toSet());
    }

    public Set<Car> findCarsByModel(String model) {
        return cars.stream().filter(car -> car.getModel().equals(model)).collect(Collectors.toSet());
    }

    public Set<Car> findCarsByManYear(int manufactureYear) {
        return cars.stream().filter(car -> car.getManufactureYear() == manufactureYear).collect(Collectors.toSet());
    }

    public Set<Car> findCarsByColor(String color) {
        return cars.stream().filter(car -> car.getColor().equals(color)).collect(Collectors.toSet());
    }

    public Set<Car> findCarsByPrice(Long price) {
        return cars.stream().filter(car -> car.getPrice().equals(price)).collect(Collectors.toSet());
    }


}
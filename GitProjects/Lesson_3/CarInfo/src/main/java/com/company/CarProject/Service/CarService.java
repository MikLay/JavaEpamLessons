package com.company.CarProject.Service;

import com.company.CarProject.Entity.Car;
import com.company.CarProject.Repository.CarsRepository;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

public class CarService {
    private CarsRepository carsRepository;

    public CarService(CarsRepository carsRepository) {
        this.carsRepository = carsRepository;
    }

    public Set<Car> findByBrand(String brand) {
        return carsRepository.findCarsByBrand(brand);
    }

    public Set<Car> findByModelAndUse(String model, int n) {
        return carsRepository.findCarsByModel(model).stream().filter(car -> LocalDateTime.now().getYear() -
                car.getManufactureYear() > n).collect(Collectors.toSet());
    }

    public Set<Car> findByYearAndPrice(int year, Long price) {
        return carsRepository.findCarsByManYear(year).stream().filter(car -> car.getPrice().
                equals(price)).
                collect(Collectors.toSet());
    }
}

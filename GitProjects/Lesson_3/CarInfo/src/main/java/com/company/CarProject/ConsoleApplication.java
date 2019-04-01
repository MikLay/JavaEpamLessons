package com.company.CarProject;

import com.company.CarProject.Entity.Car;
import com.company.CarProject.Repository.CarsRepository;
import com.company.CarProject.Service.CarService;
import com.company.CarProject.Ui.Ui;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class ConsoleApplication {
    public static void main(String[] args) {
        Set<Car> cars = new HashSet<>();

        cars.add(new Car(1L, 2015, "NISSAN", "GTR", "White", 620001410L, "AI5555CX"));
        cars.add(new Car(2L, 2017, "MERCEDES", "S5", "White", 51000125L, "AA6112CB"));
        cars.add(new Car(3L, 2010, "VOLKSWAGEN", "OPERA", "Yellow", 14200345L, "CB1325DL"));
        cars.add(new Car(4L, 2019, "PORSCHE", "CAYENNE", "White", 20151000L, "AA6111DA"));
        cars.add(new Car(5L, 2011, "PORSCHE", "CAYENNE", "Red", 20000000L, "BB9275CX"));
        cars.add(new Car(6L, 2010, "NISSAN", "DAYZ", "Pink", 156000000L, "AC9302LM"));
        cars.add(new Car(7L, 2009, "BMW", "X5", "Black", 16167200L, "AA7912BC"));
        cars.add(new Car(8L, 2015, "Audi", "R7", "Silver", 13333330L, "FF1341LX"));
        cars.add(new Car(9L, 2013, "FORD", "MUSTANG", "Yellow", 73241100L, "AA9101CX"));
        cars.add(new Car(10L, 2011, "HONDA", "CAPRA", "White", 15151333L, "CP5541LD"));

        System.out.println(LocalDateTime.now().getYear());

        CarsRepository carsRepository = new CarsRepository(cars);
        CarService carService = new CarService(carsRepository);

        Ui consoleUi = new Ui(carService);
        consoleUi.run();
    }

}

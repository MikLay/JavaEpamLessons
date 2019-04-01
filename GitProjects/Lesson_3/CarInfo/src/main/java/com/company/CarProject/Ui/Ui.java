package com.company.CarProject.Ui;

import com.company.CarProject.Service.CarService;

import java.util.Scanner;

public class Ui {
    private final CarService carService;
    private Scanner input;

    public Ui(CarService carService) {
        this.carService = carService;
        input = new Scanner(System.in);
    }

    public void run() {
        boolean isDone = false;
        while (!isDone) {
            int commandNumber;
            do {
                System.out.println("Please choose the command: \n1 - to choose cars by brand.\n2 - to choose cars by model and time of usage.\n3 - to choose the car by price and year\n4 - EXIT");
                System.out.print("Command: ");
                commandNumber = input.nextInt();
            } while (commandNumber > 4 || commandNumber <= 0);

            switch (commandNumber) {
                case 1:
                    findByBrand();
                    break;
                case 2:
                    findByModelAndUse();
                    break;
                case 3:
                    findByYearAndPrice();
                    break;
                case 4:
                    isDone = true;
                default:
                    break;
            }

        }

    }

    private void findByYearAndPrice() {
        System.out.print("Enter the price of car: ");
        Long price = input.nextLong();
        System.out.print("\nEnter the year of manufacture: ");
        int use = input.nextInt();
        System.out.println(carService.findByYearAndPrice(use, price).toString());
    }

    private void findByModelAndUse() {
        System.out.print("Enter the model of cars: ");
        String brand = input.next();
        System.out.print("\nEnter the years of use(n): ");
        int use = input.nextInt();
        System.out.println(carService.findByModelAndUse(brand, use).toString());
    }

    private void findByBrand() {
        System.out.print("\nEnter the brand of cars: ");
        String brand = input.next();
        System.out.println(carService.findByBrand(brand).toString());
    }
}

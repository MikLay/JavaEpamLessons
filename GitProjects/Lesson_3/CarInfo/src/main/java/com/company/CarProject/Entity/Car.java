package com.company.CarProject.Entity;

import java.util.Objects;

public class Car {
    private final Long id;
    private final int manifactureYear;
    private final String brand;
    private final String model;
    private final String color;
    private Long price;
    private String registrationNumber;

    public Car(Long id, int manufactureYear, String brand, String model, String color, Long price, String registrationNumber) {
        this.id = id;
        this.manifactureYear = manufactureYear;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    public Car(Long id, int manufactureYear, String brand, String model, String color, String registrationNumber) {
        this(id, manufactureYear, brand, model, color, null, registrationNumber);
    }

    public Car(Long id, int manufactureYear, String brand, String model, String color) {
        this(id, manufactureYear, brand, model, color, null, null);
    }

    public Car(Long id, int manufactureYear, String brand, String model, String color, Long price) {
        this(id, manufactureYear, brand, model, color, price, null);
    }


    public Long getId() {
        return id;
    }

    public int getManufactureYear() {
        return manifactureYear;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Long getPrice() {
        return price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", manufactureYear=" + manifactureYear +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return getId().equals(car.getId()) &&
                getManufactureYear() == car.getManufactureYear() &&
                getBrand().equals(car.getBrand()) &&
                getModel().equals(car.getModel()) &&
                getColor().equals(car.getColor()) &&
                Objects.equals(getPrice(), car.getPrice()) &&
                Objects.equals(getRegistrationNumber(), car.getRegistrationNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getManufactureYear(), getBrand(), getModel(), getColor(), getPrice(), getRegistrationNumber());
    }
}

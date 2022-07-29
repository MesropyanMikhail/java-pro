package ua.ithillel.homeworks.hw8.carhierarchy;

import ua.ithillel.homeworks.hw8.utils.Display;

abstract public class Car implements Display {
    protected int maxSpeed;
    protected int fuelConsumption;
    protected double price;

    public Car(int maxSpeed, int fuelConsumption, double price) {
        this.maxSpeed = maxSpeed;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
    }

    abstract int getMaxSpeed();

    abstract int getFuelConsumption();

    abstract double getPrice();
}


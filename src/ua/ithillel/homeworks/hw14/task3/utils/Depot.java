package ua.ithillel.homeworks.hw14.task3.utils;

import ua.ithillel.homeworks.hw14.task3.utils.car.Car;

public interface Depot {
    void addCar(Car car);
    double fleetCost();
    void sortCars();
    Car[] findSpeedCars(int startSpeedRange, int endSpeedRange);
}

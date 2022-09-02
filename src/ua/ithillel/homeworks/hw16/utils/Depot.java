package ua.ithillel.homeworks.hw16.utils;

import ua.ithillel.homeworks.hw16.utils.car.Car;

import java.util.ArrayList;

public interface Depot {
    void addCar(Car car);

    double fleetCost();

    void sortCars();

    ArrayList<Car> findSpeedCars(int startSpeedRange, int endSpeedRange);
}

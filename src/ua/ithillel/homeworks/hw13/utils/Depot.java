package ua.ithillel.homeworks.hw13.utils;

import ua.ithillel.homeworks.hw13.utils.car.Car;

public interface Depot {

    Car[] addCar(Car[] cars, Car car);

    double fleetCost(Car[] cars);

    Car[] sortCars(Car[] cars);

    Car[] findSpeedCars(Car[] cars, int startSpeedRange, int endSpeedRange);

}

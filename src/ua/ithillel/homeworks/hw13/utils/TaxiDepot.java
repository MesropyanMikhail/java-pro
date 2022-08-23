package ua.ithillel.homeworks.hw13.utils;

import ua.ithillel.homeworks.hw13.utils.car.Car;


import java.util.Arrays;
import java.util.Comparator;

public class TaxiDepot implements Depot {

    public static Car[] cars = new Car[]{};

    public Car[] addCar(Car[] cars, Car car) {
        cars = arrayCopy(cars);
        cars[cars.length - 1] = car;
        return cars;
    }

    public double fleetCost(Car[] cars) {
        double fleetCost = 0;
        for (Car car : cars) {
            fleetCost += car.getPrice();
        }
        return fleetCost;
    }

    public Car[] sortCars(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            for (int j = i; j > 0; j--) {
                if (cars[j].getFuelConsumption() < cars[j - 1].getFuelConsumption()) {
                    Car temp = cars[j - 1];
                    cars[j - 1] = cars[j];
                    cars[j] = temp;
                }
            }
        }
        return cars;
    }

    public Car[] sortCarsInterfaceImplementation(Car[] cars) {
        Comparator<Car> comparator = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                int car1FuelConsumption = car1.getFuelConsumption();
                int car2FuelConsumption = car2.getFuelConsumption();

                return (car1.getFuelConsumption() > car2FuelConsumption) ? -1 : (car1FuelConsumption == car2FuelConsumption) ? 0 : 1;
            }
        };
        Arrays.sort(cars, comparator);
        return cars;
    }

    public Car[] sortCarsLambdaExpression(Car[] cars) {
        Comparator<Car> comparator;
        comparator = (x, y)-> {
            if (x.getFuelConsumption() > y.getFuelConsumption()) {
                return 1;
            }else if (x.getFuelConsumption() == y.getFuelConsumption()) {
                return 0;
            }else {
                return -1;
            }
        };
        Arrays.sort(cars, comparator);
        return cars;
    }

    public Car[] sortCarsMethodReference(Car[] cars) {
        Arrays.sort(cars, CarUtils::compare);
        return cars;
    }

    public Car[] findSpeedCars(Car[] cars, int startSpeedRange, int endSpeedRange) {
        Car[] carRelevantSpeed = new Car[]{};
        for (Car car : cars) {
            if ((car.getMaxSpeed() > startSpeedRange) && ((car.getMaxSpeed() < endSpeedRange))) {
                carRelevantSpeed = arrayCopy(carRelevantSpeed);
                carRelevantSpeed[carRelevantSpeed.length - 1] = car;
            }
        }
        return carRelevantSpeed;
    }

    public static Car[] arrayCopy(Car[] cars) {
        int arraySize = cars.length;
        Car[] temp = new Car[arraySize + 1];
        for (int i = 0; i < arraySize; i++) {
            temp[i] = cars[i];
        }
        return temp;
    }

}



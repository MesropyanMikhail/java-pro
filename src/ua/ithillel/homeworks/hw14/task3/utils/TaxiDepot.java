package ua.ithillel.homeworks.hw14.task3.utils;


import ua.ithillel.homeworks.hw14.task3.utils.car.Car;

import java.util.ArrayList;
import java.util.Comparator;

public class TaxiDepot implements Depot {

    private ArrayList<Car> cars =  new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public double fleetCost() {
        double fleetCost = 0;
        for (Car car : cars) {
            fleetCost += car.getPrice();
        }
        return fleetCost;
    }

    public void sortCars() {
        cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getFuelConsumption() - o2.getFuelConsumption();
            }
        });
    }

    public void sortCarsInterfaceImplementation() {
        Comparator<Car> comparator = new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2) {
                int car1FuelConsumption = car1.getFuelConsumption();
                int car2FuelConsumption = car2.getFuelConsumption();

                return (car1.getFuelConsumption() > car2FuelConsumption) ? -1 : (car1FuelConsumption == car2FuelConsumption) ? 0 : 1;
            }
        };
        cars.sort(comparator);

    }

    public void sortCarsLambdaExpression() {
        Comparator<Car> comparator;
        comparator = (x, y) -> {
            if (x.getFuelConsumption() > y.getFuelConsumption()) {
                return 1;
            } else if (x.getFuelConsumption() == y.getFuelConsumption()) {
                return 0;
            } else {
                return -1;
            }
        };
        cars.sort(comparator);
    }

    public void sortCarsMethodReference() {
        cars.sort(CarUtils::compare);
    }

    public Car[] findSpeedCars(int startSpeedRange, int endSpeedRange) {
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

    public ArrayList<Car> getCars() {
        return cars;
    }
}
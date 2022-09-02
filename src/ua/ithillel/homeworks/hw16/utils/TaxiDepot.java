package ua.ithillel.homeworks.hw16.utils;


import ua.ithillel.homeworks.hw16.utils.car.Car;
import ua.ithillel.homeworks.hw16.utils.car.Minibus;
import ua.ithillel.homeworks.hw16.utils.car.PassengerCar;
import ua.ithillel.homeworks.hw16.utils.car.Truck;

import java.util.*;
import java.util.stream.Collectors;


public class TaxiDepot implements Depot {

    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public double fleetCost() {
        Optional<Double> fleetCost = cars.stream().map(c -> c.getPrice()).reduce((a, b) -> a + b);
        return (fleetCost.isPresent()) ? fleetCost.get() : 0;
    }

    public void sortCars() {
        cars = (ArrayList<Car>) cars.stream().sorted(CarUtils::compare).collect(Collectors.toList());
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

    public ArrayList<Car> findSpeedCars(int startSpeedRange, int endSpeedRange) {
        return (ArrayList<Car>) cars.stream().filter(c -> c.getMaxSpeed() > startSpeedRange && c.getMaxSpeed() < endSpeedRange).collect(Collectors.toList());
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    @Override
    public String toString() {
        return cars.stream().map(c -> {
            String result;
            if (c instanceof Minibus) {
                return "Minibus{" + "maxSpeed=" + c.getMaxSpeed() + ", fuelConsumption=" + c.getFuelConsumption() + ", price=" + c.getPrice() + ", numberOfPassengers=" + ((Minibus) c).getNumberOfPassengers() + '}';
            } else if (c instanceof PassengerCar) {
                return "PassengerCar{" + "maxSpeed=" + c.getMaxSpeed() + ", fuelConsumption=" + c.getFuelConsumption() + ", price=" + c.getPrice() + ", airСonditioner=" + ((PassengerCar) c).isAirСonditioner() + '}';
            } else {
                return "Truck{" + "maxSpeed=" + c.getMaxSpeed() + ", fuelConsumption=" + c.getFuelConsumption() + ", price=" + c.getPrice() + ", loadCapacity=" + ((Truck) c).getLoadCapacity() + '}';
            }
        }).collect(Collectors.joining("\n"));
    }
}
package ua.ithillel.homeworks.hw16.utils;


import ua.ithillel.homeworks.hw16.utils.car.Car;
import ua.ithillel.homeworks.hw16.utils.car.Minibus;
import ua.ithillel.homeworks.hw16.utils.car.PassengerCar;
import ua.ithillel.homeworks.hw16.utils.car.Truck;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaxiDepot implements Depot {

    private ArrayList<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public double fleetCost() {

        Stream<Car> carStream = cars.stream();
        Optional<Double> fleetCost = carStream.map(car -> car.getPrice()).reduce((a, b) -> a + b);
        /*double fleetCost = 0;
        for (Car car : cars) {
            fleetCost += car.getPrice();
        }*/
        return (fleetCost.isPresent()) ? fleetCost.get() : 0;
    }

    public void sortCars() {
        cars = (ArrayList<Car>) cars.stream().sorted(CarUtils::compare).collect(Collectors.toList());
       /*cars.sort(new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getFuelConsumption() - o2.getFuelConsumption();
            }
        });*/
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
        ArrayList<Car> carRelevantSpeed = (ArrayList<Car>) cars.stream().filter(car -> car.getMaxSpeed() > startSpeedRange && car.getMaxSpeed() < endSpeedRange).collect(Collectors.toList());
        /*ArrayList<Car> carRelevantSpeed = new ArrayList<Car>();
        for (Car car : cars) {
            if ((car.getMaxSpeed() > startSpeedRange) && ((car.getMaxSpeed() < endSpeedRange))) {
                carRelevantSpeed.add(car);
            }
        }*/
        return carRelevantSpeed;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    @Override
    public String toString() {

        String result = cars.stream().map(car -> "maxSpeed=" + car.getMaxSpeed() + ", fuelConsumption=" + car.getFuelConsumption() +
                ", price=" +  car.getPrice() + ((car instanceof Minibus)?((Minibus) car).getNumberOfPassengers():(car instanceof PassengerCar)?((PassengerCar) car).isAirСonditioner():(car instanceof Truck)?((Truck) car).getLoadCapacity():" ")).collect(Collectors.joining("\n"));
        return result;

    }
}
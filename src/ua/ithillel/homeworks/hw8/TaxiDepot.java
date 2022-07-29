package ua.ithillel.homeworks.hw8;

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



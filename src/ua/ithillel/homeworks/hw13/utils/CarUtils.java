package ua.ithillel.homeworks.hw13.utils;


import ua.ithillel.homeworks.hw13.utils.car.Car;

public class CarUtils {
    public static int compare(Car car1, Car car2) {
        int car1FuelConsumption = car1.getFuelConsumption();
        int car2FuelConsumption = car2.getFuelConsumption();
        return (car1FuelConsumption > car2FuelConsumption) ? 1 : (car1FuelConsumption == car2FuelConsumption) ? 0 : -1;
    }
}

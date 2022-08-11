package ua.ithillel.homeworks.hw8;

import ua.ithillel.homeworks.hw8.vehicle.car.*;
import ua.ithillel.homeworks.hw8.utils.TaxiDepot;

public class App {
    public static void main(String[] args) {

        PassengerCar passengerCar1 = new PassengerCar(180, 12, 2122.92, true);
        PassengerCar passengerCar2 = new PassengerCar(160, 8, 1346.57, false);
        Minibus minibus1 = new Minibus(100, 10, 15789.45, 10);
        Minibus minibus2 = new Minibus(120, 12, 17045.67, 12);
        Truck truck1 = new Truck(80, 25, 20085.74, 3500);
        Truck truck2 = new Truck(90, 35, 25058.2, 4500);

        TaxiDepot taxiDepot = new TaxiDepot();
        TaxiDepot.cars = taxiDepot.addCar(TaxiDepot.cars, passengerCar1);
        TaxiDepot.cars = taxiDepot.addCar(TaxiDepot.cars, passengerCar2);
        TaxiDepot.cars = taxiDepot.addCar(TaxiDepot.cars, minibus1);
        TaxiDepot.cars = taxiDepot.addCar(TaxiDepot.cars, minibus2);
        TaxiDepot.cars = taxiDepot.addCar(TaxiDepot.cars, truck1);
        TaxiDepot.cars = taxiDepot.addCar(TaxiDepot.cars, truck2);


        Car[] findSpeedCars = taxiDepot.findSpeedCars(TaxiDepot.cars, 85, 110);
        System.out.println("Машины в диапазоне скоростей");
        for (Car car : findSpeedCars) {
            car.display();
            //System.out.println(car.toString());
        }
        System.out.println();
        System.out.println("Общая стоимость машин " + taxiDepot.fleetCost(TaxiDepot.cars));
        System.out.println();

        //System.out.println(Arrays.toString(TaxiDepot.cars));
        System.out.println("До сортировки ");
        for (Car car : TaxiDepot.cars) {
            car.display();
            //System.out.println(car.toString());
        }
        System.out.println();
        System.out.println("После сортировки ");
        TaxiDepot.cars = taxiDepot.sortCars(TaxiDepot.cars);
        for (Car car : TaxiDepot.cars) {
            car.display();
            //System.out.println(car.toString());
        }
    }
}

package ua.ithillel.homeworks.hw8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaxiDepotTest {

    @Test
    void whenAddCar_thenReturnCarsArray() {
        PassengerCar passengerCar1 = new PassengerCar(180, 12, 2., true);
        PassengerCar passengerCar2 = new PassengerCar(160, 8, 3., false);

        Car[] expected = new Car[]{passengerCar1, passengerCar2};
        Car[] actual = new Car[]{};
        TaxiDepot taxiDepot = new TaxiDepot();
        actual = taxiDepot.addCar(actual, passengerCar1);
        actual = taxiDepot.addCar(actual, passengerCar2);

        assertArrayEquals(expected, actual);
    }

    @Test
    void whenFleetCost_thenReturnFleetCost() {
        PassengerCar passengerCar1 = new PassengerCar(180, 12, 2., true);
        PassengerCar passengerCar2 = new PassengerCar(160, 8, 3., false);

        Car[] cars = new Car[]{};
        TaxiDepot taxiDepot = new TaxiDepot();
        cars = taxiDepot.addCar(cars, passengerCar1);
        cars = taxiDepot.addCar(cars, passengerCar2);

        assertEquals(5, taxiDepot.fleetCost(cars));
    }

    @Test
    void whenSortCars_thenReturnSortArrayCar() {

        PassengerCar passengerCar1 = new PassengerCar(180, 12, 2., true);
        PassengerCar passengerCar2 = new PassengerCar(160, 8, 3., false);
        Minibus minibus1 = new Minibus(100, 10, 5., 10);
        Minibus minibus2 = new Minibus(120, 12, 7., 12);
        Truck truck1 = new Truck(80, 25, 2., 3500);
        Truck truck2 = new Truck(90, 35, 1., 4500);

        Car[] actual = new Car[]{};
        TaxiDepot taxiDepot = new TaxiDepot();
        actual = taxiDepot.addCar(actual, passengerCar1);
        actual = taxiDepot.addCar(actual, passengerCar2);
        actual = taxiDepot.addCar(actual, minibus1);
        actual = taxiDepot.addCar(actual, minibus2);
        actual = taxiDepot.addCar(actual, truck1);
        actual = taxiDepot.addCar(actual, truck2);
        actual = taxiDepot.sortCars(actual);

        Car[] expected = new Car[]{passengerCar2, minibus1, passengerCar1, minibus2, truck1, truck2};
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenFindSpeedCars_thenReturnArrayCarInSpeedRange() {

        PassengerCar passengerCar1 = new PassengerCar(180, 12, 2., true);
        PassengerCar passengerCar2 = new PassengerCar(160, 8, 3., false);
        Minibus minibus1 = new Minibus(100, 10, 5., 10);
        Minibus minibus2 = new Minibus(120, 12, 7., 12);
        Truck truck1 = new Truck(80, 25, 2., 3500);
        Truck truck2 = new Truck(90, 35, 1., 4500);

        Car[] actual = new Car[]{};
        TaxiDepot taxiDepot = new TaxiDepot();
        actual = taxiDepot.addCar(actual, passengerCar1);
        actual = taxiDepot.addCar(actual, passengerCar2);
        actual = taxiDepot.addCar(actual, minibus1);
        actual = taxiDepot.addCar(actual, minibus2);
        actual = taxiDepot.addCar(actual, truck1);
        actual = taxiDepot.addCar(actual, truck2);
        actual = taxiDepot.findSpeedCars(actual, 85, 110);

        Car[] expected = new Car[]{minibus1, truck2};
        assertArrayEquals(expected, actual);
    }

    @Test
    void whenArrayCopy_thenReturnArrayCopyPlusOneElement() {
        PassengerCar passengerCar1 = new PassengerCar(180, 12, 2., true);
        PassengerCar passengerCar2 = new PassengerCar(160, 8, 3., false);
        Car[] actual = TaxiDepot.arrayCopy(new Car[]{passengerCar1, passengerCar2});
        Car[] expected = new Car[]{passengerCar1, passengerCar2, null};
        assertArrayEquals(expected, actual);
    }
}
package ua.ithillel.homeworks.hw11;

import ua.ithillel.homeworks.hw11.car.Car;
import ua.ithillel.homeworks.hw11.car.Minibus;
import ua.ithillel.homeworks.hw11.car.PassengerCar;
import ua.ithillel.homeworks.hw11.car.Truck;
import ua.ithillel.homeworks.hw11.utils.TaxiDepot;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        TaxiDepot taxiDepot = new TaxiDepot();

        //loadFile("C:\\Lerning\\Hillel\\java-pro-mesopyan\\src\\ua\\ithillel\\homeworks\\hw11\\carin.csv", TaxiDepot.cars, taxiDepot);
        loadFile(args[0], TaxiDepot.cars, taxiDepot);

        System.out.println("До сортировки ");
        for (Car car : TaxiDepot.cars) {
            car.display();
        }
        System.out.println("\nПосле сортировки ");
        TaxiDepot.cars = taxiDepot.sortCars(TaxiDepot.cars);
        for (Car car : TaxiDepot.cars) {
            car.display();
        }
        //saveFile("C:\\Lerning\\Hillel\\java-pro-mesopyan\\src\\ua\\ithillel\\homeworks\\hw11\\carout.csv", TaxiDepot.cars);
        saveFile(args[1], TaxiDepot.cars);
    }

    private static void loadFile(String filePath, Car[] cars, TaxiDepot taxiDepot) {
        byte[] allBytes;
        String[] carParameter;
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            allBytes = fileInputStream.readAllBytes();
            int i = 0;
            for (String car : new String(allBytes).split(";")) {
                carParameter = car.split(",");
                if (defineClassName(carParameter[0]).equals("Minibus")) {
                    TaxiDepot.cars = taxiDepot.addCar(TaxiDepot.cars, new Minibus(Integer.valueOf(carParameter[2]), Integer.valueOf(carParameter[3]), Double.valueOf(carParameter[4]), Integer.valueOf(carParameter[1])));
                } else if (defineClassName(carParameter[0]).equals("PassengerCar")) {
                    TaxiDepot.cars = taxiDepot.addCar(TaxiDepot.cars, new PassengerCar(Integer.valueOf(carParameter[2]), Integer.valueOf(carParameter[3]), Double.valueOf(carParameter[4]), Boolean.valueOf(carParameter[1])));
                } else if (defineClassName(carParameter[0]).equals("Truck")) {
                    TaxiDepot.cars = taxiDepot.addCar(TaxiDepot.cars, new Truck(Integer.valueOf(carParameter[2]), Integer.valueOf(carParameter[3]), Double.valueOf(carParameter[4]), Integer.valueOf(carParameter[1])));
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String defineClassName(String className) {
        return ((String) className).trim();
    }

    private static void saveFile(String filePath, Car[] cars) {
        String buffer = "";
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
            for (Car car : cars) {
                buffer += defineСlassNameAddOption(car) + "," + car.getMaxSpeed() + "," + car.getFuelConsumption() + "," + car.getPrice() + ";" + System.lineSeparator();
            }
            fileOutputStream.write(buffer.getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String defineСlassNameAddOption(Car car) {
        String compoundString;
        if (car instanceof Minibus) {
            compoundString = "Minibus" + "," + ((Minibus) car).getNumberOfPassengers();
        } else if (car instanceof PassengerCar) {
            compoundString = "PassengerCar" + "," + ((PassengerCar) car).isAirСonditioner();
        } else {
            compoundString = "Truck" + "," + ((Truck) car).getLoadCapacity();
        }
        return compoundString;
    }

}

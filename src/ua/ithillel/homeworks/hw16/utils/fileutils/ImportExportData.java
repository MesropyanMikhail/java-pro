package ua.ithillel.homeworks.hw16.utils.fileutils;

import ua.ithillel.homeworks.hw16.utils.TaxiDepot;
import ua.ithillel.homeworks.hw16.utils.car.Car;
import ua.ithillel.homeworks.hw16.utils.car.Minibus;
import ua.ithillel.homeworks.hw16.utils.car.PassengerCar;
import ua.ithillel.homeworks.hw16.utils.car.Truck;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ImportExportData {
    public static void loadFile(String filePath, TaxiDepot taxiDepot) {
        byte[] allBytes;
        String[] carParameter;
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            allBytes = fileInputStream.readAllBytes();
            int i = 0;
            for (String car : new String(allBytes).split(";")) {
                carParameter = car.split(",");
                if (defineClassName(carParameter[0]).equals("Minibus")) {
                    taxiDepot.addCar(new Minibus(Integer.valueOf(carParameter[2]), Integer.valueOf(carParameter[3]), Double.valueOf(carParameter[4]), Integer.valueOf(carParameter[1])));
                } else if (defineClassName(carParameter[0]).equals("PassengerCar")) {
                    taxiDepot.addCar(new PassengerCar(Integer.valueOf(carParameter[2]), Integer.valueOf(carParameter[3]), Double.valueOf(carParameter[4]), Boolean.valueOf(carParameter[1])));
                } else if (defineClassName(carParameter[0]).equals("Truck")) {
                    taxiDepot.addCar(new Truck(Integer.valueOf(carParameter[2]), Integer.valueOf(carParameter[3]), Double.valueOf(carParameter[4]), Integer.valueOf(carParameter[1])));
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

    public static void saveFile(String filePath, TaxiDepot taxiDepot) {
        String buffer = "";
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
            for (Car car : taxiDepot.getCars()) {
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

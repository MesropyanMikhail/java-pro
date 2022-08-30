package ua.ithillel.homeworks.hw14.task3;

import ua.ithillel.homeworks.hw14.task3.utils.TaxiDepot;
import ua.ithillel.homeworks.hw14.task3.utils.car.Car;
import ua.ithillel.homeworks.hw14.task3.utils.fileutils.ImportExportData;

public class App {

    public static void main(String[] args) {

        TaxiDepot taxiDepot = new TaxiDepot();
        ImportExportData.loadFile("C:\\Lerning\\Hillel\\java-pro-mesopyan\\src\\ua\\ithillel\\homeworks\\hw13\\carin.csv", taxiDepot);
        //ImportExportData.loadFile(args[0], TaxiDepot.cars, taxiDepot);

        System.out.println("До сортировки ");
        for (Car car : taxiDepot.getCars()) {
            car.display();
        }
        System.out.println("\nПосле сортировки ");
        //taxiDepot.sortCars();
        //taxiDepot.sortCarsLambdaExpression();
        taxiDepot.sortCarsInterfaceImplementation();
        //taxiDepot.sortCarsMethodReference();

        //System.out.println(taxiDepot.fleetCost());
        for (Car car : taxiDepot.getCars()) {
            car.display();
        }
        ImportExportData.saveFile("C:\\Lerning\\Hillel\\java-pro-mesopyan\\src\\ua\\ithillel\\homeworks\\hw13\\carout.csv", taxiDepot);
        //ImportExportData.saveFile(args[1], TaxiDepot.cars);

        System.out.println();
        System.out.println("Find speed cars 79-120");
        for (Car car:taxiDepot.findSpeedCars(79, 120)) {
            car.display();
        }
    }

}

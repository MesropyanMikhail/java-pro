package ua.ithillel.homeworks.hw16;

import ua.ithillel.homeworks.hw16.utils.TaxiDepot;
import ua.ithillel.homeworks.hw16.utils.car.Car;
import ua.ithillel.homeworks.hw16.utils.fileutils.ImportExportData;

public class App {

    public static void main(String[] args) {

        TaxiDepot taxiDepot = new TaxiDepot();
        ImportExportData.loadFile("C:\\Lerning\\Hillel\\java-pro-mesopyan\\src\\ua\\ithillel\\homeworks\\hw16\\carin.csv", taxiDepot);
        //ImportExportData.loadFile(args[0], taxiDepot);

        System.out.println("До сортировки ");
        for (Car car : taxiDepot.getCars()) {
            car.display();
        }
        System.out.println("\nПосле сортировки ");
        taxiDepot.sortCars();
        //taxiDepot.sortCarsLambdaExpression();
        //taxiDepot.sortCarsInterfaceImplementation();
        //taxiDepot.sortCarsMethodReference();

        //System.out.println(taxiDepot.fleetCost());
        for (Car car : taxiDepot.getCars()) {
            car.display();
        }
        ImportExportData.saveFile("C:\\Lerning\\Hillel\\java-pro-mesopyan\\src\\ua\\ithillel\\homeworks\\hw16\\carout.csv", taxiDepot);
        //ImportExportData.saveFile(args[1], taxiDepot);

        System.out.println();
        System.out.println("Find speed cars 79-120");
        for (Car car : taxiDepot.findSpeedCars(79, 120)) {
            car.display();
        }
        System.out.println(taxiDepot.fleetCost());

        System.out.println(taxiDepot.toString());
    }

}

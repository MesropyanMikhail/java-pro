package ua.ithillel.homeworks.hw4;

public class Runner {

    public static void main(String[] args) {

        Car Car1 = new Car("Mitsubishi", "Lancer", 2006, "red", 8000, "8643816");
        Car Car2 = new Car("Mitsubishi", "Eclipse", 2000, "silver", 10000, "8643817");
        Car Car3 = new Car("Subaru", "Impreza", 2004, "blue", 1500, "8643818");
        Car Car4 = new Car("Subaru", "Forester", 2006, "black", 5000, "8643819");
        Car Car5 = new Car("Mitsubishi", "Eclipse", 2011, "silver", 10000, "8643817");
        Car[] cars = {Car1, Car2, Car3, Car4, Car5};

        CarProcessor processor = new CarProcessor(cars);
        processor.listCarsBarand("Mitsubishi");
        //processor.listCarsModelExploited("Eclipse", 20);
        //processor.listCarsProductionYearPrice(2006, 6000);

    }
}

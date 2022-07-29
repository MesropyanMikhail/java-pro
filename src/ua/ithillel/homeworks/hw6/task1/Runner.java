package ua.ithillel.homeworks.hw6.task1;

public class Runner {

    public static void main(String[] args) {
        Car car1 = new Car("Mitsubishi", "Lancer", 2006, "red", 8000, "8643816");
        Car car2 = new Car("Mitsubishi", "Eclipse", 2000, "silver", 10000, "8643817");
        Car car3 = new Car("Subaru", "Impreza", 2004, "blue", 1500, "8643818");
        Car car4 = new Car("Subaru", "Forester", 2006, "black", 5000, "8643819");
        Car car5 = new Car("Mitsubishi", "Eclipse", 2011, "silver", 10000, "8643817");
        Car[] cars = {car1, car2, car3, car4, car5};

        /*CarProcessor processor = new CarProcessor(cars);
        CarProcessor processor = new CarProcessor();
        processor.listCarsBarand("Mitsubishi");
        processor.listCarsModelExploited("Eclipse", 20);
        processor.listCarsProductionYearPrice(2006, 6000);*/

        Car[] carsSecond = {car1, car3, car4, car5};
        CarProcessor processorSecond = new CarProcessor();
        processorSecond.listCarsBarand(carsSecond, "Mitsubishi");
        processorSecond.listCarsModelExploited(cars, "Eclipse", 20);
        processorSecond.listCarsProductionYearPrice(cars, 2006, 6000);
    }
}

package ua.ithillel.homeworks.hw4;

public class CarProcessor {
    Car[] cars;

    public CarProcessor(Car[] cars) {
        this.cars = cars;
    }

    public void listCarsBarand(String brand) {
        boolean needHeader = true;
        for (Car car : cars) {
            if (car.brand.equals(brand)) {
                printCar(car, needHeader);
                needHeader = false;
            }
        }
    }

    public void listCarsModelExploited(String model, int years) {
        int currentYear = 2022;
        boolean needHeader = true;
        for (Car car : cars) {
            if (car.model.equals(model) && ((currentYear - car.productionYear) > years)) {
                printCar(car, needHeader);
                needHeader = false;
            }
        }
    }

    public void listCarsProductionYearPrice(int productionYear, int price) {
        boolean needHeader = true;
        for (Car car : cars) {
            if ((car.productionYear == productionYear) && (car.price > price)) {
                printCar(car, needHeader);
                needHeader = false;
            }
        }
    }

    public void printCar(Car car, boolean needHeader) {
        if (needHeader) {
            String header = String.format("%10s %10s %10s %10s %10s %15s", "Brand", "Model", "Prod year", "Color", "Price", "Reg. number");
            divideLine(header.length());
            System.out.println(header);
            divideLine(header.length());
        }
        System.out.println(String.format("%10s %10s %10d %10s %10d %15s", car.brand, car.model, car.productionYear, car.color, car.price, car.registrationNumber));
        System.out.println();
        //System.out.println(car.toString());
    }

    private void divideLine(int headerLength) {
        for (int i = 0; i < headerLength; i++) {
            System.out.print("=");
        }
        System.out.print("\n");
    }

}

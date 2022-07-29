package ua.ithillel.homeworks.hw4;

public class Car {
    public String brand;
    public String model;
    public int productionYear;
    public String color;
    public int price;
    public String registrationNumber;

    public Car(String brand, String model, int productionYear, String color, int price, String registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.color = color;
        this.price = price;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear='" + productionYear + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }
}

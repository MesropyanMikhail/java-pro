package ua.ithillel.homeworks.hw14.task3.utils.car;

public class Minibus extends Car {
    int numberOfPassengers;

    public Minibus(int maxSpeed, int fuelConsumption, double price, int numberOfPassengers) {
        super(maxSpeed, fuelConsumption, price);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public int getMaxSpeed() {
        return super.maxSpeed;
    }

    @Override
    public int getFuelConsumption() {
        return super.fuelConsumption;
    }

    @Override
    public double getPrice() {
        return super.price;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    @Override
    public String toString() {
        return "Minibus{" +
                "maxSpeed=" + getMaxSpeed() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", price=" + getPrice() +
                ", numberOfPassengers=" + numberOfPassengers +
                '}';
    }
}

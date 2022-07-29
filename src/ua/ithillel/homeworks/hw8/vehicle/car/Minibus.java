package ua.ithillel.homeworks.hw8.carhierarchy;

public class Minibus extends Car {
    int numberOfPassengers;

    public Minibus(int maxSpeed, int fuelConsumption, double price, int numberOfPassengers) {
        super(maxSpeed, fuelConsumption, price);
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    int getMaxSpeed() {
        return super.maxSpeed;
    }

    @Override
    int getFuelConsumption() {
        return super.fuelConsumption;
    }

    @Override
    double getPrice() {
        return super.price;
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

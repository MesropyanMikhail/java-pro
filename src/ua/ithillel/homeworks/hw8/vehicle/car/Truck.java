package ua.ithillel.homeworks.hw8.carhierarchy;

public class Truck extends Car {

    int loadCapacity;

    public Truck(int maxSpeed, int fuelConsumption, double price, int loadCapacity) {
        super(maxSpeed, fuelConsumption, price);
        this.loadCapacity = loadCapacity;
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
        return "Truck{" +
                "maxSpeed=" + getMaxSpeed() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", price=" + getPrice() +
                ", loadCapacity=" + loadCapacity +
                '}';
    }
}

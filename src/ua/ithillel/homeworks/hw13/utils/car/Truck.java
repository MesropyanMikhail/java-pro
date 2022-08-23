package ua.ithillel.homeworks.hw13.utils.car;

public class Truck extends Car {

    int loadCapacity;

    public Truck(int maxSpeed, int fuelConsumption, double price, int loadCapacity) {
        super(maxSpeed, fuelConsumption, price);
        this.loadCapacity = loadCapacity;
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

    public int getLoadCapacity() {
        return loadCapacity;
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

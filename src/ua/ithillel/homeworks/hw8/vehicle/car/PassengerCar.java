package ua.ithillel.homeworks.hw8.vehicle.car;

public class PassengerCar extends Car {

    boolean airСonditioner;

    public PassengerCar(int maxSpeed, int fuelConsumption, double price, boolean airСonditioner) {
        super(maxSpeed, fuelConsumption, price);
        this.airСonditioner = airСonditioner;
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

    @Override
    public String toString() {
        return "PassengerCar{" +
                "maxSpeed=" + getMaxSpeed() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", price=" + getPrice() +
                ", airСonditioner=" + airСonditioner +
                '}';
    }
}

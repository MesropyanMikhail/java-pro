package ua.ithillel.homeworks.hw8;

public class PassengerCar extends Car {

    boolean airСonditioner;

    public PassengerCar(int maxSpeed, int fuelConsumption, double price, boolean airСonditioner) {
        super(maxSpeed, fuelConsumption, price);
        this.airСonditioner = airСonditioner;
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
        return "PassengerCar{" +
                "maxSpeed=" + getMaxSpeed() +
                ", fuelConsumption=" + getFuelConsumption() +
                ", price=" + getPrice() +
                ", airСonditioner=" + airСonditioner +
                '}';
    }
}

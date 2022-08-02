package ua.ithillel.homeworks.hw9.model;

public class Accessory {
    private String title;
    private double price;

    public Accessory() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return title + ", price=" + price;

    }
}

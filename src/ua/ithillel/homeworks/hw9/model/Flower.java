package ua.ithillel.homeworks.hw9.model;

public class Flower {
    private String title;
    private double price;
    private int daysToLive;
    private int stemLength;

    public Flower() {
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

    public int getDaysToLive() {
        return daysToLive;
    }

    public void setDaysToLive(int daysToLive) {
        this.daysToLive = daysToLive;
    }

    public int getStemLength() {
        return stemLength;
    }

    public void setStemLength(int stemLength) {
        this.stemLength = stemLength;
    }

    @Override
    public String toString() {
        return  title + " price=" + price +
                ", daysToLive=" + daysToLive +
                ", stemLength=" + stemLength;
    }
}

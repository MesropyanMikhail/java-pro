package ua.ithillel.homeworks.hw9.model;

import ua.ithillel.homeworks.hw9.utils.ArrayUtils;

public class Bouquet {
    private Flower[] flowers = new Flower[]{};
    private Accessory[] accessories = new Accessory[]{};

    public Bouquet() {

    }

    public void addFlower(Flower flower) {
        flowers = ArrayUtils.extendsArrayWithAddNewItem(flower, flowers);
    }

    public void addAccessory(Accessory accessory) {
        accessories = ArrayUtils.extendsArrayWithAddNewItem(accessory, accessories);
    }

    public double totalСost() {
        double totalСost = 0;

        for (Flower flower : flowers) {
            totalСost += flower.getPrice();
        }
        for (Accessory accessory : accessories) {
            totalСost += accessory.getPrice();
        }

        return totalСost;
    }

    public Flower[] getFlowers() {
        return flowers;
    }

    public void setFlowers(Flower[] flowers) {
        this.flowers = flowers;
    }

    @Override
    public String toString() {
        String result = "";

        if (flowers.length > 0) {
            result += "\tFlowers:\n";
        }
        for (Flower flower : flowers) {
            result += " \t\t\t" + flower.getTitle() + " price " + flower.getPrice() + " days to live " + flower.getDaysToLive() + " stem length " + flower.getStemLength() + "\n";
        }

        if (accessories.length > 0) {
            result += "\tAccessories:\n";
        }
        for (Accessory accessory : accessories) {
            result += " \t\t\t" + accessory.getTitle() + " price " + accessory.getPrice() + "\n";
        }
        return result;
    }
}

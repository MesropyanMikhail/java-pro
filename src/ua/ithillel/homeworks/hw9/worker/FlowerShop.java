package ua.ithillel.homeworks.hw9.worker;

import ua.ithillel.homeworks.hw9.model.Accessory;
import ua.ithillel.homeworks.hw9.model.Bouquet;
import ua.ithillel.homeworks.hw9.model.Flower;
import ua.ithillel.homeworks.hw9.utils.ArrayUtils;

public class FlowerShop {
    private Bouquet[] bouquets = new Bouquet[]{};

    public void addBouquet(Bouquet bouquetToAdd) {
        bouquets = ArrayUtils.extendsArrayWithAddNewItem(bouquetToAdd, bouquets);
    }

    public void addFlowerToBouquet(Flower flowerToAdd, Bouquet currentBouquet) {
        currentBouquet.addFlower(flowerToAdd);
    }

    public void addAccessoryToBouquet(Accessory accessoryToAdd, Bouquet currentBouquet) {
        currentBouquet.addAccessory(accessoryToAdd);
    }

    public Bouquet[] getBouquets() {
        return bouquets;
    }
}

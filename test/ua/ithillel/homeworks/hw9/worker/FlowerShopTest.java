package ua.ithillel.homeworks.hw9.worker;

import org.junit.jupiter.api.Test;
import ua.ithillel.homeworks.hw9.model.Accessory;
import ua.ithillel.homeworks.hw9.model.Bouquet;
import ua.ithillel.homeworks.hw9.model.Flower;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FlowerShopTest {

    @Test
    void addBouquet() {
        Bouquet[] expectedBouquet = new Bouquet[1];
        Bouquet bouquet1 = new Bouquet();
        expectedBouquet[0] = bouquet1;
        FlowerShop flowerShop = new FlowerShop();
        flowerShop.addBouquet(bouquet1);
        assertArrayEquals(expectedBouquet, flowerShop.getBouquets());
    }

    @Test
    void addFlowerToBouquet() {
        Bouquet[] expectedBouquet = new Bouquet[1];
        Bouquet bouquet1 = new Bouquet();
        Flower flower1 = new Flower();
        flower1.setTitle("carnation");
        flower1.setPrice(12.5);
        flower1.setDaysToLive(5);
        flower1.setStemLength(50);
        bouquet1.addFlower(flower1);
        expectedBouquet[0] = bouquet1;
        FlowerShop flowerShop = new FlowerShop();
        flowerShop.addBouquet(bouquet1);
        flowerShop.addFlowerToBouquet(flower1,flowerShop.getBouquets()[0]);
        Bouquet[] acctualBouquet = flowerShop.getBouquets();
        assertArrayEquals(expectedBouquet, acctualBouquet);
    }

    @Test
    void addAccessoryToBouquet() {
        Bouquet[] expectedBouquet = new Bouquet[1];
        Bouquet bouquet1 = new Bouquet();
        Accessory accessory1 = new Accessory();
        accessory1.setTitle("butterfly");
        accessory1.setPrice(25.4);
        bouquet1.addAccessory(accessory1);
        expectedBouquet[0] = bouquet1;
        FlowerShop flowerShop = new FlowerShop();
        flowerShop.addBouquet(bouquet1);
        flowerShop.addAccessoryToBouquet(accessory1,flowerShop.getBouquets()[0]);
        Bouquet[] acctualBouquet = flowerShop.getBouquets();
        assertArrayEquals(expectedBouquet, acctualBouquet);
    }

}
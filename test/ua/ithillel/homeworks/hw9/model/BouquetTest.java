package ua.ithillel.homeworks.hw9.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BouquetTest {

    @Test
    void totalСost() {
        Bouquet bouquet = new Bouquet();

        Flower flower1 = new Flower();
        flower1.setTitle("carnation");
        flower1.setPrice(12.5);
        flower1.setDaysToLive(5);
        flower1.setStemLength(50);

        Flower flower2 = new Flower();
        flower2.setTitle("carnation");
        flower2.setPrice(12.5);
        flower2.setDaysToLive(5);
        flower2.setStemLength(50);


        Accessory accessory1 = new Accessory();
        accessory1.setTitle("butterfly");
        accessory1.setPrice(25.5);

        Accessory accessory2 = new Accessory();
        accessory2.setTitle("dragonfly");
        accessory2.setPrice(49.5);

        bouquet.addFlower(flower1);
        bouquet.addFlower(flower2);
        bouquet.addAccessory(accessory1);
        bouquet.addAccessory(accessory2);

        assertEquals(100, bouquet.totalСost());
    }
}
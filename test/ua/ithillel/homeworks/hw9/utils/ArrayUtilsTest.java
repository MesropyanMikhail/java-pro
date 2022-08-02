package ua.ithillel.homeworks.hw9.utils;

import org.junit.jupiter.api.Test;
import ua.ithillel.homeworks.hw9.model.Accessory;
import ua.ithillel.homeworks.hw9.model.Bouquet;
import ua.ithillel.homeworks.hw9.model.Flower;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    @Test
    void extendsArrayWithAddNewItemFlower() {

        Flower[] expectedFlowers = new Flower[1];
        Flower flower1 = new Flower();
        flower1.setTitle("carnation");
        flower1.setPrice(12.5);
        flower1.setDaysToLive(5);
        flower1.setStemLength(50);
        expectedFlowers[0] = flower1;
        Flower[] acctualFlowers = new Flower[]{};
        acctualFlowers = ArrayUtils.extendsArrayWithAddNewItem(flower1, acctualFlowers);
        assertArrayEquals(expectedFlowers, acctualFlowers);

    }

    @Test
    void extendsArrayWithAddNewItemAccessory() {
        Accessory[] expectedAccessory = new Accessory[2];
        Accessory accessory1 = new Accessory();
        accessory1.setTitle("butterfly");
        accessory1.setPrice(25.5);

        Accessory accessory2 = new Accessory();
        accessory2.setTitle("dragonfly");
        accessory2.setPrice(49.5);
        expectedAccessory[0] = accessory1;
        expectedAccessory[1] = accessory2;

        Accessory[] acctualAccessories = new Accessory[]{};
        acctualAccessories = ArrayUtils.extendsArrayWithAddNewItem(accessory1, acctualAccessories);
        acctualAccessories = ArrayUtils.extendsArrayWithAddNewItem(accessory2, acctualAccessories);
        assertArrayEquals(expectedAccessory, acctualAccessories);
    }

    @Test
    void extendsArrayWithAddNewItemBouquet() {
        Bouquet[] expectedBouquets = new Bouquet[2];
        Bouquet bouquet1 = new Bouquet();
        Bouquet bouquet2 = new Bouquet();
        expectedBouquets[0] = bouquet1;
        expectedBouquets[1] = bouquet2;

        Bouquet[] acctualBouquet = new Bouquet[]{};
        acctualBouquet = ArrayUtils.extendsArrayWithAddNewItem(bouquet1, acctualBouquet);
        acctualBouquet = ArrayUtils.extendsArrayWithAddNewItem(bouquet2, acctualBouquet);
        assertArrayEquals(expectedBouquets, acctualBouquet);
    }

    @Test
    void sortFlowersByDaysTolive() {
        Flower flower1 = new Flower();
        flower1.setTitle("carnation");
        flower1.setPrice(12.5);
        flower1.setDaysToLive(5);
        flower1.setStemLength(50);

        Flower flower2 = new Flower();
        flower2.setTitle("carnation");
        flower2.setPrice(12.5);
        flower2.setDaysToLive(3);
        flower2.setStemLength(50);

        Flower flower3 = new Flower();
        flower3.setTitle("carnation");
        flower3.setPrice(12.5);
        flower3.setDaysToLive(1);
        flower3.setStemLength(50);

        Bouquet expectedBouquet = new Bouquet();
        expectedBouquet.setFlowers(new Flower[]{flower3, flower2, flower1});
        Bouquet acctualBouquet = new Bouquet();
        acctualBouquet.setFlowers(new Flower[]{flower1, flower2, flower3});

        ArrayUtils.SortFlowersByDaysTolive(acctualBouquet);
        assertArrayEquals(expectedBouquet.getFlowers(), acctualBouquet.getFlowers());
    }

    @Test
    void findFlowersByStemLength() {
        Flower flower1 = new Flower();
        flower1.setTitle("carnation");
        flower1.setPrice(12.5);
        flower1.setDaysToLive(5);
        flower1.setStemLength(5);

        Flower flower2 = new Flower();
        flower2.setTitle("carnation");
        flower2.setPrice(12.5);
        flower2.setDaysToLive(3);
        flower2.setStemLength(10);

        Flower flower3 = new Flower();
        flower3.setTitle("carnation");
        flower3.setPrice(12.5);
        flower3.setDaysToLive(1);
        flower3.setStemLength(15);

        Flower[] flowers = new Flower[]{flower1, flower2, flower3};
        Flower[] expectedFlowers = new Flower[]{flower2};
        Flower[] acctualFlowers = ArrayUtils.findFlowersByStemLength(flowers, 9, 11);
        assertArrayEquals(expectedFlowers, acctualFlowers);
    }
}
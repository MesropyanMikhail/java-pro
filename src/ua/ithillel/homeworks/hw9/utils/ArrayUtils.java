package ua.ithillel.homeworks.hw9.utils;

import ua.ithillel.homeworks.hw9.model.Accessory;
import ua.ithillel.homeworks.hw9.model.Bouquet;
import ua.ithillel.homeworks.hw9.model.Flower;

public class ArrayUtils {

    public static Flower[] extendsArrayWithAddNewItem(Flower flowerToAdd, Flower[] flowers) {
        return (Flower[]) extendsArrayWithAddAllTypeNewItem(flowerToAdd, flowers);
    }

    public static Accessory[] extendsArrayWithAddNewItem(Accessory accessoryToAdd, Accessory[] accessories) {
        return (Accessory[]) extendsArrayWithAddAllTypeNewItem(accessoryToAdd, accessories);
    }

    public static Bouquet[] extendsArrayWithAddNewItem(Bouquet bouquetToAdd, Bouquet[] bouquets) {
        return (Bouquet[]) extendsArrayWithAddAllTypeNewItem(bouquetToAdd, bouquets);
    }

    public static void SortFlowersByDaysTolive(Bouquet bouquet) {
        Flower[] flowers = bouquet.getFlowers();
        for (int i = 0; i < flowers.length; i++) {
            for (int j = i; j > 0; j--) {
                if (flowers[j].getDaysToLive() < flowers[j - 1].getDaysToLive()) {
                    Flower temp = flowers[j - 1];
                    flowers[j - 1] = flowers[j];
                    flowers[j] = temp;
                }
            }
        }
        bouquet.setFlowers(flowers);
    }

    public static Flower[] findFlowersByStemLength(Flower[] flowers, int minStemLength, int maxStemLength) {
        Flower[] flowersRelevantStem = new Flower[]{};
        for (Flower flower : flowers) {
            if ((flower.getStemLength() > minStemLength) && ((flower.getStemLength() < maxStemLength))) {
                flowersRelevantStem = extendsArrayWithAddNewItem(flower, flowersRelevantStem);
            }
        }
        return flowersRelevantStem;
    }

    private static Object[] extendsArrayWithAddAllTypeNewItem(Object object, Object[] objects) {
        Object[] temp;
        int arraySize = objects.length;

        if (object instanceof Flower) {
            temp = new Flower[arraySize + 1];
        } else if (object instanceof Accessory) {
            temp = new Accessory[arraySize + 1];
        } else {
            temp = new Bouquet[arraySize + 1];
        }

        for (int i = 0; i < arraySize; i++) {
            temp[i] = objects[i];
        }
        temp[temp.length - 1] = object;
        return temp;
    }

}

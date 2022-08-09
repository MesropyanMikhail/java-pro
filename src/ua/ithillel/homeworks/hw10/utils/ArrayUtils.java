package ua.ithillel.homeworks.hw10.utils;

public class ArrayUtils {
    public static int[] extendsArrayWithAddNewItem(int addItem, int[] items) {
        int[] temp;
        int arraySize = items.length;

        temp = new int[arraySize + 1];
        for (int i = 0; i < arraySize; i++) {
            temp[i] = items[i];
        }
        temp[temp.length - 1] = addItem;

        return temp;
    }
}

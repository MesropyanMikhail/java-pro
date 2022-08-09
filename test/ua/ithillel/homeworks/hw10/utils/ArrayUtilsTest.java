package ua.ithillel.homeworks.hw10.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    @Test
    void extendsArrayWithAddNewItem() {
        int[] expectedArray = new int[]{1,2,3,4,5,6,7};

        int[] acctualArray = new int[]{1,2,3,4,5,6};
        acctualArray = ArrayUtils.extendsArrayWithAddNewItem(7, acctualArray);
        assertArrayEquals(expectedArray, acctualArray);

    }
}
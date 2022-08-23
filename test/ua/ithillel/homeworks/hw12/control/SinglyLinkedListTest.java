package ua.ithillel.homeworks.hw12.control;

import org.junit.jupiter.api.Test;
import org.junit.platform.engine.support.hierarchical.Node;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    @Test
    void swapItems() {
        SinglyLinkedList list = new SinglyLinkedList<Integer>();

        list.addFirstItem(1);
        list.addFirstItem(2);
        list.addFirstItem(3);
        list.addFirstItem(4);
        list.addFirstItem(5);
        Object[] valuesBefore;
        Object[] valuesAfter;
        valuesBefore = list.itemsOfList();
        Object temp = valuesBefore[3];
        valuesBefore[3] = valuesBefore[2];
        valuesBefore[2] = temp;
        list.swapItems(2, 3);
        valuesAfter = list.itemsOfList();
        assertArrayEquals(valuesBefore, valuesAfter);

        Object[] values;
        values = list.valuesOfList();
        Integer[] expected = new Integer[]{5, 4, 2, 3, 1};
        assertArrayEquals(expected, values);
    }

    @Test
    void addFirstItem() {
        SinglyLinkedList list = new SinglyLinkedList<Integer>();

        list.addFirstItem(1);
        list.addFirstItem(2);
        list.addFirstItem(3);
        list.addFirstItem(4);
        list.addFirstItem(5);
        Object[] values;
        values = list.valuesOfList();
        Integer[] expected = new Integer[]{5, 4, 3, 2, 1};
        assertArrayEquals(expected, values);

        Object[] valuesBefore;
        Object[] valuesAfter;
        valuesBefore = list.itemsOfList();
        list.addFirstItem(6);
        valuesAfter = list.itemsOfList();
        for (int i = 0; i < list.getLength() - 1; i++) {
            assertEquals(valuesBefore[i], valuesAfter[i + 1]);
        }
    }

    @Test
    void addLastItem() {
        SinglyLinkedList list = new SinglyLinkedList<Integer>();

        list.addLastItem(5);
        list.addLastItem(4);
        list.addLastItem(3);
        list.addLastItem(2);
        list.addLastItem(1);
        Object[] values;
        values = list.valuesOfList();
        Integer[] expected = new Integer[]{5, 4, 3, 2, 1};
        assertArrayEquals(expected, values);

        Object[] valuesBefore;
        Object[] valuesAfter;
        valuesBefore = list.itemsOfList();
        list.addLastItem(6);
        valuesAfter = list.itemsOfList();
        for (int i = 0; i < list.getLength() - 2; i++) {
            assertEquals(valuesBefore[i], valuesAfter[i]);
        }
    }

    @Test
    void addItemByNindex() {
        SinglyLinkedList list = new SinglyLinkedList<Integer>();

        list.addLastItem(5);
        list.addLastItem(4);
        list.addLastItem(3);
        list.addLastItem(2);
        list.addLastItem(1);
        list.addItemByNindex(10, 3);
        Object[] values;
        values = list.valuesOfList();
        Integer[] expected = new Integer[]{5, 4, 3, 10, 2, 1};
        assertArrayEquals(expected, values);

        Object[] valuesBefore;
        Object[] valuesAfter;
        int index = 4;
        valuesBefore = list.itemsOfList();
        list.addItemByNindex(2, index);
        valuesAfter = list.itemsOfList();
        for (int i = 0; i < list.getLength() - 1; i++) {
            if (i >= index) {
                assertEquals(valuesBefore[i], valuesAfter[i + 1]);
            } else {
                assertEquals(valuesBefore[i], valuesAfter[i]);
            }
        }
    }

    @Test
    void deleteFirst() {
        SinglyLinkedList list = new SinglyLinkedList<Integer>();

        list.addLastItem(5);
        list.addLastItem(4);
        list.addLastItem(3);
        list.addLastItem(2);
        list.addLastItem(1);
        list.deleteFirst();
        Object[] values;
        values = list.valuesOfList();
        Integer[] expected = new Integer[]{4, 3, 2, 1};
        assertArrayEquals(expected, values);

        Object[] valuesBefore;
        Object[] valuesAfter;
        valuesBefore = list.itemsOfList();
        list.deleteFirst();
        valuesAfter = list.itemsOfList();
        for (int i = 0; i < list.getLength() - 1; i++) {
            assertEquals(valuesBefore[i + 1], valuesAfter[i]);
        }
    }

    @Test
    void deleteLast() {
        SinglyLinkedList list = new SinglyLinkedList<Integer>();

        list.addLastItem(5);
        list.addLastItem(4);
        list.addLastItem(3);
        list.addLastItem(2);
        list.addLastItem(1);
        list.deleteLast();
        Object[] values;
        values = list.valuesOfList();
        Integer[] expected = new Integer[]{5, 4, 3, 2};
        assertArrayEquals(expected, values);

        Object[] valuesBefore;
        Object[] valuesAfter;
        valuesBefore = list.itemsOfList();
        list.deleteFirst();
        valuesAfter = list.itemsOfList();
        for (int i = 0; i < list.getLength() - 1; i++) {
            assertEquals(valuesBefore[i + 1], valuesAfter[i]);
        }
    }

    @Test
    void deleteByIndex() {
        SinglyLinkedList list = new SinglyLinkedList<Integer>();

        list.addLastItem(5);
        list.addLastItem(4);
        list.addLastItem(3);
        list.addLastItem(2);
        list.addLastItem(1);
        list.deleteByIndex(3);
        Object[] values;
        values = list.valuesOfList();
        Integer[] expected = new Integer[]{5, 4, 3, 1};
        assertArrayEquals(expected, values);

        Object[] valuesBefore;
        Object[] valuesAfter;
        int index = 2;
        valuesBefore = list.itemsOfList();
        list.deleteByIndex(index);
        valuesAfter = list.itemsOfList();
        for (int i = 0; i < list.getLength() - 1; i++) {
            if (i >= index) {
                assertEquals(valuesBefore[i + 1], valuesAfter[i]);
            } else {
                assertEquals(valuesBefore[i], valuesAfter[i]);
            }
        }
    }

    @Test
    void getLength() {
        SinglyLinkedList list = new SinglyLinkedList<>();
        assertEquals(0, list.getLength());
        list.addFirstItem(1);
        list.addFirstItem(1);
        list.addFirstItem(1);
        assertEquals(3, list.getLength());
    }

    @Test
    void isEmpty() {
        SinglyLinkedList list = new SinglyLinkedList<>();
        assertTrue(list.isEmpty());
        list.addFirstItem(1);
        assertFalse(list.isEmpty());
    }
}
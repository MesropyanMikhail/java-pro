package ua.ithillel.homeworks.hw12.control;

import ua.ithillel.homeworks.hw12.model.Node;

import java.util.Arrays;

public class SinglyLinkedList<T> {
    Node<T> firstNode;
    int length = 0;

    public SinglyLinkedList() {
        this.firstNode = null;
    }

    public SinglyLinkedList(T[] items) {
        for (T item : items) {
            addLastItem(item);
        }
    }

    public void swapItems(int firstIndex, int secondIndex) {
        if ((firstIndex > length) || (secondIndex > length) || (firstIndex < 0) || (secondIndex < 0)) {
            System.out.println("Index error.");
            return;
        }

        T[] firstResult = findElementsByIndex(firstIndex);
        T[] secondResult = findElementsByIndex(secondIndex);

        Node<T> previousItemFirstIndex = (Node) firstResult[0];
        Node<T> currentItemFirstIndex = (Node) firstResult[1];

        Node<T> currentItemFirstTempNext = ((Node) firstResult[1]).getNext();
        Node<T> currentItemSecondTempNext = ((Node) secondResult[1]).getNext();

        Node<T> previousItemSecondIndex = (Node) secondResult[0];
        Node<T> currentItemSecondIndex = (Node) secondResult[1];


        if (secondIndex - firstIndex == 1) {
            currentItemSecondIndex.setNext(currentItemFirstIndex);
            if (previousItemFirstIndex != null) {
                previousItemFirstIndex.setNext(currentItemSecondIndex);
            } else {
                firstNode = currentItemSecondIndex;
            }
            previousItemSecondIndex.setNext(currentItemFirstIndex);
            currentItemFirstIndex.setNext(currentItemSecondTempNext);

        } else {
            currentItemSecondIndex.setNext(currentItemFirstIndex.getNext());
            if (previousItemFirstIndex != null) {
                previousItemFirstIndex.setNext(currentItemSecondIndex);
            } else {
                firstNode = currentItemSecondIndex;
            }
            previousItemSecondIndex.setNext(currentItemFirstIndex);
            currentItemFirstIndex.setNext(currentItemSecondTempNext);
        }
    }

    private T[] findElementsByIndex(int index) {
        int currentIndex = 0;
        Node<T> currentItem = firstNode;
        Node<T> previousItem = null;
        T[] result = (T[]) new Object[2];

        while (currentIndex != index) {
            previousItem = currentItem;
            currentItem = currentItem.getNext();
            currentIndex++;
        }
        result[0] = (T) previousItem;
        result[1] = (T) currentItem;
        return result;
    }

    public void addFirstItem(T value) {
        Node<T> temp = firstNode;
        firstNode = new Node<>(value);
        firstNode.setNext(temp);
        length++;
    }

    public void addLastItem(T value) {
        if (firstNode == null) {
            addFirstItem(value);
            return;
        }
        Node<T> lastItem = firstNode;
        while (lastItem.getNext() != null) {
            lastItem = lastItem.getNext();
        }
        Node<T> newItem = new Node<>(value);
        lastItem.setNext(newItem);
        length++;
    }

    public void addItemByNindex(T value, int index) {
        if (index > length) {
            System.out.println("Index error.");
            return;
        }
        if (index == 0) {
            addFirstItem(value);
            return;
        }
        if (index == length) {
            addLastItem(value);
            return;
        }

        int currentIndex = 0;
        Node<T> currentItem = firstNode;
        Node<T> previousItem = null;

        while (currentIndex != index) {
            previousItem = currentItem;
            currentItem = currentItem.getNext();
            currentIndex++;
        }

        Node<T> newItem = new Node<>(value);
        newItem.setNext(currentItem);
        previousItem.setNext(newItem);
        length++;
    }

    public void deleteFirst() {
        if (firstNode == null) {
            return;
        }

        if (firstNode.getNext() != null) {
            firstNode = firstNode.getNext();
            length--;
        } else {
            firstNode = null;
            length = 0;
        }
    }

    public void deleteLast() {
        if (firstNode == null) {
            return;
        }
        Node<T> currentItem = firstNode;
        Node<T> previousItem = null;

        while (currentItem.getNext() != null) {
            previousItem = currentItem;
            currentItem = currentItem.getNext();
        }
        currentItem = null;
        if (previousItem != null) {
            previousItem.setNext(null);
            length--;
        } else {
            firstNode = null;
            length = 0;
        }
    }

    public void deleteByIndex(int index) {
        if (index > length) {
            System.out.println("Index error.");
            return;
        }
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == length) {
            deleteLast();
            return;
        }

        int currentIndex = 0;
        Node<T> currentItem = firstNode;
        Node<T> previousItem = null;

        while (currentIndex != index) {
            previousItem = currentItem;
            currentItem = currentItem.getNext();
            currentIndex++;
        }
        previousItem.setNext(currentItem.getNext());
        currentItem = null;
        length--;
        if (length == 0) {
            firstNode = null;
        }
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        if (firstNode == null) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        Node<T> temp = firstNode;
        String result = "SinglyLinkedList {";
        for (int i = 0; i < length; i++) {
            result += " " + temp.getValue();
            temp = temp.getNext();
        }
        return result + " }";
    }
}

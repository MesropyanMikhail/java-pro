package ua.ithillel.homeworks.hw14.task2.control;

import ua.ithillel.homeworks.hw14.task2.model.Node;

import java.util.Iterator;

public class SinglyLinkedListIterator<T> implements Iterator<T> {
    Node<T> currentItem;

    public SinglyLinkedListIterator(Node<T> firstNode) {
        currentItem = firstNode;
    }

    @Override
    public boolean hasNext() {
        return currentItem != null;
    }

    @Override
    public T next() {
        T value = currentItem.getValue();
        currentItem = currentItem.getNext();
        return value;
    }

}

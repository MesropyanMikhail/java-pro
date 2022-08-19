package ua.ithillel.homeworks.hw12;

import ua.ithillel.homeworks.hw12.control.SinglyLinkedList;

public class App {

    public static void main(String[] args) {
        //SinglyLinkedList list = new SinglyLinkedList<Integer>();
        SinglyLinkedList list = new SinglyLinkedList<Integer>(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8});
        System.out.println(list.toString());
        System.out.println((list.isEmpty()) ? "Список пустой" : "Список не пустой");
        list.addFirstItem(0);
        list.addLastItem(9);
        System.out.println(list.toString());
        list.swapItems(0, 1);
        System.out.println(list.toString());
        list.swapItems(0, 1);
        System.out.println(list.toString());
        list.swapItems(0, 9);
        System.out.println(list.toString());
        list.deleteFirst();
        System.out.println(list.toString());
        list.deleteByIndex(5);
        System.out.println(list.toString());
        list.deleteLast();
        System.out.println(list.toString());
        System.out.println("List length " + list.getLength());
    }

}

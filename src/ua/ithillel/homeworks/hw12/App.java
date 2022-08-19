package ua.ithillel.homeworks.hw12;

import ua.ithillel.homeworks.hw12.control.SinglyLinkedList;

public class App {

    public static void main(String[] args) {

//        SinglyLinkedList list = new SinglyLinkedList<Integer>(new Integer[]{1,12,3,3});
 //       System.out.println(list.toString());
        SinglyLinkedList list = new SinglyLinkedList<Integer>();
        //System.out.println((list.isEmpty())?"Список пустой": "Список не пустой");

        list.addFirstItem(1);
        //System.out.println((list.isEmpty())?"Список пустой": "Список не пустой");
        //list.deleteLast();
        list.addLastItem(2);
       /* list.addLastItem(3);
        list.addLastItem(4);
        list.addLastItem(5);*/
        System.out.println(list.toString());
        list.deleteByIndex(0);
        System.out.println(list.toString());
        list.deleteByIndex(0);
        System.out.println(list.toString());

        /* list.addFirstItem(6);
        list.addFirstItem(5);
        list.addFirstItem(4);
        list.addFirstItem(3);
        list.addFirstItem(2);
        list.addFirstItem(1);*/
        System.out.println((list.isEmpty())?"Список пустой": "Список не пустой");
        //  System.out.println(list.toString());
        //list.swapItems(2, 5);
        System.out.println(list.toString());
        /* System.out.println(list.toString());
        list.addItemByNindex(13, 2);

        list.deleteFirst();
        System.out.println(list.toString());

        list.deleteByIndex(5);
        System.out.println(list.toString());

        System.out.println(list.getLength());
      /* list.deleteLast();
        System.out.println(list.toString());
        list.deleteLast();
        System.out.println(list.toString());
        list.deleteLast();
        System.out.println(list.toString());
        list.deleteLast();
        System.out.println(list.toString());*/
    }

}

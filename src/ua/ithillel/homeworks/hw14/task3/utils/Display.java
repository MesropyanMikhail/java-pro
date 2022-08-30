package ua.ithillel.homeworks.hw14.task3.utils;

public interface Display {
    default void display() {
        System.out.println(this.toString());
    }
}

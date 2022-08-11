package ua.ithillel.homeworks.hw8.utils;

public interface Display {
    default void display() {
        System.out.println(this.toString());
    }
}

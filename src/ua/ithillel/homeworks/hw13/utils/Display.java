package ua.ithillel.homeworks.hw13.utils;

public interface Display {
    default void display() {
        System.out.println(this.toString());
    }
}

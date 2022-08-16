package ua.ithillel.homeworks.hw11.utils;

public interface Display {
    default void display() {
        System.out.println(this.toString());
    }
}

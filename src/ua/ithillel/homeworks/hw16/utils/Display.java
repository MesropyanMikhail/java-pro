package ua.ithillel.homeworks.hw16.utils;

public interface Display {
    default void display() {
        System.out.println(this.toString());
    }
}

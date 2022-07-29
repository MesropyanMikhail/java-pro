package ua.ithillel.homeworks.hw8;

public interface Display {
    default void display() {
        System.out.println(this.toString());
    }
}

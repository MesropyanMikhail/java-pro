package ua.ithillel.homeworks.hw2;

public class Task3 {
    public static void main(String[] args) {
        int[] fibonacci = new int[20];
        int first = 0;
        int second = 1;
        int actualNumber = 0;

        fibonacci[0] = first;
        fibonacci[1] = second;

        for (int i = 2; i < 20; i++) {
            actualNumber = first + second;
            fibonacci[i] = actualNumber;
            first = second;
            second = actualNumber;
        }

        for (int i = 0; i < 20; i++) {
            System.out.println(fibonacci[i]);
        }
    }
}

package ua.ithillel.homeworks.hw2;

public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " " + ((numbers[i] % 2 == 0) ? "even" : "odd"));
        }
    }
}

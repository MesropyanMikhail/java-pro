package ua.ithillel.homeworks.hw2;

public class Task4 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, -10, 11, 48, 13, 14, 15, 16, 17, 18, 19, 20};
        int min = 0;
        int max = 0;

        for (int i = 0; i < numbers.length; i++) {
            min = (min > numbers[i]) ? numbers[i] : min;
            max = (max < numbers[i]) ? numbers[i] : max;
        }

        System.out.println("Minimum  " + min);
        System.out.println("Maximum  " + max);
    }
}

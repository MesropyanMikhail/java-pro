package ua.ithillel.homeworks.hw2;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        boolean primeNumber = true;
        int actualNumber;

        for (int i = 0; i < numbers.length; i++) {
            primeNumber = true;
            actualNumber = numbers[i];

            if (actualNumber > 1) {
                for (int j = 2; j < actualNumber; j++) {
                    if (primeNumber && (numbers[i] % j == 0)) {
                        primeNumber = false;
                    }
                }
                if (primeNumber) {
                    System.out.println(actualNumber);
                }
            }
        }
    }
}

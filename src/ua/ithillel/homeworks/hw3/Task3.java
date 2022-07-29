package ua.ithillel.homeworks.hw3;

public class Task3 {
    public static void main(String[] args) {
        int[] numbers = {100, 113, 92225, 95, 436, 415, 92226, 357};
        int countDigits = 0;
        int actualNumber;
        boolean digitsEqual = false;
        System.out.print("Numbers with unique digits ");

        for (int number : numbers) {
            actualNumber = number;

            while (actualNumber != 0) {
                ++countDigits;
                actualNumber /= 10;
            }

            int[] digits = new int[countDigits];
            countDigits = 0;
            actualNumber = number;

            while (actualNumber % 10 != 0) {
                digits[countDigits++] = actualNumber % 10;
                actualNumber /= 10;
            }
            countDigits = 0;
            digitsEqual = false;
            for (int i = 0; i < digits.length; i++) {
                if (digitsEqual) {
                    break;
                }

                for (int j = i + 1; j < digits.length; j++) {
                    if (digits[i] == digits[j]) {
                        digitsEqual = true;
                        break;
                    }
                }
            }
            if (digitsEqual == false) {
                System.out.print(" " + number + " ");
            }
        }
    }
}
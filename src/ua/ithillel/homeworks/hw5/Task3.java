package ua.ithillel.homeworks.hw5;

public class Task3 {

    public static boolean uniqueDigitsNumbers(int number) {
        int countDigits = 0;
        int actualNumber;
        boolean digitsEqual = false;

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
            return true;
        } else {
            return false;
        }
    }
}

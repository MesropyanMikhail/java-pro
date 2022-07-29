package ua.ithillel.homeworks.hw3;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {10, 113, 92225, 95, 436, 100, 415, 92226, 357};
        int actualNumber;
        int countDigits = 0;
        boolean initialized = false;
        int lastMax = 0;
        int lastMin = 0;
        int lastMaxValue = 0;
        int lastMinValue = 0;

        for (int number : numbers) {
            actualNumber = number;

            while (actualNumber != 0) {
                ++countDigits;
                actualNumber /= 10;
            }
            if (initialized == false) {
                lastMax = countDigits;
                lastMin = countDigits;
                initialized = true;
            }
            if (countDigits >= lastMax) {
                lastMax = countDigits;
                lastMaxValue = number;
            }
            if (countDigits <= lastMin) {
                lastMin = countDigits;
                lastMinValue = number;
            }
            countDigits = 0;
        }
        System.out.println("last min number of digits " + lastMin + ", last min value " + lastMinValue);
        System.out.println("last max number of digits " + lastMax + ", last max value " + lastMaxValue);
    }
}

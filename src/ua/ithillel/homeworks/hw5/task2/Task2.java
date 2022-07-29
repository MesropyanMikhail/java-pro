package ua.ithillel.homeworks.hw5.task2;

public class Task2 {

    public Result findMinMaxNumber(int[] numbers) {
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
        return new Result(lastMin, lastMinValue, lastMax, lastMaxValue);
    }
}

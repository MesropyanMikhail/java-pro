package ua.ithillel.homeworks.hw5;

import ua.ithillel.homeworks.hw5.task2.Result;
import ua.ithillel.homeworks.hw5.task2.Task2;

public class App {

    public static void main(String[] args) {
        // Task 1
        int[] firstSequence = {1, 2, 3, 4, 5, 7, 8, 9, 3, 4, 5, 6, 10};
        int[] secondSequence = {3, 4, 5, 6};
        Task1 task1 = new Task1();
        if (task1.sequenceIncluded(firstSequence, secondSequence) == true) {
            System.out.println("the second sequence is included in the first.");
        } else {
            System.out.println("the second sequence is not included in the first");
        }

        // Task 2
        int[] numbers = {10, 113, 92225, 95, 436, 100, 415, 92226, 357};
        Task2 task2 = new Task2();
        Result result = task2.findMinMaxNumber(numbers);
        System.out.println("Min number " + result.lastMin + ", min value " + result.lastMinValue + " max number " + result.lastMax + ", max value " + result.lastMaxValue);

        // Task 3
        int[] randomNumbers = {100, 113, 92225, 95, 436, 415, 92226, 357};
        for (int number : randomNumbers) {
            System.out.println("number " + number +   ((Task3.uniqueDigitsNumbers(number))? " unique": " not unique"));
        }

        // Task 4
        System.out.println("");
        System.out.println(Task4.matrix(7));
    }
}

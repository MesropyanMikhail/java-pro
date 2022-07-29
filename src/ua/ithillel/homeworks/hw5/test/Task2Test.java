package ua.ithillel.homeworks.hw5.test;

import ua.ithillel.homeworks.hw5.task2.Result;
import ua.ithillel.homeworks.hw5.task2.Task2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void whenFindMinMaxNumber_thenReturnMinMaxNumber() {
        int[] numbers = {10, 113, 92225, 95, 436, 100, 415, 92226, 357};
        Task2 task2 = new Task2();
        Result result = task2.findMinMaxNumber(numbers);

        assertEquals(2, result.lastMin);
        assertEquals(95, result.lastMinValue);
        assertEquals(5, result.lastMax);
        assertEquals(92226, result.lastMaxValue);
    }

}
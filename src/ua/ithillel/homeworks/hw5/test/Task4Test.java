package ua.ithillel.homeworks.hw5.test;

import ua.ithillel.homeworks.hw5.Task4;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void whenCreateMatrix_thenReturnMatrix() {
        String result = Task4.matrix(7);
        assertEquals(" 1 2 3\n 4 5 6\n 7 X X\n", result);
    }
}
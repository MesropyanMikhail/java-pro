package ua.ithillel.homeworks.hw10.control;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberThreadsTest {

    @Test
    void run() {
        int[] expectedArray = new int[]{2, 3, 5, 7};
        int[] acctualArray;
        PrimeNumberMonitor primeNumberMonitor = new PrimeNumberMonitor();
        PrimeNumberThreads primeNumberThreads = new PrimeNumberThreads(primeNumberMonitor, 0, 10);
        try {
            primeNumberThreads.getThread().join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        acctualArray = primeNumberMonitor.getPrimeNumbers();
        assertArrayEquals(expectedArray, acctualArray);
    }
}
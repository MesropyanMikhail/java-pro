package ua.ithillel.homeworks.hw10.control;

import ua.ithillel.homeworks.hw10.utils.ArrayUtils;

public class PrimeNumberMonitor {
    int[] primeNumbers = new int[]{};

    public void addPrimeNumber(int primeNumber) {
        primeNumbers = ArrayUtils.extendsArrayWithAddNewItem(primeNumber, primeNumbers);
    }

    public int[] getPrimeNumbers() {
        return primeNumbers;
    }
}

package ua.ithillel.homeworks.hw10.control;

import ua.ithillel.homeworks.hw10.utils.ArrayUtils;

public class PrimeNumberThreads implements Runnable {
    Thread thread;
    PrimeNumberMonitor primeNumberMonitor;
    int[] primeNumbers = new int[]{};
    int startRange;
    int endRange;

    public PrimeNumberThreads(PrimeNumberMonitor primeNumberMonitor, int startRange, int endRange) {
        this.primeNumberMonitor = primeNumberMonitor;
        this.startRange = startRange;
        this.endRange = endRange;
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        findPrimeNumberInRange(startRange, endRange);
        synchronized (primeNumberMonitor) {
            for (int primeNumber : primeNumbers) {
                primeNumberMonitor.addPrimeNumber(primeNumber);
            }
        }
    }

    public Thread getThread() {
        return thread;
    }

    private void findPrimeNumberInRange(int startRange, int endRange) {
        int[] numbers;
        int[] temp = new int[]{};

        boolean primeNumber = true;
        int actualNumber;

        numbers = CreateArrayBasedOnRange(startRange, endRange);

        for (int number : numbers) {
            primeNumber = true;
            actualNumber = number;

            if (actualNumber > 1) {
                for (int j = 2; j < actualNumber; j++) {
                    if (primeNumber && (number % j == 0)) {
                        primeNumber = false;
                        break;
                    }
                }
                if (primeNumber) {
                    primeNumbers = ArrayUtils.extendsArrayWithAddNewItem(actualNumber, primeNumbers);
                }
            }
        }
    }

    private int[] CreateArrayBasedOnRange(int startRange, int endRange) {
        int[] numbers = new int[endRange - startRange + 1];
        int arrauIndex = 0;
        while (startRange <= endRange) {
            numbers[arrauIndex++] = startRange;
            startRange++;
        }
        return numbers;
    }

}

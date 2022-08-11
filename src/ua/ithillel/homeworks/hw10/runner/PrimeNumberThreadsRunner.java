package ua.ithillel.homeworks.hw10.runner;

import ua.ithillel.homeworks.hw10.control.PrimeNumberMonitor;
import ua.ithillel.homeworks.hw10.model.PrimeNumberThread;

public class PrimeNumberThreadsRunner {

    void calculatePrimeNumbers(int numberOfThreads, int startRange, int endRange, PrimeNumberMonitor primeNumberMonitor) {
        int currentStartRange;
        int currentEndRange;
        int amountRange;
        int averageAmountRange;
        int currentAmount;
        PrimeNumberThread[] primeNumberThreads = new PrimeNumberThread[numberOfThreads];

        amountRange = AmountRange(startRange, endRange);
        averageAmountRange = (int) Math.ceil((double) amountRange / numberOfThreads);
        currentStartRange = startRange;
        currentEndRange = startRange;

        System.out.println("Amount range " + amountRange);

        for (int i = 0; i < numberOfThreads; i++) {
            currentAmount = 0;
            while ((currentEndRange < endRange) && (currentAmount <= averageAmountRange)) {
                currentEndRange++;
                currentAmount = AmountRange(currentStartRange, currentEndRange);
            }
            System.out.println("Start range " + currentStartRange + "  End range " + currentEndRange + " Current amount " + currentAmount);
            primeNumberThreads[i] = new PrimeNumberThread(primeNumberMonitor, currentStartRange, currentEndRange);
            currentStartRange = currentEndRange;
            currentStartRange++;
        }

        try {
            for (int i = 0; i < numberOfThreads; i++) {
                primeNumberThreads[i].getThread().join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static int AmountRange(int startRange, int endRange) {
        int amountRange = 0;
        for (int i = startRange; i <= endRange; i++) {
            amountRange += i;
        }
        return amountRange;
    }

}

package ua.ithillel.homeworks.hw10.runner;

import ua.ithillel.homeworks.hw10.control.PrimeNumberMonitor;
import ua.ithillel.homeworks.hw10.control.PrimeNumberThreads;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumberApplication {
    public static void main(String[] args) {
        int numberOfThreads = 0;
        int startRange;
        int endRange;
        int currentStartRange;
        int currentEndRange;
        int amountRange;
        int averageAmountRange;
        int currentAmount;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of threads");
        numberOfThreads = scanner.nextInt();
        System.out.println("Enter the start of range");
        startRange = scanner.nextInt();
        System.out.println("Enter the end of range");
        endRange = scanner.nextInt();
        scanner.close();

        PrimeNumberThreads[] primeNumberThreads = new PrimeNumberThreads[numberOfThreads];
        PrimeNumberMonitor primeNumberMonitor = new PrimeNumberMonitor();

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
            primeNumberThreads[i] = new PrimeNumberThreads(primeNumberMonitor, currentStartRange, currentEndRange);
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

        System.out.println(Arrays.toString(primeNumberMonitor.getPrimeNumbers()));
    }

    private static int AmountRange(int startRange, int endRange) {
        int amountRange = 0;
        for (int i = startRange; i <= endRange; i++) {
            amountRange += i;
        }
        return amountRange;
    }

}

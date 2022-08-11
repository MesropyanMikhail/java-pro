package ua.ithillel.homeworks.hw10.runner;

import ua.ithillel.homeworks.hw10.control.PrimeNumberMonitor;

import java.util.Arrays;
import java.util.Scanner;

public class PrimeNumberApplication {

    public static void main(String[] args) {
        int numberOfThreads;
        int startRange;
        int endRange;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of threads");
        numberOfThreads = scanner.nextInt();
        System.out.println("Enter the start of range");
        startRange = scanner.nextInt();
        System.out.println("Enter the end of range");
        endRange = scanner.nextInt();
        scanner.close();

        PrimeNumberMonitor primeNumberMonitor = new PrimeNumberMonitor();
        PrimeNumberThreadsRunner primeNumberThreadsRunner = new PrimeNumberThreadsRunner();
        primeNumberThreadsRunner.calculatePrimeNumbers(numberOfThreads, startRange, endRange, primeNumberMonitor);
        System.out.println(Arrays.toString(primeNumberMonitor.getPrimeNumbers()));
    }

}

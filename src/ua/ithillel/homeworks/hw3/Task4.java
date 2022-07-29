package ua.ithillel.homeworks.hw3;

public class Task4 {
    public static void main(String[] args) {
        int k = 73;
        int matrixSize = 0;
        int actualNumber = 1;
        int countDigits = 1;
        int tempActualNumber;
        int actualNumberCountDigits;

        tempActualNumber = k;
        while (tempActualNumber != 0) {
            ++countDigits;
            tempActualNumber /= 10;
        }

        while (true) {
            ++matrixSize;
            if (matrixSize * matrixSize >= k) {
                break;
            }
        }

        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                if (actualNumber <= k) {
                    tempActualNumber = actualNumber;
                    actualNumberCountDigits = 0;
                    while (tempActualNumber != 0) {
                        ++actualNumberCountDigits;
                        tempActualNumber /= 10;
                    }
                    for (int l = 0; l < (countDigits - actualNumberCountDigits); l++) {
                        System.out.print(" ");
                    }
                    System.out.print(actualNumber);

                } else {
                    for (int l = 0; l < (countDigits - 1); l++) {
                        System.out.print(" ");
                    }
                    System.out.print("X");
                }
                actualNumber++;
            }
            System.out.print("\n");
        }
    }
}

package ua.ithillel.homeworks.hw10.runner;

import org.junit.jupiter.api.Test;
import ua.ithillel.homeworks.hw10.control.PrimeNumberMonitor;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberThreadsRunnerTest {

    @Test
    void calculatePrimeNumbers() {
        int[] firstSequence = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53};
        int[] secondSequence = new int[]{59, 61, 67, 71, 73, 79};
        int[] thirdSequence = new int[]{83, 89, 97};
        int[] sequence;
        int subsequenceLength;

        PrimeNumberMonitor primeNumberMonitor = new PrimeNumberMonitor();
        PrimeNumberThreadsRunner primeNumberThreadsRunner = new PrimeNumberThreadsRunner();
        primeNumberThreadsRunner.calculatePrimeNumbers(3, 0, 100, primeNumberMonitor);
        sequence = primeNumberMonitor.getPrimeNumbers();
        assertTrue(sequenceContainsSubsequence(sequence, firstSequence));
        assertTrue(sequenceContainsSubsequence(sequence, secondSequence));
        assertTrue(sequenceContainsSubsequence(sequence, thirdSequence));
        subsequenceLength = firstSequence.length + secondSequence.length + thirdSequence.length;
        assertEquals(sequence.length, subsequenceLength);
    }

    private boolean sequenceContainsSubsequence(int[] sequence, int[] subsequence) {
        boolean included = false;

        for (int i = 0; i < sequence.length; i++) {
            for (int j = 0; j < subsequence.length; j++) {
                if ((i + j) >= sequence.length) {
                    break;
                }
                if (sequence[i + j] == subsequence[j]) {
                    included = true;
                } else {
                    included = false;
                    break;
                }
            }
            if (included) {
                break;
            }
        }
        return included;
    }

}
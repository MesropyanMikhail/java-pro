package ua.ithillel.homeworks.hw5.test;

import ua.ithillel.homeworks.hw5.Task1;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @ParameterizedTest
    @MethodSource("provideSequenceIncluded")
    void sequenceIncluded(int[] secondSequence, boolean expected) {

        int[] firstSequence = {1, 2, 3, 4, 5, 7, 8, 9, 3, 4, 5, 6, 10};
        Task1 firstTest = new Task1();
        assertEquals(expected, firstTest.sequenceIncluded(firstSequence, secondSequence));
    }

    private static Stream<Arguments> provideSequenceIncluded() {
        return Stream.of(
                Arguments.of(new int[]{3, 4, 5, 6}, true),
                Arguments.of(new int[]{3, 4, 5, 8}, false),
                Arguments.of(new int[]{5, 6, 10, 11}, true)
        );
    }

}
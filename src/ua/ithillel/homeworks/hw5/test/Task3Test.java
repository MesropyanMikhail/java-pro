package ua.ithillel.homeworks.hw5.test;

import ua.ithillel.homeworks.hw5.Task3;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    @ParameterizedTest
    @MethodSource("provideDigitsNumbers")
    void whenCheckUniqueDigitsNumbers_thenReturnResult(int number, boolean expected) {
        assertEquals(expected, Task3.uniqueDigitsNumbers(number));
    }

    private static Stream<Arguments> provideDigitsNumbers() {
        return Stream.of(
                Arguments.of(100, false),
                Arguments.of(113, false),
                Arguments.of(92225, false),
                Arguments.of(95, true),
                Arguments.of(436, true),
                Arguments.of(415, true),
                Arguments.of(357, true)
        );
    }
}


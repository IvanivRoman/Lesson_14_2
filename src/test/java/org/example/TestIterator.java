package org.example;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class TestIterator {
    @Test
    void testRangeReturnNumbers () {
        Integer [] numbers = new Integer[11];

        int i = 0;
        for (Integer number: new Range(-5, 5)) {
            numbers[i++] = number;
        }

        assertThat(numbers).contains(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5);
    }

    @Test
    void testRangeReturnZero() {
        int [] numbers = new int[11];

        int i = 0;
        for (Integer number: new Range(7, 5)) {
            numbers[i++] = number;
        }

        assertThat(numbers).containsOnly(0);
    }

    @Test
    void testRangeWithStepReturnNumbers () {
        Integer [] numbers = new Integer[6];

        int i = 0;
        for (Integer number: new RangeWithStep(-5, 5, 2)) {
            numbers[i++] = number;
        }

        assertThat(numbers).contains(-5, -3, -1, 1, 3, 5);
    }

    @Test
    void testRangeWithStepReturnZero() {
        int [] numbers = new int[6];

        int i = 0;
        for (Integer number: new RangeWithStep(7, 5, 9)) {
            numbers[i++] = number;
        }

        assertThat(numbers).containsOnly(0);
    }
}

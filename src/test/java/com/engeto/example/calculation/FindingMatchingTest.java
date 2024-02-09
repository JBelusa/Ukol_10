package com.engeto.example.calculation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindingMatchingTest {

    List<Double> testList;


    @Test
    @DisplayName("První test")
    void findMatchingFirst() {
        testList = List.of(12.0, 8.126, 6.0);
        Double testResult = FindingMatching.findMatching(testList, 11.0, 12.6);
        Double expected = 12.0;

        Assertions.assertEquals(expected, testResult);
    }

    @Test
    @DisplayName("Druhý test")
    void findMatchingSecond() {
        testList = List.of(12.0, 8.126, 6.0, 158.0,6.0);
        Double testResult = FindingMatching.findMatching(testList, 8.0, 10.0);
        Double expected = 8.126;

        Assertions.assertEquals(expected, testResult);
    }

    @Test
    @DisplayName("Test null")
    void findMatchingNull() {
        testList = List.of(12.0, 8.126, 6.0, 158.0,6.0);
        Double testResult = FindingMatching.findMatching(testList, 4.0, 5.9);
        Double expected = null;

        Assertions.assertEquals(expected, testResult);
    }

}
package com.engeto.example.calculation;

import java.util.List;

public class FindingMatching {


    public static Double findMatching(List<Double> list, double lowerLimit, double upperLimit) {
        for (Double number : list) {
            if (number >= lowerLimit && number <= upperLimit)
                return number;

        }
        return null;
    }
}

package org.akzam.JUnit4;

import java.util.Arrays;

public class Calculator {
    public int summarize (String expressions) {
        return Arrays.stream(expressions.split("\\+"))
                .map(Integer::valueOf)
                .mapToInt(Integer::intValue)
                .sum();
    }
}

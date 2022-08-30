package org.akzam.lessons_3_5_7;

import java.util.Arrays;

public class Calculator {
    public int summarize (String expressions) {
        return Arrays.stream(expressions.split("\\+"))
                .map(Integer::valueOf)
                .mapToInt(Integer::intValue)
                .sum();
    }
}

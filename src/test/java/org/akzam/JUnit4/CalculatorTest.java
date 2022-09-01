package org.akzam.JUnit4;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testSummarize_1() {
        assertEquals(6, calculator.summarize("1+2+3"));
    }

    @Test
    public void testSummarize_2() {
        assertEquals(15, calculator.summarize("7+5+3"));
    }
}
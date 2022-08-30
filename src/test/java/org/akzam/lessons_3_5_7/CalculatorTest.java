package org.akzam.lessons_3_5_7;

import junit.framework.TestCase;
import org.junit.Test;

public class CalculatorTest extends TestCase {

    @Test
    public void testSummarize() {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.summarize("1+2+3"));
        assertEquals(15, calculator.summarize("7+5+3"));
    }
}
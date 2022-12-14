package org.akzam.JUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;
import static org.junit.runners.Parameterized.*;

@RunWith(value = Parameterized.class)
public class StringUtilsParameterizedTest {

    private Boolean boo;
    private String arg;

    public StringUtilsParameterizedTest(Boolean boo, String arg) {
        this.boo = boo;
        this.arg = arg;
    }

    @Parameters
    public static Collection<Object[]> getTestParameters() {
        return Arrays.asList(new Object[][] {
                {Boolean.FALSE, "1234"},
                {Boolean.TRUE, "1212"},
                {Boolean.FALSE, "1"},
                {Boolean.TRUE, "12"}
        });
    }

    @Test
    public void testAre2CharsAtHeadAndTailEqual() {
        StringUtils su = new StringUtils();
        assertEquals(boo, su.are2CharsAtHeadAndTailEqual(arg));
    }
}

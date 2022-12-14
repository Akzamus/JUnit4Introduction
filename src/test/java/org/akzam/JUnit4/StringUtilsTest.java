package org.akzam.JUnit4;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {

    private final StringUtils su = new StringUtils();

    @Test
    public void testChopOff2StarsAtHead_BothAtLeft() {
        assertEquals("**", su.chopOff2SpacesAtHead("  **"));
    }

    @Test
    public void testChopOff2StarsAtHead_Single() {
        assertEquals("**", su.chopOff2SpacesAtHead(" **"));
    }

    @Test
    public void testChopOff2StarsAtHead_None() {
        assertEquals("****", su.chopOff2SpacesAtHead("****"));
    }

    @Test
    public void testChopOff2StarsAtHead_BothAtRight() {
        assertEquals("**  ", su.chopOff2SpacesAtHead("**  "));
    }

    @Test
    public void testAre2CharsAtHeadAndTailEqual_GenAllDiffFalse() {
        assertFalse(su.are2CharsAtHeadAndTailEqual("1234"));
    }

    @Test
    public void testAre2CharsAtHeadAndTailEqual_GenAllSameFalse() {
        assertTrue(su.are2CharsAtHeadAndTailEqual("1212"));
    }

    @Test
    public void testAre2CharsAtHeadAndTailEqual_OnlyTwo() {
        assertTrue(su.are2CharsAtHeadAndTailEqual("12"));
    }

    @Test
    public void testAre2CharsAtHeadAndTailEqual_OnlyOne() {
        assertFalse(su.are2CharsAtHeadAndTailEqual("1"));
    }
}
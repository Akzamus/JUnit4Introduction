package org.akzam.JUnit4;

import org.junit.Assume;
import org.junit.Before;
import org.junit.Test;

public class AssumeTest_2 {

    @Before
    public void setUp() {
        int versionNumber = 5;
        Assume.assumeTrue(versionNumber >= 3);
    }

    @Test
    public void testOneThing() {
        System.out.println("Now we can test a thing...");
    }

    @Test
    public void testAnotherThing() {
        System.out.println("... or two...");
    }
}

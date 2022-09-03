package org.akzam.JUnit4;

import org.junit.Assume;
import org.junit.Test;

public class AssumeTest_1 {

    @Test
    public void testIfVersionGreaterThan4() {
        int versionNumber = 7;
        Assume.assumeTrue(versionNumber >= 4);
        System.out.println("Test executed");
    }
}

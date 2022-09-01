package org.akzam.JUnit4;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import static org.junit.runners.Suite.*;

@RunWith(Suite.class)
@SuiteClasses({StringUtilsParameterizedTest.class,
               CalculatorTest.class})
public class FastTestSuite {
}

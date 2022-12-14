package org.akzam.JUnit4;

import org.junit.Test;
import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;

import static org.junit.experimental.categories.Categories.*;

public class CategoriesTest {

    public interface FastTests {}
    public interface SlowTests {}
    public interface SmokeTests {}

    public static class A {
        @Test
        public void a() {
            System.out.println("running A#a()");
        }

        @Category(SlowTests.class)
        @Test
        public void b() {
            System.out.println("running A#b()");
        }

        @Category({FastTests.class, SmokeTests.class})
        @Test
        public void c() {
            System.out.println("running A#c()");
        }
    }

    @Category({SlowTests.class, FastTests.class})
    public static class B {
        @Test
        public void d() {
            System.out.println("running B#d()");
        }
    }

    @RunWith(Categories.class)
    @IncludeCategory(SlowTests.class)
    @SuiteClasses({A.class, B.class})
    public static class SlowTestSuite {}

    @RunWith(Categories.class)
    @IncludeCategory(FastTests.class)
    @SuiteClasses({A.class, B.class})
    public static class FastTestSuite {}

    @RunWith(Categories.class)
    @IncludeCategory(SmokeTests.class)
    @SuiteClasses({A.class, B.class})
    public static class SmokeTestSuite {}

}

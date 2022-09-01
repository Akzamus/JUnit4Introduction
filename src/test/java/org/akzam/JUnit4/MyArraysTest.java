package org.akzam.JUnit4;

import org.junit.*;
import static org.junit.Assert.*;

public class MyArraysTest{

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Class testing begins\n");
    }

    @AfterClass
    public static void tearDownAfterClass() {
        System.out.println("Class testing is over");
    }


    @Before
    public void setUp() {
        System.out.println("Test method start");
    }

    @After
    public void tearDown() {
        System.out.println("Test method stop\n");
    }

    @Test
    public void testBubbleSort_WithElements() {
        int[] arr = {4, 12, -17, 3};
        MyArrays.bubbleSort(arr);
        assertArrayEquals(new int[] {-17, 3, 4 ,12}, arr);
    }

    @Test
    public void testBubbleSort_WithoutElements() {
        int[] arr = {};
        MyArrays.bubbleSort(arr);
        assertArrayEquals(new int[] {}, arr);
    }

    @Test(expected = NullPointerException.class)
    public void testBubbleSort_NullArray() {
        MyArrays.bubbleSort(null);
    }
}
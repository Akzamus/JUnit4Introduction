package org.akzam.JUnit4;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedOrArrayListTest {

    private static List<String> arrayList;
    private static List<String> linkedList;

    @BeforeClass
    public static void setUpBeforeClass() {
        System.out.println("Populating ArrayList...");
        arrayList = new ArrayList<>();
        for (int i = 0; i < 10_000_000; i++)
            arrayList.add("" + i);
        System.out.println("Done.");

        linkedList = new LinkedList<>(arrayList);
    }
    @Test(timeout = 10)
    @Ignore
    public void testRemove_AL() {
        LinkedOrArrayList.remove(arrayList, "123");
    }

    @Test(timeout = 1)
    public void testRemove_LL() {
        LinkedOrArrayList.remove(linkedList, "123");
    }
}
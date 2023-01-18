package com.hillel.Test;

import com.hillel.HillelRizunDz18.TestMainIf;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMain {

    static int[] arrayTest;
    TestMainIf valid = new TestMainIf();

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All:");
        arrayTest = new int[]{1, 2, 3, 4, 5};
    }

    @Test
    public void test1() {
        double value = valid.getAverageValue(new int[]{});
        assertEquals(0.0, value);
    }

    @Test
    public void test2() {
        double value = valid.getAverageValue(null);
        assertEquals(0.0, value);
    }

    @Test
    public void test3() {
        double value = valid.getAverageValue(arrayTest);
        assertEquals(15.0, value);
    }

    @Test
    public void test4() {
       assertTrue(valid.isSquare(new int[5][5]));
    }

    @Test
    public void test5() {
        assertFalse(valid.isSquare(new int[2][3]));
    }
}
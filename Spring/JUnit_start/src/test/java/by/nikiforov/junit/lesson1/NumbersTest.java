package by.nikiforov.junit.lesson1;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    @Test
    public void sum() {
        Numbers number = new Numbers();
        int actual = number.sum(5);
        int expected = 15;
        assertEquals(expected,actual);
    }
}
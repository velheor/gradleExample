package by.grsu.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {
    @Test
    public void sumTestTrue() {
        Main main = new Main();
        Integer expected = 5;

        assertEquals(expected, main.sum(2,3));
    }

    @Test
    public void sumTestFalse() {
        Main main = new Main();
        Integer expected = 2;

        assertEquals(expected, main.sum(2,3));
    }
}
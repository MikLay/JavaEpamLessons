package ua.company;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
import static ua.company.Fibonacci.*;

public class FibonacciTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();


    @Test
    public void TestFibMatrix() {
        int actual = fibMatrix(9);
        int expected = 34;
        assertEquals(actual, expected);
    }

    @Test
    public void TestFibRecursive() {
        int actual = fibRecursive(9);
        int expected = 34;
        assertEquals(actual, expected);
    }

    @Test
    public void TestFibIter() {
        int actual = fibIter(9);
        int expected = 34;
        assertEquals(actual, expected);
    }


    @Test
    public void TestFibIterWithWrongInput(){
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("Wrong number");
        fibIter(-1);
    }
}
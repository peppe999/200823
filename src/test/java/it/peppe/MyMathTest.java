package it.peppe;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;


public class MyMathTest
{
    private static MyMath math;

    @BeforeClass
    public static void prepare() {
        math = new MyMath();
    }

    @Test
    public void primeNumbersGeneratorWorks() {
        assertEquals(new LinkedList<Integer>(), math.primeNumbersGenerator(1));
        assertEquals(Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19), math.primeNumbersGenerator(20));
    }

    @Test
    public void isPrimeWorks() {
        assertFalse(math.isPrime(9));
        assertFalse(math.isPrime(1));
        assertTrue(math.isPrime(2));
        List<Integer> primes = Arrays.asList(11, 13, 17, 19, 23, 31, 41);

        for(int prime : primes)
            assertTrue(math.isPrime(prime));

    }

}

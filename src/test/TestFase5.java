package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import multiplesFases.Step_5_Final;

class TestFase5 {

    @Test
    void testDivisorsPropis() {
        assertEquals(1, Step_5_Final.divisorsPropis(2));
        assertEquals(1, Step_5_Final.divisorsPropis(3));
        assertEquals(2, Step_5_Final.divisorsPropis(4));
        assertEquals(5, Step_5_Final.divisorsPropis(12));
        assertEquals(4, Step_5_Final.divisorsPropis(16));
    }

    @Test
    void testEsPrimer() {
        assertTrue(Step_5_Final.isPrimeNumber(2));
        assertTrue(Step_5_Final.isPrimeNumber(3));
        assertTrue(Step_5_Final.isPrimeNumber(5));
        assertTrue(Step_5_Final.isPrimeNumber(17));
        assertTrue(Step_5_Final.isPrimeNumber(199));

        assertFalse(Step_5_Final.isPrimeNumber(4));
        assertFalse(Step_5_Final.isPrimeNumber(12));
        assertFalse(Step_5_Final.isPrimeNumber(100));
    }

    @Test
    void testQuantesVegadesDivideix() {
        assertEquals(2, Step_5_Final.timesItCanBeDivided(12, 2));
        assertEquals(1, Step_5_Final.timesItCanBeDivided(12, 3));
        assertEquals(0, Step_5_Final.timesItCanBeDivided(12, 5));

        assertEquals(4, Step_5_Final.timesItCanBeDivided(16, 2));
        assertEquals(3, Step_5_Final.timesItCanBeDivided(27, 3));
        assertEquals(1, Step_5_Final.timesItCanBeDivided(45, 5));
    }
}

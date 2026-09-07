package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import multiplesFases.Fase_5_Final;

class TestFase5 {

    @Test
    void testDivisorsPropis() {
        assertEquals(1, Fase_5_Final.divisorsPropis(2));
        assertEquals(1, Fase_5_Final.divisorsPropis(3));
        assertEquals(2, Fase_5_Final.divisorsPropis(4));
        assertEquals(5, Fase_5_Final.divisorsPropis(12));
        assertEquals(4, Fase_5_Final.divisorsPropis(16));
    }

    @Test
    void testEsPrimer() {
        assertTrue(Fase_5_Final.esPrimer(2));
        assertTrue(Fase_5_Final.esPrimer(3));
        assertTrue(Fase_5_Final.esPrimer(5));
        assertTrue(Fase_5_Final.esPrimer(17));
        assertTrue(Fase_5_Final.esPrimer(199));

        assertFalse(Fase_5_Final.esPrimer(4));
        assertFalse(Fase_5_Final.esPrimer(12));
        assertFalse(Fase_5_Final.esPrimer(100));
    }

    @Test
    void testQuantesVegadesDivideix() {
        assertEquals(2, Fase_5_Final.quantesVegadesDivideix(12, 2));
        assertEquals(1, Fase_5_Final.quantesVegadesDivideix(12, 3));
        assertEquals(0, Fase_5_Final.quantesVegadesDivideix(12, 5));

        assertEquals(4, Fase_5_Final.quantesVegadesDivideix(16, 2));
        assertEquals(3, Fase_5_Final.quantesVegadesDivideix(27, 3));
        assertEquals(1, Fase_5_Final.quantesVegadesDivideix(45, 5));
    }
}

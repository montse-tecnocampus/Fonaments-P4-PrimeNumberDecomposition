package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import multiplesFases.Fase_5_Final;

public class TestFase5Privat {
	
	@Test
	void testDivisorsPropis() {
	    assertEquals(1, Fase_5_Final.divisorsPropis(2));
	    assertEquals(1, Fase_5_Final.divisorsPropis(3));
	    assertEquals(2, Fase_5_Final.divisorsPropis(4));

	    assertEquals(3, Fase_5_Final.divisorsPropis(6));
	    assertEquals(5, Fase_5_Final.divisorsPropis(12));

	    assertEquals(4, Fase_5_Final.divisorsPropis(16));
	    assertEquals(8, Fase_5_Final.divisorsPropis(36));
	}
	
	@Test
	void testEsPrimer() {
	    // Primers
	    assertTrue(Fase_5_Final.isPrimeNumber(2));
	    assertTrue(Fase_5_Final.isPrimeNumber(3));
	    assertTrue(Fase_5_Final.isPrimeNumber(5));
	    assertTrue(Fase_5_Final.isPrimeNumber(17));
	    assertTrue(Fase_5_Final.isPrimeNumber(97));

	    // No primers
	    assertFalse(Fase_5_Final.isPrimeNumber(4));
	    assertFalse(Fase_5_Final.isPrimeNumber(10));
	    assertFalse(Fase_5_Final.isPrimeNumber(12));
	    assertFalse(Fase_5_Final.isPrimeNumber(100));
	    assertFalse(Fase_5_Final.isPrimeNumber(100));
	    assertFalse(Fase_5_Final.isPrimeNumber(39));
	}
	
	@Test
	void testQuantesVegadesDivideix() {
	    assertEquals(2, Fase_5_Final.timesItCanBeDivided(12, 2));
	    assertEquals(1, Fase_5_Final.timesItCanBeDivided(12, 3));
	    assertEquals(0, Fase_5_Final.timesItCanBeDivided(12, 5));

	    assertEquals(4, Fase_5_Final.timesItCanBeDivided(16, 2));
	    assertEquals(3, Fase_5_Final.timesItCanBeDivided(27, 3));

	    assertEquals(2, Fase_5_Final.timesItCanBeDivided(100, 5));
	    assertEquals(2, Fase_5_Final.timesItCanBeDivided(100, 2));
	    
	    assertEquals(1, Fase_5_Final.timesItCanBeDivided(7, 7));
	}
	

}

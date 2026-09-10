package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


import multiplesFases.Step_5_Final;

public class TestFase5Privat {
	
	@Test
	void testDivisorsPropis() {
	    assertEquals(1, Step_5_Final.divisorsPropis(2));
	    assertEquals(1, Step_5_Final.divisorsPropis(3));
	    assertEquals(2, Step_5_Final.divisorsPropis(4));

	    assertEquals(3, Step_5_Final.divisorsPropis(6));
	    assertEquals(5, Step_5_Final.divisorsPropis(12));

	    assertEquals(4, Step_5_Final.divisorsPropis(16));
	    assertEquals(8, Step_5_Final.divisorsPropis(36));
	}
	
	@Test
	void testEsPrimer() {
	    // Primers
	    assertTrue(Step_5_Final.isPrimeNumber(2));
	    assertTrue(Step_5_Final.isPrimeNumber(3));
	    assertTrue(Step_5_Final.isPrimeNumber(5));
	    assertTrue(Step_5_Final.isPrimeNumber(17));
	    assertTrue(Step_5_Final.isPrimeNumber(97));

	    // No primers
	    assertFalse(Step_5_Final.isPrimeNumber(4));
	    assertFalse(Step_5_Final.isPrimeNumber(10));
	    assertFalse(Step_5_Final.isPrimeNumber(12));
	    assertFalse(Step_5_Final.isPrimeNumber(100));
	    assertFalse(Step_5_Final.isPrimeNumber(100));
	    assertFalse(Step_5_Final.isPrimeNumber(39));
	}
	
	@Test
	void testQuantesVegadesDivideix() {
	    assertEquals(2, Step_5_Final.timesItCanBeDivided(12, 2));
	    assertEquals(1, Step_5_Final.timesItCanBeDivided(12, 3));
	    assertEquals(0, Step_5_Final.timesItCanBeDivided(12, 5));

	    assertEquals(4, Step_5_Final.timesItCanBeDivided(16, 2));
	    assertEquals(3, Step_5_Final.timesItCanBeDivided(27, 3));

	    assertEquals(2, Step_5_Final.timesItCanBeDivided(100, 5));
	    assertEquals(2, Step_5_Final.timesItCanBeDivided(100, 2));
	    
	    assertEquals(1, Step_5_Final.timesItCanBeDivided(7, 7));
	}
	

}

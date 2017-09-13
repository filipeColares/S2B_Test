package s2bTeste.somador;

import static org.junit.Assert.*;

import org.junit.Test;

public class somadorTest {

	@Test
	public void testThatZeroPlusZeroIsZero() {
		double expected = 0;
		double actual = somador.soma(0,0);
		assertEquals(expected, actual, 0.01);
	}
	

	@Test
	public void testThatZeroPlusOneIsZero() {
		double expected = 1;
		double actual = somador.soma(0,1);
		assertEquals(expected, actual, 0.01);
		
	}


	@Test
	public void testThatZeroHalfPlusZeroHalfIsOne() {
		double expected = 1;
		double actual = somador.soma(0.5,0.5);
		assertEquals(expected, actual, 0.01);
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testThatFirstNumberIsNegative() {
		somador.soma(-10,0);
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testThatSecondNumberIsNegative() {
		somador.soma(0, -20);
	}
	
	@Test	(expected = IllegalArgumentException.class)
	public void testBouthNumbersAreNegative() {
		somador.soma(-10, -20);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testDivisor() {
		somador.subtrair(2, 3);
	}

}
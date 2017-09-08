package s2bTeste.somador;

import static org.junit.Assert.*;

import org.junit.Test;

public class somadorTest {

	@Test
	public void testThatZeroPlusZeroIsZero() {
		double expected = 0;
		double actual = somador.somador(0,0);
		assertEquals(expected, actual, 0.01);
	}
	

	@Test
	public void testThatZeroPlusOneIsZero() {
		double expected = 1;
		double actual = somador.somador(0,1);
		assertEquals(expected, actual, 0.01);
		
	}


	@Test
	public void testThatZeroHalfPlusZeroHalfIsOne() {
		double expected = 1;
		double actual = somador.somador(0.5,0.5);
		assertEquals(expected, actual, 0.01);
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testThatFirstNumberIsNegative() {
		somador.somador(-10,0);
		
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testThatSecondNumberIsNegative() {
		somador.somador(0, -20);
	}

}

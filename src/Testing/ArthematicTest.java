package Testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import Code.Arthematic;
import Code.Person;


public class ArthematicTest {
	
	@Mock
    Person person;
	
	Arthematic arth;
	
	@Before
	public void before() {
		arth = new Arthematic();
	}

	@Test
	public void testSum() {
		assertEquals(5,arth.sum(2, 3));
	}
	
	@Test
	public void testSubstract() {
		assertEquals(5,arth.substract(10, 5));
	}
	
	@Test
	public void testMultiply() {
		assertEquals(5,arth.multiply(5, 1));
	}
	
	@Test
	public void testDivide() {
		assertEquals(2,arth.divide(10, 5));
	}
	
	@Test
	public void testSquare() {
		assertEquals(49,arth.square(7));
	}

}

package Testing;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import Code.NormalMethods;
import Code.Person;

public class NormalMethodsTest {
	
	@Mock
    Person person;
	
	NormalMethods normalMethods;
	
	@Before
	public void before() {
		normalMethods =new NormalMethods();
		person = Mockito.mock(Person.class);
		when(person.getName()).thenReturn("prateek");
	}

	@Test
	public void testNameToCaps() {
		assertEquals("PRATEEK", normalMethods.nameToCaps(person));
		
	}

}

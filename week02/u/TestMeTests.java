package u;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import c.TestMe;

public class TestMeTests {

	TestMe testMe;

	@Before
	public void setUp() throws Exception {
		testMe  = new TestMe();
    }

	@Test
	public void squareTest() {

		double baseValue = 3.0;
		double expected = baseValue*baseValue;
		testMe.setValue(3.0);
		double actual = testMe.square();

		assertTrue(actual == expected);
	}

    @Test
	public void squareTestFails() {

		double baseValue = 3.0;
		double expected = baseValue*baseValue;
		testMe.setValue(3.1);
		double actual = testMe.square();

		assertTrue(actual == expected);
	}

}

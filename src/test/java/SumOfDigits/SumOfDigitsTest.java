package SumOfDigits;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

public class SumOfDigitsTest {
	private static SumOfDigits converter;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@DisplayName("1 --> 1")
	@Test
	public void test_PassingIn1() {
		//Arrange
		converter = new SumOfDigits();
		int expected = 1;
		//Act
		int result = converter.convert("1");
		//Assert
		assertEquals(expected, result);
	}

	@DisplayName("11 --> 2")
	@Test
	public void test_PassingIn11() {
		//Arrange
		converter = new SumOfDigits();
		int expected = 2;
		//Act
		int result = converter.convert("11");
		//Assert
		assertEquals(expected, result);
	}
	
	@DisplayName("9999 --> 36")
	@Test
	public void test_PassingIn9999() {
		//Arrange
		converter = new SumOfDigits();
		int expected = 36;
		//Act
		int result = converter.convert("9999");
		//Assert
		assertEquals(expected, result);
	}
	
	@DisplayName("0 --> 0")
	@Test
	public void test_PassingIn0() {
		//Arrange
		converter = new SumOfDigits();
		int expected = 0;
		//Act
		int result = converter.convert("0");
		//Assert
		assertEquals(expected, result);
	}
}

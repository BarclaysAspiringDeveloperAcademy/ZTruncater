package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import truncator.ZTruncator;

public class ZTruncatorTest {
	
	ZTruncator truncator;
	String testString;
	String expectedOutput;
	String actualOutput;
	
	@Before
	public void setUp()  {
		truncator = new ZTruncator();
	}
	
	@After
	public void tearDown()  {
		truncator = null;
	}
	
	@Test
	public void testSingleZInLeadingPosition()  {
		testString = "Z";
		expectedOutput = "";
		
		actualOutput = truncator.truncateZInFirstTwoPositions(testString);
		
		Assert.assertEquals(expectedOutput, actualOutput);
	}
	
	//If there is time, you can modify the requirements so that the ZTruncater 
	//throws an exception if the input string is null or empty.
//	@Test (expected = NullPointerException.class)
//	public void testEmptyString() {	
//		testString = "";
//		expectedOutput = "";
//		
//		actualOutput = truncator.truncateZInFirstTwoPositions(testString);
//		
//		Assert.assertEquals(expectedOutput, actualOutput);
//
//		}
	
//	@Test (expected = NullPointerException.class)
//	public void testNullString() {
//		
//		String actualOutput = truncator.truncateZInFirstTwoPositions(testString);
//		Assert.assertEquals("A", actualOutput);
//	}
	
	@Test
	public void testleadingDoubleZ() {
		testString = "ZZBCDEF";
		expectedOutput = "BCDEF";
		
		actualOutput = truncator.truncateZInFirstTwoPositions(testString);
		
		Assert.assertEquals(expectedOutput, actualOutput);
	}
	
	
	@Test
	public void testZInSecondPlace() {
		testString = "AZBCD";
		expectedOutput = "ABCD";
		
		actualOutput = truncator.truncateZInFirstTwoPositions(testString);
		
		Assert.assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	public void testNoZ() {		
		testString = "ABCDEFGHI";
		expectedOutput = "ABCDEFGHI";
	
		actualOutput = truncator.truncateZInFirstTwoPositions(testString);
	
		Assert.assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	public void testZInThirdPosition() {
		testString = "ABZCDEFGHI";
		expectedOutput = "ABZCDEFGHI";
		
		actualOutput = truncator.truncateZInFirstTwoPositions(testString);
		
		Assert.assertEquals(expectedOutput, actualOutput);
	}

	//These last two tests were not in the list of test cases, but I thought
	//it would be a good idea to do this additional testing.
	@Test
	public void testWithNumbersAndLeadingZ() {
		testString = "Z123456";
		expectedOutput = "123456";
		
		actualOutput = truncator.truncateZInFirstTwoPositions(testString);
		
		Assert.assertEquals(expectedOutput, actualOutput);
	}
	
	@Test
	public void testWithSymbolsAndLeadingDoubleZ() {
		testString = "ZZ!@#$%^&*";
		expectedOutput = "!@#$%^&*";
		
		actualOutput = truncator.truncateZInFirstTwoPositions(testString);
		
		Assert.assertEquals(expectedOutput, actualOutput);
	}

}

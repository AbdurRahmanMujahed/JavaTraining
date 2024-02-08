import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class TestCalculate {
	Calculate calc = new Calculate();
	
	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("Before class...");
	}
	
	@Before
	public void SetUp() {
		System.out.println("Before each...");
	}
	
	@Test
	public void TestAdd() {
		int expectedRes = 10;
		int actualRes = calc.Add(1, 3, 6);
		Assert.assertEquals(expectedRes, actualRes);
		
		
	}
	@Test
	public void TestMultiply() {
		
		int multiplyExpRes = 20;
		int multiplyActRes = calc.Multiply(5, 4);
		Assert.assertEquals(multiplyExpRes, multiplyActRes);
	}
	
	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("After class...");
	}
	
	@After
	public void teatDown() {
		System.out.println("After each...");
	}
}

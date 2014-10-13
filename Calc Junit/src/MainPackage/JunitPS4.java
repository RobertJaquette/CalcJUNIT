package MainPackage;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import MainPackage.Calc;
public class JunitPS4 {

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

	@Test
	public final void test() {
		Calc givenvalue = new Calc();
		double x = givenvalue.futureValue(10000, 3, 5);
		assertEquals("Failure: The number must be the value", 11576 ,(long)x);


	}

}

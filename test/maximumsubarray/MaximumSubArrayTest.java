package maximumsubarray;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MaximumSubArrayTest {
	static MaximumSubArray msa = new MaximumSubArray();

	@Parameterized.Parameters
	public static Collection<Object[]> testData() {
		Collection<Object[]> testData = new ArrayList<>();
		testData.add(new Object[][] { { -2, 11, -4, 13, -5, 2 },
				{ msa.result(1, 3) }, });
		testData.add(new Object[][] { { 2, -3, 8, -2, 7, -5 },
				{ msa.result(2, 4) }, });
		testData.add(new Object[][] { { 1, -3, 4, -2, -1, 6 },
				{ msa.result(2, 5) }, });

		return testData;
	}

	int[] a;
	MaximumSubArray.Result expected;

	public MaximumSubArrayTest(Object[] aO, Object[] resultInArray) {
		this.a = new int[aO.length];
		for (int i = 0; i < aO.length; i++) {
			a[i] = (int) aO[i];
		}
		this.expected = (MaximumSubArray.Result) resultInArray[0];
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testBruteForce() {
		assertEquals(expected, msa.bruteForce(a));
	}

	@Test
	public void testImproved() {
		assertEquals(expected, msa.improved(a));
	}

	@Test
	public void testLinear() {
		assertEquals(expected, msa.linear(a));
	}

}

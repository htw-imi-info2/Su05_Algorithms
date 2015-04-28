package euclid;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import euclid.Euclid;

@RunWith(Parameterized.class)
public class EuclidTest {

	@Parameterized.Parameters
	public static Collection<Object[]> pairs() {
		return Arrays.asList(new Object[][] { { 144, 12, 12 }, { 12, 144, 12 },
				{ 8, 6, 2 }, { 13, 7, 1 }

		});
	}

	int a, b, expected;
	Euclid euclid = new Euclid();

	public EuclidTest(int a, int b, int expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Test
	public void testEuclid1() {
		assertEquals(expected, euclid.euclid1(a, b));
	}

	@Test
	public void testEuclid2() {
		assertEquals(expected, euclid.euclid2(a, b));
	}

	@Test
	public void testGcd() {
		assertEquals(expected, euclid.gcd(a, b));
	}

	@Test
	public void testStrange() {
		assertEquals(expected, euclid.strange(a, b));
	}

	@Test
	public void testStranger() {
		assertEquals(expected, euclid.stranger(a, b));
	}

}

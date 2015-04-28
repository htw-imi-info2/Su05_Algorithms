package search;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SearchTest {
	public boolean output = false;

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		runBothFor(100);
	}

	@Test
	public void timeAFew() {
		output = true;
		runBothFor(1000);
		runBothFor(1000000);
		runBothFor(1000000000);
	}

	private void runBothFor(int n) {
		int[] a = createArray(n);
		SearchInt search = new SearchInt();
		long start = System.currentTimeMillis();
		int actual = search.binarySearch(a, 90);
		long binary = System.currentTimeMillis() - start;
		assertEquals(90, actual);
		start = System.currentTimeMillis();
		actual = search.simpleSearch(a, 90);
		long simple = System.currentTimeMillis() - start;
		assertEquals(90, actual);
		if (output)
			System.out.format("elements: %d simple: %d binary: %d\n", n,
					simple, binary);

	}

	private int[] createArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		return a;
	}

}

package exercises_class_ws18;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestMin {
	Min min = new Min();
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		int[] a = {8,3,1,4,7,3,2};
		assertEquals(2,min.findMin(a));
	
	}

}

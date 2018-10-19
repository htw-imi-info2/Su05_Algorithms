package exercises_class_ws18;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestPairs {
	Pairs p = new Pairs();

	@Test
	public void test() {
		int[] a = {8,3,1,4,7,3,2};
		assertEquals(3,p.pairs(a).size());
	}

}

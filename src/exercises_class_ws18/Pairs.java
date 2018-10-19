package exercises_class_ws18;

import java.util.ArrayList;
import java.util.List;

public class Pairs {
	class Pair {
		int i, j;
		Pair(int i, int j) {
			this.i = i;
			this.j = j;
		}
	}

	public List<Pair> pairs(int[] a) {
		List<Pair> result = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == 10)
					result.add(new Pair(i, j));
			}
		}
		return result;
	}

}

package maximumsubarray;

public class MaximumSubArray {
	public class Result {
		public int start, end;

		public Result() {
		}

		@Override
		public int hashCode() {
			return new Integer(start * end).hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (!(obj instanceof Result))
				return false;
			Result other = (Result) obj;
			return ((other.start == start) && (other.end == end));
		}

		@Override
		public String toString() {
			return "s: " + start + " e: " + end;
		}

	}

	public Result result(int start, int end) {
		Result result = new Result();
		result.start = start;
		result.end = end;
		return result;
	}

	public Result bruteForce(int[] a) {
		int maxSum = 0;
		int start = -1, end = -1;
		for (int lower = 0; lower < a.length; lower++) {
			for (int upper = lower; upper < a.length; upper++) {
				int thisSum = 0;
				for (int k = lower; k <= upper; k++) {
					thisSum += a[k];
				}
				if (thisSum > maxSum) {
					maxSum = thisSum;
					start = lower;
					end = upper;
				}
			}
		}
		return result(start, end);
	}

	public Result improved(int[] a) {
		int maxSum = 0, start = -1, end = -1;
		for (int lower = 0; lower < a.length; lower++) {
			int thisSum = 0;
			for (int upper = lower; upper < a.length; upper++) {
				thisSum += a[upper];
				if (thisSum > maxSum) {
					maxSum = thisSum;
					start = lower;
					end = upper;
				}
			}
		}
		return result(start, end);
	}

	public Result linear(int[] a) {
		Result result = null;
		int maxSum = 0, thisSum = 0;
		int lower = 1, upper = -1;
		for (lower = 0, upper = 0; upper < a.length; upper++) {
			thisSum += a[upper];
			if (thisSum > maxSum) {
				maxSum = thisSum;
				result = result(lower, upper);
			} else if (thisSum <= 0) {
				lower = upper + 1;
				thisSum = 0;
			}
		}
		return result;
	}
}

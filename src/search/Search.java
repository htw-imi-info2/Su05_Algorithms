package search;

public class Search <T extends Comparable<T>> {

	public int simpleSearch(T[] a, T x) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].compareTo(x) == 0)
				return i;
		}
		return -1;
	}

	public int binarySearch(T[] a, T x) {
		int low = 0;
		int high = a.length - 1;
		int mid;
		while (low <= high) {
			mid = (low + high) / 2;
			if (a[mid].compareTo(x) < 0) {
				low = mid + 1;
			} else if (a[mid].compareTo(x) > 0) {
				high = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
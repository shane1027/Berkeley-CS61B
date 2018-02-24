public class WindowPosSum {
	/**	implement a windowed summation on array a from a[i] through a[i+n] */
	public static void win_sum(int[] a, int n) {
		int sum = 0;
		int end = 0;
		for (int i = 0; i < a.length; i++) {
			sum = 0;
			// only act if current val is positive
			if (a[i] > 0) {
				// check to make sure we aren't exceeding array bounds
				if (i+n >= a.length) {
					end = a.length - 1;
				} else {
					end = i + n;
				}
				for (int j = i; j <= end; j++) {
					sum = sum + a[j];
				}
				a[i] = sum;
			}
		}
	}
	
	public static void win_sum2(int[] a, int n) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0)
				continue;
			sum = 0;
			for (int j = i; j < i + n; j++) {
				if (j == a.length)
					break;
				sum = sum + a[j];
			}
			a[i] = sum;
		}
	}

	public static void main(String[] args) {
		int[] a = new int[] {1, 2, -3, 4, 5, 4};
		int[] b = new int[] {1, 2, -3, 4, 5, 4};
		win_sum(a, 3);
		win_sum(b, 3);
		System.out.println(java.util.Arrays.toString(a));
		System.out.println(java.util.Arrays.toString(b));
	}
}
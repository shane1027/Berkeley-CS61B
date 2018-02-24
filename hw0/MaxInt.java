public class MaxInt {

	/** returns max value from m	*/
	public static int max(int[] m) {
		int i; int max = 0;
		for (i = 0; i < m.length; i++) {
			if (m[i] > max) {
				max = m[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] numbers = new int[] { 9, 20, 50, 5, 6, 4};
		System.out.println(max(numbers));
	}
	
}
package studyCh1;

public class Max3m {

	/*
	 * 실습 1-2
	 * 
	 */

	public static void main(String[] args) {

		System.out.println("max3(3,2,1): " + max3(3, 2, 1));

	}

	static int max3(int a, int b, int c) {
		int max = a;
		if (b > max)
			max = b;

		if (c > max)
			max = c;

		return max;
	}

	/*
	 * 연습문제 1-1
	 */
	static int max4(int a, int b, int c, int d) {

		int max = a;

		if (b > max)
			max = b;

		if (c > max)
			max = c;

		if (d > max)
			max = d;

		return max;

	}

	/*
	 * 연습문제 1-2
	 */
	static int min3(int a, int b, int c) {
		int min = a;

		if (min > b)
			min = b;
		if (min > c)
			min = c;

		return min;

	}

	/*
	 * 연습문제 1-3
	 */
	static int min4(int a, int b, int c, int d) {
		int min = a;

		if (min > b)
			min = b;
		if (min > c)
			min = c;
		if (min > d)
			min = d;

		return min;

	}
}

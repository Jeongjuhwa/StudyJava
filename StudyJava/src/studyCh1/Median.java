package studyCh1;

import java.util.Scanner;

public class Median {

	/*
	 * 실습 1C-1
	 * 
	 */

	static int med3(int a, int b, int c) {

		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;

	}

	/*
	 * 연습문제 1-4
	 * 
	 */
	static int median3(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}

	/*
	 * 연습문제 1-5
	 * 
	 */
	static int goodMed3(int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("세 정수의 중앙값을 구합니다.");
		System.out.print("a: ");
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		System.out.print("c: ");
		int c = sc.nextInt();

		System.out.println("세 정수의 중앙값: " + med3(a, b, c));
	}

}

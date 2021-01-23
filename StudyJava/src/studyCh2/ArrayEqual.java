package studyCh2;

import java.util.Scanner;

public class ArrayEqual {

	/*
	 * 실습 2-7
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("배열a의 요솟수: ");
		int na = sc.nextInt();

		int[] a = new int[na];

		for (int i = 0; i < na; i++) {
			System.out.print("a[" + i + "]: ");
			a[i] = sc.nextInt();

		}

		System.out.print("배열b의 요솟수: ");
		int nb = sc.nextInt();

		int[] b = new int[nb];

		for (int i = 0; i < nb; i++) {
			System.out.print("a[" + i + "]: ");
			b[i] = sc.nextInt();

		}

		System.out.println("배열a와 b는 " + (equals(a, b) ? "같습니다" : "같지않습니다."));

	}

	static boolean equals(int[] a, int[] b) {

		if (a.length != b.length)
			return false;

		for (int i = 0; i < a.length; i++)
			if (a[i] != b[i])
				return false;

		return true;

	}

	/*
	 * 연습문제 2-4
	 * 
	 */
	static void copy(int[] a, int[] b) {

		int len = a.length <= b.length ? a.length : b.length;

		for (int i = 0; i < len; i++)
			a[i] = b[i];

	}

	/*
	 * 연습문제 2-5
	 * 
	 */
	static void rcopy(int[] a, int[] b) {
		int len = a.length <= b.length ? a.length : b.length;

		for (int i = 0; i < len; i++)
			a[i] = b[(b.length - 1) - i];

	}

}

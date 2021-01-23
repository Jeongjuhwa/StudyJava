package studyCh2;

import java.util.Scanner;

public class ShowReverse {

	/*
	 * 연습문제 2-2
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("요소수: ");
		int num = sc.nextInt();
		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}

		showReverse(x);

		System.out.println("배열의 합: " + sumOf(x));

	}

	static void swap(int[] a, int idx1, int idx2) {

		System.out.printf("a[%d]과(와) a[%d]를 교환합니다.\n", idx1, idx2);
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void showReverse(int[] a) {

		printArr(a);

		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
			printArr(a);
		}

		System.out.println("역순정렬을 마쳤습니다.");

	}

	static void printArr(int[] a) {

		for (int value : a) {
			System.out.printf("%d ", value);
		}
		System.out.println();
	}

	/*
	 * 연습문제 2-3
	 * 
	 */

	static int sumOf(int[] a) {

		int sum = 0;

		for (int value : a)
			sum += value;

		return sum;

	}

}

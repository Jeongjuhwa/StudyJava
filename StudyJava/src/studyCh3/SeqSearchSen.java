package studyCh3;

import java.util.Scanner;

public class SeqSearchSen {

	/*
	 * 실습 3-3 보초법
	 * 
	 */

	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;

		a[n] = key;

		while (true) {
			if (a[i] == key)
				break;
			i++;
		}

		return i == n ? -1 : i;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수: ");
		int num = sc.nextInt();

		int[] x = new int[num + 1];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}

		System.out.print("검색할 값: ");
		int key = sc.nextInt();

		int idx = seqSearchSen2(x, num, key);

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(key + "는 x[" + idx + "]에 있습니다.");

	}

	/*
	 * 연습문제 3-1
	 * 
	 */

	static int seqSearchSen2(int[] a, int n, int key) {

		int i = 0;
		a[n] = key;

		for (i = 0; i <= a.length; i++)
			if (a[i] == key)
				break;

		return i == n ? -1 : i;

	}

}

package studyCh3;

import java.util.Scanner;

public class SeqSearch {

	/*
	 * 실습 3-1 선형검색
	 * 
	 */

	static int seqSearch(int[] a, int n, int key) {
		int i = 0;

		while (true) {
			if (i == n)
				return -1;
			if (a[i] == key)
				return i;
			i++;
		}
	}

	/*
	 * 실습 3-2
	 * 
	 */

	static int seqSearch2(int[] a, int n, int key) {

		for (int i = 0; i < n; i++)
			if (a[i] == key)
				return i;
		return -1;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("요솟수: ");
		int num = sc.nextInt();

		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();
		}

		System.out.print("검색할 값: ");
		int key = sc.nextInt();

		int idx = seqSearch3(x, num, key);

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(key + "는 x[" + idx + "]에 있습니다.");

	}
	
	/*
	 * 연습문제 3-2
	 * 
	 */

	static int seqSearch3(int a[], int n, int key) {
		System.out.print("  | ");
		for (int k = 0; k < n; k++)
			System.out.printf("   %d", k);
		System.out.println();
		for (int k = 0; k < 4 * n + 2; k++)
			System.out.printf("-"); // 4*n + 2 번 출력
		int i;
		// n줄
		for (i = 0; i <= n; i++) {
			if (i == n)
				break;
			System.out.println();
			System.out.printf(String.format("   %%%ds*\n", (i * 4) + 3), "");
			System.out.printf("%2d|", i);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			if (a[i] == key)
				break;
		}
		System.out.println();
		return i == n ? -1 : i;
	}

}

package studyCh3;

import java.util.Scanner;

public class BinSearch {

	/*
	 * 실습 3-3 이진 검색
	 * 
	 */

	static int binSearch(int[] a, int n, int key) {

		int pl = 0;
		int pr = n - 1;

		do {
			int pc = (pl + pr) / 2;
			if (a[pc] == key)
				return pc;
			else if (a[pc] < key)
				pl = pc + 1;
			else
				pr = pc - 1;
		} while (pl <= pr);

		return -1;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("요소수: ");
		int num = sc.nextInt();

		int[] x = new int[num];

		System.out.println("오름차순으로 입력하세요.");

		System.out.print("x[0]: ");
		x[0] = sc.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]: ");
				x[i] = sc.nextInt();

			} while (x[i] < x[i - 1]);
		}

		System.out.print("검색할 값: ");
		int key = sc.nextInt();

		int idx = binSearch(x, num, key);

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(key + "는 x[" + idx + "]에 있습니다.");

	}

}

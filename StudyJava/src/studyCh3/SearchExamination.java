package studyCh3;

import java.util.Scanner;

public class SearchExamination {

	/*
	 * 연습문제 3-3
	 * 
	 */

	static int searchIdx(int[] a, int n, int key, int[] idx) {

		int length = 0;

		for (int i = 0; i < n; i++) {

			if (a[i] == key) {
				idx[length++] = i;
			}

		}

		return length;

	}

	/*
	 * 연습문제 3-4
	 * 
	 */

	static int binSearchEx(int[] a, int n, int key) {
		System.out.print("   |");

		for (int k = 0; k < n; k++)
			System.out.printf("%4d", k);
		System.out.println();

		System.out.print("---+");

		for (int k = 0; k < 4 * n + 2; k++)
			System.out.print("-");
		System.out.println();

		int pl = 0; // 검색범위 맨 앞의 index
		int pr = n - 1; // 검색범위 맨 뒤의 index

		do {
			int pc = (pl + pr) / 2; // 중앙요소의 index
			System.out.print("   |");
			if (pl != pc)
				System.out.printf(String.format("%%%ds<-%%%ds+", (pl * 4) + 1, (pc - pl) * 4), "", "");
			else
				System.out.printf(String.format("%%%ds<-+", pc * 4 + 1), "");
			if (pc != pr)
				System.out.printf(String.format("%%%ds->\n", (pr - pc) * 4 - 2), "");
			else
				System.out.println("->");
			System.out.printf("%3d|", pc);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
			if (a[pc] == key)
				return pc; // 검색성공
			else if (a[pc] < key)
				pl = pc + 1; // 검색범위를 뒤쪽 절반으로 좁힘
			else
				pr = pc - 1; // 검색범위를 앞쪽 절반으로 좁힘
		} while (pl <= pr);

		return -1; // 검색실패
	}

	public static void main(String[] args) {

		int[] x = { 1, 2, 3, 7, 7, 7, 7, 7, 9 };

		int num = 9;

		int key = 7;

		int idx = binSearchX(x, num, key);

		if (idx == -1)
			System.out.println("key값 없음");
		else
			System.out.println(idx);
	}

	/*
	 * 연습문제 3-5
	 * 
	 */

	static int binSearchX(int[] a, int n, int key) {

		int pl = 0;
		int pr = n - 1;

		do {
			int pc = (pl + pr) / 2;
			if (a[pc] == key)
				do {
					if (a[pc] == a[pc - 1])
						pc = pc - 1;
					return pc;
				} while (a[pc] == a[pc - 1]);

			else if (a[pc] < key)
				pl = pc + 1;
			else
				pr = pc - 1;
		} while (pl <= pr);

		return -1;

	}

}

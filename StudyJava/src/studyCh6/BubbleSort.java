package studyCh6;

import java.util.Scanner;

public class BubbleSort {

	/*
	 * 실습 6-1 -> 버블 정렬(ver.1)
	 * 
	 */

	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// 버블정렬
	static void bubbleSort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++)
			for (int j = n - 1; j > i; j--)
				if (a[j - 1] > a[j])
					swap(a, j, j - 1);

	}
	/*
	 * 연습문제 6-1 -> 버블정렬 역순
	 * 
	 */

	static void reverseBubbleSort(int[] a, int n) {
		for (int i = n - 1; i > 0; i--)
			for (int j = 0; j < i; j++)
				if (a[j + 1] < a[j])
					swap(a, j, j + 1);

	}

	/*
	 * 연습문제 6-2 -> 버블정렬 자세히 출력 ( 교환 수행은 +로 표시 수행x는 -로 표시
	 * 
	 */

	static void detailBubbleSort(int[] a, int n) {
		int ccnt = 0; // 비교 횟수
		int scnt = 0; // 교환 횟수

		for (int i = 0; i < n - 1; i++) {
			System.out.printf("패스%d：\n", i + 1);
			for (int j = n - 1; j > i; j--) {
				for (int m = 0; m < n - 1; m++)
					System.out.printf("%3d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
				System.out.printf("%3d\n", a[n - 1]);

				ccnt++;
				if (a[j - 1] > a[j]) {
					scnt++;
					swap(a, j - 1, j);
				}
			}
			for (int m = 0; m < n; m++)
				System.out.printf("%3d  ", a[m]);
			System.out.println();
		}

		System.out.println("비교를 " + ccnt + "회 했습니다.");
		System.out.println("교환를 " + scnt + "회 했습니다.");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("버블정렬(버전1)");
		System.out.print("요솟수: ");
		int n = sc.nextInt();
		int[] x = new int[n];

		for (int i = 0; i < x.length; i++) {
			System.out.print("x[" + i + "]: ");
			x[i] = sc.nextInt();

		}

		detailBubbleSort(x, n);

		System.out.println("오름차순 역버블정렬완료");
		for (int i = 0; i < x.length; i++)
			System.out.println("x[" + i + "]: " + x[i]);

	}

}

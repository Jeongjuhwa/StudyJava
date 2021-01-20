package studyCh1;

import java.util.Scanner;

public class TriangleLB {

	/*
	 * 실습 1-8
	 * 
	 */

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int n;
//
//		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
//
//		do {
//			System.out.print("단: ");
//			n = sc.nextInt();
//
//		} while (n <= 0);
//
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= i; j++)
//				System.out.print("*");
//			System.out.println();
//		}

		triangleLB2(4);
		triangleLU(4);
		triangleRU(4);
		triangleRB(4);
		spira(4);
		npira(4);

	}

	/*
	 * 연습문제 1-15
	 * 
	 */

	static void triangleLB2(int n) {

		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}

	}

	static void triangleLU(int n) {
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다.");

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++)
				System.out.print("*");
			System.out.println();
		}

	}

	static void triangleRU(int n) {

		System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다.");

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}

			for (int k = i; k <= n; k++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

	static void triangleRB(int n) {

		System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다.");

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n - 1; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();

		}

	}

	/*
	 * 연습문제 1-16
	 * 
	 */
	static void spira(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n - 1; j++)
				System.out.print(" ");

			for (int k = 1; k <= (i - 1) * 2 + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

	/*
	 * 연습문제 1-17
	 * 
	 */

	static void npira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n - 1; j++)
				System.out.print(" ");

			for (int k = 1; k <= (i - 1) * 2 + 1; k++) {
				System.out.print(i);
			}
			System.out.println();
		}

	}

}

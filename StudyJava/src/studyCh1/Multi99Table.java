package studyCh1;

import java.util.Scanner;

public class Multi99Table {

	/*
	 * 실습 1-7
	 * 
	 */

	public static void main(String[] args) {
//		System.out.println("----- 곱셈표 -----");
//
//		for (int i = 1; i < 10; i++) {
//			for (int j = 1; j < 10; j++)
//				System.out.printf("%3d", i * j);
//			System.out.println();
//		}

//		multi99Table2();
//		add99Table();
		makeSquare();

	}

	/*
	 * 연습문제 1-12
	 * 
	 */

	static void multi99Table2() {

		System.out.print("  |");

		for (int i = 1; i < 10; i++) {
			System.out.printf("%3d", i);
		}

		System.out.println();
		System.out.println("--+---------------------------");

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d |", i);
			for (int j = 1; j < 10; j++) {
				System.out.printf("%3d", i * j);
			}
			System.out.println();
		}

	}

	/*
	 * 연습문제 1-13
	 * 
	 */

	static void add99Table() {
		System.out.print("  |");

		for (int i = 1; i < 10; i++) {
			System.out.printf("%3d", i);
		}

		System.out.println();
		System.out.println("--+---------------------------");

		for (int i = 1; i < 10; i++) {
			System.out.printf("%d |", i);
			for (int j = 1; j < 10; j++) {
				System.out.printf("%3d", i + j);
			}
			System.out.println();
		}

	}

	/*
	 * 연습문제 1-14
	 * 
	 */

	static void makeSquare() {

		Scanner sc = new Scanner(System.in);

		System.out.println("사각형을 출력합니다.");
		System.out.print("단수: ");

		int num = sc.nextInt();

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}

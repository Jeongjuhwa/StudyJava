package studyCh1;

import java.util.Scanner;

public class SumForPos {

	/*
	 * 실습 1-6
	 * 
	 */

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int n;
//
//		System.out.println("1부터 n까지의 합을 구합니다.");
//
//		do {
//			System.out.print("n의 값: ");
//			n = sc.nextInt();
//		} while (n <= 0);
//
//		int sum = 0;
//
//		for (int i = 0; i <= n; i++)
//			sum += i;
//
//		System.out.println(n + "까지의 합은: " + sum);

//		minus();
		digit();

	}

	/*
	 * 연습문제 1-10
	 * 
	 */

	static void minus() {
		Scanner sc = new Scanner(System.in);
		int b;
		System.out.print("a의 값: ");
		int a = sc.nextInt();

		do {
			System.out.print("b의 값: ");
			b = sc.nextInt();

			if (a > b)
				System.out.println("a보다 큰 값을 입력하세요.");
		} while (a > b);

		System.out.println(b - a);

	}

	/*
	 * 연습문제 1-11
	 * 
	 */

	static void digit() {

		Scanner sc = new Scanner(System.in);
		int number;
		int cnt = 0;
		System.out.print("정수: ");
		int num = sc.nextInt();
		number = num;
		while (num != 0) {
			num = num / 10;
			cnt++;
		}

		System.out.print(number + "은 " + cnt + "자리 정수입니다.");

	}

}

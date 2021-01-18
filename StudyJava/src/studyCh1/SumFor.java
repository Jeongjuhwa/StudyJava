package studyCh1;

import java.util.Scanner;

public class SumFor {

	/*
	 * 실습 1-5
	 * 
	 */
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("1부터 n까지의 합을 구합니다.");
//		System.out.print("n의 값: ");
//		int n = sc.nextInt();
//
//		int sum = 0;
//
//		for (int i = 1; i <= n; i++)
//			sum += i;
//
//		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
//		printSum();

//		gausSum();

		System.out.println(sumof(5, 3));
	}

	/*
	 * 연습문제 1-7
	 * 
	 */

	static void printSum() {

		Scanner sc = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("num의 값: ");
		int num = sc.nextInt();

		int sum = 0;

		for (int i = 1; i <= num; i++) {
			sum += i;
			if (num > i)
				System.out.print(i + " + ");
			else
				System.out.print(i + " = ");

		}

		System.out.print(sum);

	}

	/*
	 * 연습문제 1-8
	 * 
	 */

	static void gausSum() {

		Scanner sc = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("num의 값: ");
		int num = sc.nextInt();

		int sum = (num + 1) * (num / 2) + (num % 2 == 0 ? 0 : num / 2 + 1);

		System.out.println(sum);

	}

	/*
	 * 연습문제 1-9
	 * 
	 */

	static int sumof(int a, int b) {

		int sum = 0;
		if (a < b)
			for (int i = a; i <= b; i++)
				sum += i;
		else
			for (int i = b; i <= a; i++)
				sum += i;

		return sum;

	}

}

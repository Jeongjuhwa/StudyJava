package studyCh5;

import java.util.Scanner;

/*
 * 실습 5-2 -> 유클리드 호재법
 * 
 */

public class EuclidGCD {

	// 최대공약수를 구하는 메서드
	static int gcd(int x, int y) {
		if (y == 0)
			return x;
		else
			return gcd(y, x % y);
	}

	/*
	 * 연습문제 5-2 -> 재귀 메서드 호출 사용하지 않고 gcd 메서드 작성
	 * 
	 */

	static int gcd2(int x, int y) {

		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;

	}

	/*
	 * 연습문제 5-3 -> 배열의 모든 요소의 최대공약수를 구하는 메서드 작성
	 * 
	 */

	static int gcdArray(int[] a, int start, int num) {

		if (num == 1)
			return a[start];
		else if (num == 2)
			return gcd(a[start], a[start + 1]);
		else
			return gcd(a[start], gcdArray(a, start, num - 1));

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		System.out.println("두 수의 최대공약수를 구합니다.");
//		System.out.print("정수를 입력하세요.: ");
//		int x = sc.nextInt();
//		System.out.print("정수를 입력하세요.: ");
//		int y = sc.nextInt();
		System.out.print("정수 몇 개의 최대 공약수를 구할까요?：");
		int num;
		do {
			num = sc.nextInt();
		} while (num <= 1);

		int[] x = new int[num]; // 길이 num인 배열

		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]：");
			x[i] = sc.nextInt();
		}

		System.out.println("최대 공약수는 " + gcdArray(x, 0, num) + "입니다.");
	}

}

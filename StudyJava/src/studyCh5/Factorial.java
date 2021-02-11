package studyCh5;

import java.util.Scanner;

/*
 * 실습 5-1 -> 팩토리얼을 재귀적으로 구현
 * 
 */

public class Factorial {

	static int factorial(int n) {
		if (n > 0)
			return n * factorial(n - 1); // 재귀 호출(직접 재귀)
		else
			return 1;
	}

	/*
	 * 연습문제 5-1 -> 재귀 메서드 호출 사용하지 않고 factorial 메서드 작성
	 * 
	 */

	static int factorial2(int n) {

		int x = 1;
		while (n > 1) {
			x *= n--;
		}
		return x;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요.: ");
		int num = sc.nextInt();

		System.out.println(num + "의 팩토리얼은: " + factorial2(num));

	}

}

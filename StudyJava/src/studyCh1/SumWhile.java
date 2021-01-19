package studyCh1;

import java.util.Scanner;

public class SumWhile {
	/*
	 * 실습 1-4
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값: ");
		int n = sc.nextInt();

		int sum = 0;

		int i = 1;

		while (i <= n) {
			sum += i;
			i++;
		}

		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");

	}

	/*
	 * 연습문제 1-6 - > main 함수에서 합 print 하기 전에 i 프린트 하면 n+1의 값임.
	 * 
	 */

}

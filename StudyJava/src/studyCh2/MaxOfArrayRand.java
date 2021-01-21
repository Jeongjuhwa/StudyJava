package studyCh2;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

	/*
	 * 실습 2-5
	 * 
	 */

	static int maxOf(int[] a) {

		int max = a[0];

		for (int i = 1; i < a.length; i++)
			if (a[i] > max)
				max = a[i];

		return max;

	}

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);

		System.out.println("키의 최댓값을 구합니다.");

		/*
		 * 연습문제 2-1
		 */
		int num = rand.nextInt(10) + 1;
		System.out.println("사람 수: " + num);
		/*
		 * 여기까지
		 */

		int[] height = new int[num];

		for (int i = 0; i < num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "]: " + height[i]);
		}

		System.out.println("최댓값은 " + maxOf(height) + "입니다.");

	}

}

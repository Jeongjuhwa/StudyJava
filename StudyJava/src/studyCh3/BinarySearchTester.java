package studyCh3;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {

	/*
	 * 실습 3-5
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("요소수: ");
		int num = sc.nextInt();

		int[] x = new int[num];

		System.out.println("오름차순으로 입력하세요.");

		System.out.print("x[0]: ");
		x[0] = sc.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.print("x[" + i + "]: ");
				x[i] = sc.nextInt();

			} while (x[i] < x[i - 1]);
		}

		System.out.print("검색할 값: ");
		int key = sc.nextInt();

		int idx = Arrays.binarySearch(x, key);

		/*
		 * 연습문제 3-6 -> 삽입포인트 출력하기.
		 * 
		 */

		if (idx < 0)
			System.out.println("삽입포인트: " + ((-1 * idx) - 1));
		else
			System.out.println(key + "는 x[" + idx + "]에 있습니다.");

	}

}

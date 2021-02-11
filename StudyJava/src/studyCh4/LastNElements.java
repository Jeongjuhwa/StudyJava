package studyCh4;

import java.util.Scanner;

/*
 * 실습 4C-1 -> 원하는 개수만큼 값을 입력 받아 요솟수가 N인 배열에 마지막 N개를 저장(링 버퍼 활용 / 오래된 데이터는 삭제)
 * 
 */
public class LastNElements {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		final int N = 10;
		int[] a = new int[N]; // 입력 받은 값을 저장
		int cnt = 0; // 입력 받은 갯수
		int retry;

		System.out.println("정수를 입력하세요.");

		do {
			System.out.printf("%d번째 정수: ", cnt + 1);
			a[cnt++ % N] = sc.nextInt();

			System.out.print("계속 할까요?(예:1 아니오:0): ");
			retry = sc.nextInt();
		} while (retry == 1);

		int i = cnt - N;
		if (i < 0)
			i = 0;

		for (; i < cnt; i++) // 새로운 for문 문법!! i부터 시작한다 가정하면 그냥 ;으로 표시 가능!

			System.out.printf("%2d번째의 정수 = %d\n", i + 1, a[i % N]);

	}

}

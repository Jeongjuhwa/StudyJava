package studyCh5;

public class EightQueen {

	/*
	 * 실습 5-9 -> 8퀸 문제풀이
	 * 
	 */
	static boolean[] flag_a = new boolean[8]; // 각 행에 퀸을 배치했는지 체크
	static boolean[] flag_b = new boolean[15]; // / 대각선 방향으로 퀸 배치했는지 체크
	static boolean[] flag_c = new boolean[15]; // \ 대각선 방향으로 퀸을 배치했는지 체크
	static int[] pos = new int[8]; // 각 열의 퀸의 위치

	/*
	 * 연습문제 5-8 -> 전각 기호 '■', '□'를 사용해 출력
	 * 
	 */
	static void print() {
		for (int i = 0; i < pos.length; i++) {
			for (int j = 0; j < pos.length; j++)
				System.out.printf("%s", j == pos[i] ? "■" : "□");
			System.out.println();
		}
		System.out.println();

	}

	// i열의 알맞은 위치에 퀸을 배치
	static void set(int i) {
		for (int j = 0; j < 8; j++) {
			if (flag_a[j] == false && // 가로에 배치 x
					flag_a[j] == false && // 대각선 /에 배치 x
					flag_c[i - j + 7] == false) { // 대각선 \에 배치 x
				pos[i] = j;
				if (i == 7)
					print();
				else {
					flag_a[j] = flag_a[j] = flag_c[i - j + 7] = true;
					set(i + 1);
					flag_a[j] = flag_a[j] = flag_c[i - j + 7] = false;
				}
			}
		}
	}

	/*
	 * 연습문제 5-9 -> 비재귀적 구현(공부 좀 더해서 풀기)
	 * 
	 */

	static void set2(int i) {
		for (int j = 0; j < 8; j++) {
			if (flag_a[j] == false && // 가로에 배치 x
					flag_a[j] == false && // 대각선 /에 배치 x
					flag_c[i - j + 7] == false) { // 대각선 \에 배치 x
				pos[i] = j;
				if (i == 7)
					print();
				else {
					flag_a[j] = flag_a[j] = flag_c[i - j + 7] = true;
					set(i + 1);
					flag_a[j] = flag_a[j] = flag_c[i - j + 7] = false;
				}
			}
		}
	}

	public static void main(String[] args) {
		set(0);
	}

}

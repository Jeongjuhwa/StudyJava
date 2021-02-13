package studyCh5;

public class QueenBB {

	/*
	 * 실습 5-8 -> 각 행, 열에 1개의 퀸을 배치하는 조합을 재귀적으로 표헌
	 * 
	 */

	static boolean[] flag = new boolean[8];
	static int[] pos = new int[8];

	static void print() {
		for (int i = 0; i < pos.length; i++)
			System.out.printf("%2d", pos[i]);
		System.out.println();

	}

	static void set(int i) {
		for (int j = 0; j < 8; j++) {
			if (flag[j] == false) { // j행에 아직 퀸을 배치 안했으면..
				pos[i] = j; // 퀸 배치
				if (i == 7)
					print();
				else {
					flag[j] = true;
					set(i + 1);
					flag[j] = false;
				}
			}
		}

	}

	public static void main(String[] args) {
		set(0);
	}

}

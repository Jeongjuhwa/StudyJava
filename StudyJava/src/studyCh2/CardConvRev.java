package studyCh2;

import java.util.Scanner;

public class CardConvRev {

	/*
	 * 실습 2-8[A]
	 * 
	 */

	static int cardConvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);

		return digits;
	}

	/*
	 * 실습 2-8[B]
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];

		System.out.println("10진수를 기수 변환합니다.");

		do {
			do {
				System.out.print("변환하는 음이 아닌 정수: ");
				no = sc.nextInt();
			} while (no < 0);

			do {
				System.out.print("어떤 진수로 변환할까요? (2~36): ");
				cd = sc.nextInt();
			} while (cd < 2 || cd > 36);

			showCardConv(no, cd, cno);

			System.out.print(cd + "진수로는 ");
			for (int idx = 0; idx < cno.length; idx++)
				System.out.print(cno[idx]);
			System.out.println("입니다.");

			System.out.print("한번 더 할까요? (예:1 아니오:0)");
			retry = sc.nextInt();

		} while (retry == 1);

	}

	/*
	 * 연습문제 2-6
	 * 
	 */

	static int cardConv(int x, int r, char[] d) {

		int digits = 0;

		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);

		for (int i = 0; i < d.length / 2; i++) {

			char t = d[i];
			d[i] = d[d.length - 1 - i];
			d[d.length - 1 - i] = t;

		}

		return digits;

	}

	/*
	 * 연습문제 2-7
	 * 
	 */
	static int showCardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		do {
			System.out.printf("%d|%6d   ...%d\n", r, x, x % r);
			System.out.println(" +------");

			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while (x != 0);

		for (int i = 0; i < d.length / 2; i++) {

			char t = d[i];
			d[i] = d[d.length - 1 - i];
			d[d.length - 1 - i] = t;

		}

		return digits;
	}

}

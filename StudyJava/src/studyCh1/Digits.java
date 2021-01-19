package studyCh1;

import java.util.Scanner;

public class Digits {
	/*
	 * 실습 1C-2
	 * 
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int no;

		System.out.println("2자리 정수를 입력하세요..");
		do {
			System.out.print("입력: ");
			no = sc.nextInt();
		} while (no > 99 || no < 10);

		System.out.println("변수 no의 값은 " + no + "가 되었습니다.");

	}

}

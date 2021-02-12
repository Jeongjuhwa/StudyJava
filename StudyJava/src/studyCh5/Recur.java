package studyCh5;

import java.util.Scanner;

import studyCh4.IntStack;

/*
 * 실습 5-3 -> 재귀 함수
 * 
 */

public class Recur {
	
	/*
	 * 실습 5-4 -> 실습 5-3의 메서드 꼬리재귀 제거
	 * 
	 */
	static void recur3(int n) {
		while (n > 0) {
			recur3(n - 1);
			System.out.println(n);
			n = n - 2;
		}
	}

	static void recur(int n) {
		if (n > 0) {
			recur(n - 1);
			System.out.println(n);
			recur(n - 2);
		}
	}
	
	/*
	 * 실습 5-5 -> 실습 5-3의 메서드 꼬리재귀 제거(모든 재귀 제거)
	 * 
	 */
	
	static void recur4(int n) {

		IntStack s = new IntStack(n);

		while (true) {
			if (n > 0) {
				s.push(n);
				n = n - 1;
				continue;
			}

			if (s.isEmpty() != true) {
				n = s.pop();
				System.out.println(n);
				n = n - 2;
				continue;
			}
			break;

		}
		
	}

	/*
	 * 연습문제 5-4 -> 메서드를 보고 상향식, 하향식 분석
	 * 
	 */

	static void recur2(int n) {
		if (n > 0) {
			recur2(n - 2);
			System.out.println(n);
			recur2(n - 1);
		}
		
		
		/* 상향식 -> recur2(-1), recur2(0)은 아무것도 출력 안함
		 * recur2(1): recur2(-1) 1 recur2(0) ''' 1  
		 * recur2(2): recur2(0)  2 recur2(1) ''' 2 1
		 * recur2(3): recur2(1)  3 recur2(2) ''' 1 3 2 1
		 * recur2(4): recur2(2)  4 recur2(3) ''' 2 1 4 1 3 2 1
		 * 
		 * 하향식 -> 노트에 그림으로 실습
		 */
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수: ");
		int x = sc.nextInt();

		recur2(x);
	}

}

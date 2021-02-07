package studyCh4;

import java.util.Scanner;

import studyCh4.IntStack.EmptyIntStackException;

public class IntStackTester {

	/*
	 * 실습 4-2 -> IntStack 클래스 사용
	 * 
	 */

	/*
	 * 연습문제 4-1 -> IntStack 클래스의 메소드 전부 추가
	 * 
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		IntStack stack = new IntStack(64);

		while (true) {
			System.out.println("현재 데이터 수: " + stack.size() + " / " + stack.capacity());

			System.out.print("(1)푸시 (2)팝 (3)피크 (4)덤프 (5)검색 (6)스택 초기화 (7)EMPTY? (8)FULL? (0)종료:");
			int menu = sc.nextInt();
			if (menu == 0)
				break;

			int x;
			int search;
			boolean value;

			switch (menu) {
			case 1: // 푸시
				System.out.print("데이터: ");
				x = sc.nextInt();
				try {
					stack.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			case 2: // 팝
				try {
					x = stack.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			case 3: // 피크
				try {
					x = stack.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			case 4: // 덤프
				stack.dump();
				break;

			case 5: // 검색
				System.out.print("검색할 데이터: ");
				search = sc.nextInt();
				try {

					x = stack.indexOf(search);
					if (x == -1)
						System.out.println("검색하려는 데이터가 없습니다.");
					else
						System.out.println("검색한 데이터는 " + x + "번 인덱스에 있습니다.");

				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			case 6: // 스택 초기화
				try {
					stack.clear();
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
			case 7: // 스택이 비어있는지 여부
				value = stack.isEmpty();
				System.out.println(value);
				break;

			case 8: // 스택이 가득찼는지 여부
				value = stack.isFull();
				System.out.println(value);
				break;

			}
		}

	}

}

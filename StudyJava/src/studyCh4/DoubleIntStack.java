package studyCh4;

import java.util.Scanner;

/*
 * 연습문제 4-3 -> 하나의 배열을 공유하여 2개의 스택을 구현하는 int형 데이터용 스택 클래스 생성
 * 
 */

public class DoubleIntStack {

	private int max;
	private int ptr1;
	private int ptr2;
	private int[] stk;

	// enum : 열거형 사용방법 찾아보고 익히기

	public enum WhichStack {
		stack1, stack2
	}

	// 실행 시 예외 -> 빈 스택
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
		}
	}

	// 실행 시 예외 -> 가득 찬 스택
	public class OverflowIntStackException extends RuntimeException {
		public OverflowIntStackException() {
		}
	}

	public DoubleIntStack(int capacity) {

		ptr1 = 0;
		ptr2 = capacity - 1;
		max = capacity;

		try {
			stk = new int[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}

	}

	public int push(WhichStack stack, int x) throws OverflowIntStackException {
		if (ptr1 >= ptr2 + 1)
			throw new OverflowIntStackException();

		switch (stack) {
		case stack1:
			return stk[ptr1++] = x;
		default:
			return stk[ptr2--] = x;

		}
	}

	public int pop(WhichStack stack) throws EmptyIntStackException {
		switch (stack) {
		case stack1:
			if (ptr1 <= 0)
				throw new EmptyIntStackException();
			return stk[--ptr1];
		default:
			if (ptr2 >= max - 1)
				throw new EmptyIntStackException();
			return stk[++ptr2];
		}
	}

	public int peek(WhichStack stack) throws EmptyIntStackException {
		switch (stack) {
		case stack1:
			if (ptr1 == 0)
				throw new EmptyIntStackException();
			return stk[ptr1 - 1];
		default:
			if (ptr2 == max - 1)
				throw new EmptyIntStackException();
			return stk[ptr2 + 1];
		}
	}

	public int indexOf(WhichStack stack, int key) {
		switch (stack) {
		case stack1:
			for (int i = ptr1 - 1; i >= 0; i--) {
				if (stk[i] == key)
					return i;
			}

			break;
		default:
			for (int i = ptr2 + 1; i <= max - 1; i++) {
				if (stk[i] == key)
					return i;
			}

			break;

		}
		return -1;
	}

	public void clear(WhichStack stack) {
		switch (stack) {

		case stack1:
			ptr1 = 0;
			break;
		default:
			ptr2 = max - 1;

		}

	}

	public int capacity() {
		return max;
	}

	public int size(WhichStack stack) {
		switch (stack) {
		case stack1:
			return ptr1;
		default:
			return max - ptr2 - 1;
		}
	}

	public boolean isEmpty(WhichStack stack) {

		switch (stack) {
		case stack1:
			return ptr1 <= 0;
		default:
			return ptr2 >= max - 1;
		}
	}

	public boolean isFull(WhichStack stack) {
		return ptr1 >= ptr2 + 1;
	}

	public void dump(WhichStack stack) {
		switch (stack) {
		case stack1:
			if (ptr1 <= 0)
				System.out.println("스택이 비었습니다.");
			else {
				for (int i = 0; i < ptr1; i++)
					System.out.print(stk[i] + " ");
				System.out.println();
			}
			break;
		default:
			if (ptr2 >= max)
				System.out.println("스택이 비었습니다.");
			else {
				for (int i = max - 1; i > ptr2; i--)
					System.out.print(stk[i] + " ");
				System.out.println();
			}
			break;
		}
	}

	// 확인
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoubleIntStack stack = new DoubleIntStack(10);

		while (true) {
			System.out.println("현재 stack1 데이터 수: " + stack.size(WhichStack.stack1) + " / " + stack.capacity());
			System.out.println("현재 stack2 데이터 수: " + stack.size(WhichStack.stack2) + " / " + stack.capacity());

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
					stack.push(WhichStack.stack1, x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;

			case 2: // 팝
				try {
					x = stack.pop(WhichStack.stack1);
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			case 3: // 피크
				try {
					x = stack.peek(WhichStack.stack1);
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;

			case 4: // 덤프
				stack.dump(WhichStack.stack1);
				break;

			case 5: // 검색
				System.out.print("검색할 데이터: ");
				search = sc.nextInt();
				try {

					x = stack.indexOf(WhichStack.stack1, search);
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
					stack.clear(WhichStack.stack1);
				} catch (IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
			case 7: // 스택이 비어있는지 여부
				value = stack.isEmpty(WhichStack.stack1);
				System.out.println(value);
				break;

			case 8: // 스택이 가득찼는지 여부
				value = stack.isFull(WhichStack.stack1);
				System.out.println(value);
				break;

			}
		}

	}

}

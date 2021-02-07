package studyCh4;

import studyCh4.IntStack.EmptyIntStackException;
import studyCh4.IntStack.OverflowIntStackException;

/*
 * 연습문제 4-2 -> 제너릭 스택 클래스 생성
 * 
 */

public class Gstack<E> {

	private int max;
	private int ptr;
	private E[] stk;

	// 실행 시 예외 -> 빈 스택 -> 제네릭 클래스는 Throwable 객체 상속 x
	public static class EmptyGStackException extends RuntimeException {
		public EmptyGStackException() {
		}
	}

	// 실행 시 예외 -> 가득 찬 스택
	public static class OverflowGStackException extends RuntimeException {
		public OverflowGStackException() {
		}
	}

	public Gstack(int capacity) {

		ptr = 0;
		max = capacity;
		try {
			stk = (E[]) new Object[max];
		} catch (OutOfMemoryError e) {
			max = 0;
		}

	}

	// 스택에 x를 푸시
	public E push(E x) throws OverflowIntStackException {
		if (ptr >= max)
			throw new OverflowGStackException();
		return stk[ptr++] = x;
	}

	// 스택에서 데이터를 팝
	public E pop() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyGStackException();
		return stk[--ptr];
	}

	// 스택에서 데이터를 피크 -> top에 있는 데이터 들여다봄
	public E peek() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyGStackException();
		return stk[ptr - 1];

	}

	public int indexOf(E x) {
		for (int i = ptr - 1; i >= 0; i--) // 선형검색은 꼭대기에서 아래로
			if (stk[i] == x)
				return i;
		return -1;

	}

	// 스택을 비움
	public void clear() {
		ptr = 0;
	}

	// 스택의 용량을 확인
	public int capacity() {
		return max;
	}

	// 스택에 쌓여 있는 데이터 수를 반환
	public int size() {
		return ptr;
	}

	// 스택이 비어있는가?

	public boolean isEmpty() {
		return ptr <= 0;
	}

	// 스택이 가득 찼는가?
	public boolean isFull() {
		return ptr >= max;
	}

	// 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump() {

		if (ptr <= 0)
			System.out.println("Stack is Empty");
		else {
			for (int i = 0; i < ptr; i++)
				System.out.print(stk[i] + " ");
			System.out.println();
		}

	}

}

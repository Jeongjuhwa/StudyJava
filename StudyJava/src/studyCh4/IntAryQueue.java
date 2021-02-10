package studyCh4;

/*
 * 연습문제 4-4 -> 배열로 que 구현
 * 
 */

public class IntAryQueue {

	private int max; // 용량
	private int num; // 데이터 수
	private int[] que; // 큐 본체

	// 실행 시 예외 -> 빈 큐
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}
	}

	// 실행 시 예외 -> 가득 찬 큐
	public class OverflowIntQueueException extends RuntimeException {
		public OverflowIntQueueException() {
		}
	}

	public IntAryQueue(int capacity) {

		this.max = capacity;
		this.num = 0;
		try {
			que = new int[max]; // 큐 본체용 배열 생성
		} catch (OutOfMemoryError e) { // 예외처리 -> 생성 x
			max = 0;
		}
	}

	public int enque(int x) throws OverflowIntQueueException {
		if (num >= max)
			throw new OverflowIntQueueException();

		que[num++] = x;

		return x;

	}

	public int deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();

		int x = que[0];

		for (int i = 0; i < num; i++) {
			que[i] = que[i + 1];
		}
		num--;

		return x;
	}

	public int peek() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();

		return que[0];

	}

	public int indexOf(int x) {

		for (int i = 0; i < num; i++) {
			if (que[i] == x)
				return i;
		}
		return -1;

	}

	public void clear() {
		num = 0;
	}

	public int capacity() {
		return max;
	}

	public int size() {
		return num;
	}

	public boolean isEmpty() {
		return num <= 0;
	}

	public boolean isFull() {
		return num >= max;
	}

	public void dump() {

		if (num <= 0)
			System.out.println("큐가 비었습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[i] + " ");
			System.out.println();
		}

	}

}

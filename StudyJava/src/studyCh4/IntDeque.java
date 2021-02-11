package studyCh4;

import studyCh4.IntQueue.EmptyIntQueueException;

/*
 * 연습문제 4-7 -> 양방향 큐. 덱이라 함.
 * 
 */

public class IntDeque {

	private int max;
	private int num;
	private int front;
	private int rear;
	private int[] que;

	public IntDeque(int capacity) {

		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max]; // 덱(deck)본체용 배열을 생성
		} catch (OutOfMemoryError e) { // 생성할 수 없습니다
			max = 0;
		}
	}

	public class OverflowIntDequeueException extends RuntimeException {
		public OverflowIntDequeueException() {
		}
	}

	public class EmptyIntDequeueException extends RuntimeException {
		public EmptyIntDequeueException() {
		}
	}

	public int enqueFront(int x) throws OverflowIntDequeueException {

		if (num >= max)
			throw new OverflowIntDequeueException();

		num++;

		if (--front < 0)
			front = max - 1;

		que[front] = x;

		return x;

	}

	public int enqueRear(int x) throws EmptyIntDequeueException {
		if (num >= max)
			throw new OverflowIntDequeueException();

		que[rear++] = x;
		num++;

		if (rear == max)
			rear = 0;

		return x;
	}

	public int dequeFront() throws EmptyIntDequeueException {

		if (num <= 0)
			throw new EmptyIntDequeueException();

		int x = que[front++];
		num--;
		if (front == max)
			front = 0;
		return x;

	}

	public int dequeRear() throws EmptyIntDequeueException {

		if (num <= 0)
			throw new EmptyIntDequeueException();

		num--;
		if (--rear < 0)
			rear = max - 1;
		return que[rear];

	}

	public int peekFront() throws EmptyIntDequeueException {

		if (num <= 0)
			throw new EmptyIntDequeueException();

		return que[front];

	}

	public int peekRear() throws EmptyIntDequeueException {
		if (num <= 0)
			throw new EmptyIntDequeueException();

		return que[rear == 0 ? max - 1 : rear - 1];

	}

	public int indexOf(int x) {

		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (que[idx] == x)
				return idx;
		}
		return -1;

	}

	// 큐를 비움
	public void clear() {
		num = front = rear = 0;

	}

	// 큐의 용량을 반환
	public int capacity() {
		return max;

	}

	// 큐의 데이터 수 반환
	public int size() {
		return num;
	}

	// 큐가 비어있는가?
	public boolean isEmpty() {
		return num <= 0;
	}

	// 큐가 가득찼는가?
	public boolean isFull() {
		return num >= max;
	}

	// 큐 안의 모든데이터를 프런트 -> 리어 순으로 출력
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비었습니다.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i + front) % max] + " ");
			System.out.println();
		}
	}

	

	public int search(int x) {
		int cnt = 0;
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			cnt++;
			if (que[idx] == x)
				return cnt;
		}

		return 0;

	}

}

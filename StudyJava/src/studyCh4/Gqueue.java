package studyCh4;

/*
 * 연습문제 4-6 -> 제너릭 큐 클래스 만들기
 * 
 */

public class Gqueue<E> {

	private int max;
	private int num;
	private int front;
	private int rear;
	private E[] que;

	// 실행 시 예외 -> 빈 스택 -> 제네릭 클래스는 Throwable 객체 상속 x
	public static class EmptyGqueueException extends RuntimeException {
		public EmptyGqueueException() {
		}
	}

	// 실행 시 예외 -> 가득 찬 스택
	public static class OverflowGqueueException extends RuntimeException {
		public OverflowGqueueException() {
		}
	}

	public Gqueue(int capacity) {

		this.max = capacity;
		this.num = front = rear = 0;
		try {
			que = (E[]) new Object[max]; // 큐 본체용 배열 생성
		} catch (OutOfMemoryError e) { // 예외처리 -> 생성 x
			max = 0;
		}
	}

	public E enque(E x) throws OverflowGqueueException {
		if (num >= max)
			throw new OverflowGqueueException();

		que[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;

	}

	public E deque() throws EmptyGqueueException {
		if (num <= 0)
			throw new EmptyGqueueException();

		E x = que[front++];
		num--;
		if (front == max)
			front = 0;
		return x;

	}

	public E peek() throws EmptyGqueueException {

		if (num <= 0)
			throw new EmptyGqueueException();

		return que[front];

	}

	// 큐에서 x를 검색하여 인덱스 리턴 ( 없으면 -1 리턴)

	public int indexOf(E x) {

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

	public int search(E x) {
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

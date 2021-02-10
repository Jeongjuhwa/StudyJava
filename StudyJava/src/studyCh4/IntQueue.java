package studyCh4;

/*
 * 실습 4-3[A] -> 링 버퍼로 que 구현
 * 
 */

public class IntQueue {

	private int max; // 큐의 용량
	private int num; // 현재 데이터 수
	private int[] que; // 큐 본체
	private int front; // 첫 번째 요소 커서
	private int rear; // 마지막 요소 커서

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

	public IntQueue(int capacity) {

		this.max = capacity;
		this.num = front = rear = 0;
		try {
			que = new int[max]; // 큐 본체용 배열 생성
		} catch (OutOfMemoryError e) { // 예외처리 -> 생성 x
			max = 0;
		}
	}

	/*
	 * 실습 4-3[B] -> 큐에 데이터 삽입
	 * 
	 */

	public int enque(int x) throws OverflowIntQueueException {
		if (num >= max)
			throw new OverflowIntQueueException();

		que[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;

	}

	/*
	 * 실습 4-3[C] -> 큐에서 데이터 꺼내기
	 * 
	 */
	public int deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();

		int x = que[front++];
		num--;
		if (front == max)
			front = 0;
		return x;

	}

	/*
	 * 실습 4-3[D] -> 큐에서 데이터를 피크(들려다 봄)
	 * 
	 */

	public int peek() throws EmptyIntQueueException {

		if (num <= 0)
			throw new EmptyIntQueueException();

		return que[front];

	}

	// 큐에서 x를 검색하여 인덱스 리턴 ( 없으면 -1 리턴)

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

}

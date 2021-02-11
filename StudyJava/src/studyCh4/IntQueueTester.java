package studyCh4;

import java.util.Scanner;

/*
 * 실습 4-4 -> 링 버퍼로 que 구현사용
 * 
 */

public class IntQueueTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		IntQueue que = new IntQueue(64);

		while (true) {

			System.out.println("현재 데이터 수: " + que.size() + " / " + que.capacity());

			System.out.print("(1)인큐 (2)디큐 (3)피크 (4)덤프 (5)검색 (0)종료:");
			int menu = sc.nextInt();

			if (menu == 0)
				break;

			int x;
			switch (menu) {
			case 1:
				System.out.print("데이터: ");
				x = sc.nextInt();

				try {
					que.enque(x);
				} catch (IntQueue.OverflowIntQueueException e) {
					System.out.println("큐가 가득찼습니다.");
				}
				break;

			case 2:
				try {
					x = que.deque();
					System.out.println("디큐한 데이터: " + x);
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비었습니다.");
				}
				break;

			case 3:
				try {
					x = que.peek();
					System.out.println("피크한 데이터: " + x);
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("큐가 비었습니다.");
				}
				break;

			case 4:
				que.dump();
				break;

			case 5:

				System.out.print("찾을 데이터: ");
				x = sc.nextInt();

				int order = que.search(x);

				if (order == 0) {
					System.out.println("찾으시는 데이터가 없습니다.");
				} else {
					System.out.println(order + "번째에 있습니다.");
				}

			}

		}

	}

}

package studyCh3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PhysExamSearch {

	/*
	 * 실습 3-8
	 * 
	 */

	static class PhyscData {
		private String name;
		private int height;
		private double vision;

		// 생성자
		public PhyscData(String name, int height, double vision) {

			this.name = name;
			this.height = height;
			this.vision = vision;
		}

		// 문자열을 반환하는 메서드(정보 확인용)
		@Override
		public String toString() {
			return name + " " + height + " " + vision;
		}

		// 오름차순으로 정렬하기 위한 comparator
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

		private static class HeightOrderComparator implements Comparator<PhyscData> {

			@Override
			public int compare(PhyscData d1, PhyscData d2) {

				return d1.height > d2.height ? 1 : d1.height < d2.height ? -1 : 0;
			}

		}
		
		/*
		 * 연습문제 3-7 -> 시력 오름차순
		 * 
		 */

		// 오름차순으로 정렬하기 위한 comparator
		public static final Comparator<PhyscData> VISION_ORDER = new VisionOrderComparator();

		private static class VisionOrderComparator implements Comparator<PhyscData> {

			@Override
			public int compare(PhyscData d1, PhyscData d2) {

				return d1.vision > d2.vision ? 1 : d1.vision < d2.vision ? -1 : 0;
			}

		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		PhyscData[] x = {

				new PhyscData("이경준", 166, 1.0), new PhyscData("박뫼름", 167, 0.4), new PhyscData("고정민", 170, 1.5),
				new PhyscData("조현호", 174, 1.5), new PhyscData("정주화", 176, 0.2), new PhyscData("손혁진", 183, 0.1),

		};

		System.out.print("검색할 키: ");
		int height = sc.nextInt();

		int idx = Arrays.binarySearch(x, // 배열 x에서
				new PhyscData("", height, 0.0), // 키가 height인 요소를
				PhyscData.HEIGHT_ORDER // 정의한 오름차순에 의해 검색
		);

		if (idx < 0)
			System.out.println("요소가 없습니다.");
		else {
			System.out.println("x[" + idx + "]에 있습니다.");
			System.out.println("찾은 데이터:" + x[idx]);
		}

	}

}

package studyCh2;

public class PhysicalExamination {

	/*
	 * 실습 2-14
	 * 
	 */

	static final int VMAX = 21; // 시력 분포

	static class PhyscData {

		String name;
		int height;
		double vision;

		// 생성자
		PhyscData(String name, int height, double vision) {

			this.name = name;
			this.height = height;
			this.vision = vision;
		}

	}

	static double aveHeight(PhyscData[] dat) {
		double sum = 0;

		for (int i = 0; i < dat.length; i++)
			sum += dat[i].height;

		return sum / dat.length;

	}

	static void distVision(PhyscData[] dat, int[] dist) {
		int i = 0;

		dist[i] = 0;

		for (i = 0; i < dat.length; i++)
			if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
				dist[(int) (dat[i].vision * 10)]++;
	}

	public static void main(String[] args) {

		PhyscData[] x = {

				new PhyscData("고정민", 170, 1.5), new PhyscData("조현호", 174, 1.5), new PhyscData("이경준", 166, 1.0),
				new PhyscData("정주화", 176, 0.2), new PhyscData("박뫼름", 166, 0.4), new PhyscData("손혁진", 183, 0.1),

		};

		int[] vdist = new int[VMAX];
		String[] vdist2 = new String[VMAX];

		System.out.println("==신체검사 리스트==");
		System.out.println("이름       키   시력");
		System.out.println("---------------------");
		for (int i = 0; i < x.length; i++)
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);

		System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));

		distVision2(x, vdist2);

//		System.out.println("\n시력 분포");
//		for (int i = 0; i < VMAX; i++)
//			System.out.printf("%3.1f~:%2d명\n", i / 10.0, vdist[i]);

		System.out.println("\n시력 분포");
		for (int i = 0; i < VMAX; i++)
			System.out.printf("%3.1f~:%2s\n", i / 10.0, vdist2[i]);

	}

	/*
	 * 연습문제 2-10
	 * 
	 * 
	 */
	static void distVision2(PhyscData[] dat, String[] dist) {
		int i = 0;

		for (i = 0; i < dist.length; i++)
			dist[i] = " ";

		for (i = 0; i < dat.length; i++)
			if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
				dist[(int) (dat[i].vision * 10)] += "*";
	}

}

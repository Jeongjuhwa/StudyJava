package studyCh2;

public class YMDExamination {

	public static void main(String[] args) {

		YMD ymd = new YMD(2020, 01, 31);

		System.out.println(ymd.after(20));
		System.out.println(ymd.before(30));

	}
}

/*
 * 연습문제 2-11
 * 
 * 
 */

class YMD {

	int y;
	int m;
	int d;

	public int isLeap(int year) {

		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;

	}

	int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } // 윤년

	};

	// toString 오버라이드 -> 날짜포맷 변경
	@Override
	public String toString() {

		return String.format("%d-%d-%d", y, m, d);
	}

	// 생성자
	public YMD(int y, int m, int d) {

		this.y = y;
		this.m = m;
		this.d = d;
	}

	public YMD before(int n) {

		YMD ymd = new YMD(y, m, d);

		ymd.d -= n;

		while (ymd.d < 1) {
			ymd.d += mdays[isLeap(ymd.y)][ymd.m - 1];
			// ymd.m--;
			if (--ymd.m == 0) {
				ymd.y--;
				ymd.m = 12;
			}
		}

		return ymd;

	}

	public YMD after(int n) {

		YMD ymd = new YMD(y, m, d);
		ymd.d += n;

		while (ymd.d > mdays[isLeap(y)][ymd.m - 1]) {
			ymd.d -= mdays[isLeap(y)][ymd.m - 1];
			// ymd.m++;

			if (++ymd.m == 13) {
				ymd.y++;
				ymd.m = 1;
			}
		}

		return ymd;

	}

}

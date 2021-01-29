package studyCh2;

public class Int20Array {

	/*
	 * 실습 2-12
	 * 
	 */

	public static void main(String[] args) {

		int[][] x = new int[2][4];

		x[0][1] = 37;
		x[0][3] = 54;
		x[1][2] = 65;

		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 4; j++)
				System.out.println("x[" + i + "][" + j + "] : " + x[i][j]);

	}

}

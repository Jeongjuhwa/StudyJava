package studyCh2;

public class CloneArray {

	/*
	 * 실습 2-1
	 * 
	 */

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = a.clone();

		System.out.print("a= ");
		for (int i = 0; i < a.length; i++)
			System.out.print(" " + a[i]);

		System.out.print("\nb= ");
		for (int i = 0; i < b.length; i++)
			System.out.print(" " + b[i]);
	}

}

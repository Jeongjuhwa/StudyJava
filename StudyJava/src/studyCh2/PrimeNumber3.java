package studyCh2;

public class PrimeNumber3 {
	/*
	 * 실습 2-11
	 * 
	 */

	public static void main(String[] args) {

		int counter = 0;
		int ptr = 0;
		int[] prime = new int[500];

		prime[ptr++] = 2;
		prime[ptr++] = 3;

		for (int n = 5; n <= 1000; n += 2) {
			boolean flag = false;

			for (int i = 1; prime[i] * prime[i] <= n; i++) {
				counter += 2;
				if (n % prime[i] == 0) {
					flag = true;
					break;
				}
			}

			if (!flag) {
				prime[ptr++] = n;
				counter++;
			}
		}

		for (int i = 0; i < ptr; i++)
			System.out.println(prime[i]);

		System.out.println("나눈 횟수: " + counter);

	}

}

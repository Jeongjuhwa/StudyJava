
package studyCh3;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {

	/*
	 * 실습 3-6
	 * 
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] x = {

				"apple", "banana", "cloud", "define", "element", "focus", "generic", "height"

		};

		System.out.print("원하는 키워드를 입력하세요: ");
		String key = sc.next();

		int idx = Arrays.binarySearch(x, key);

		if (idx < 0)
			System.out.println("해당 키워드가 없습니다.");
		else
			System.out.println(key + "는 x[" + idx + "]에 있습니다.");
	}

}

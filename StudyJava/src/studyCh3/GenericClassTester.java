package studyCh3;

public class GenericClassTester {

	/*
	 * 실습 3C-3
	 * 
	 */

	static class GenericClass<T> {
		private T xyz;

		// 생성자
		public GenericClass(T t) {

			this.xyz = t;
		}

		T getXyz() {
			return xyz;
		}

	}

	public static void main(String[] args) {

		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> n = new GenericClass<Integer>(15);

		System.out.println(s.getXyz());
		System.out.println(n.getXyz());

	}

}

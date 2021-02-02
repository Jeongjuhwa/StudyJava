package studyCh3;

/*
 * 실습 3C-2 -> 자연정렬을 위한 정의
 * 
 */

class A implements Comparable<A> {

	@Override
	public int compareTo(A c) {
		return 0; // 오류 제거를 위한 임시 return

		// this가 c보다 크면 양의 값 반환
		// this가 c보다 작으면 음의 값 변환
		// this가 c와 같으면 0 반환

	}

	public boolean equals(Object c) {
		// this가 c와 깉으면 true 반환
		// this가 c와 같지 않으면 false 반환
		return true;
	}

}

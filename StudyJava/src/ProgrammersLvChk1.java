
public class ProgrammersLvChk1 {
	
	
	/*
	 * 프로그래머스 실력체크 LV1
	 * 
	 */


	class Solution {
		public int solution(int n) {
			int answer = 0;

			for (int i = 1; i <= n; i++) {
				if (n % i == 0) {
					answer += i;
				}

			}

			return answer;
		}
	}

	class Solution2 {
		public String solution(String phone_number) {
			String answer = "";

			char[] phoneNum = phone_number.toCharArray();

			for (int idx = 0; idx < phoneNum.length - 4; idx++) {
				phoneNum[idx] = '*';

			}

			answer = String.valueOf(phoneNum);

			return answer;
		}
	}

}

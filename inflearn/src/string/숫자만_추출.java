/*
	문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다.
	만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
	추출하여 만들어지는 자연수는 100,000,000을 넘지 않습니다.
	
	입력 : g0en2T0s8eSoft
	출력 : 208
 */

package string;

import java.util.Scanner;

public class 숫자만_추출 {

	public int solution(String str) {
		int answer = 0;
		
		for(char x : str.toCharArray()) {
			if(x>=48 && x<=57) answer = answer * 10 + (x - 48);
		}
		
		return answer;
	}
	
	public int solution2(String str) {
		int answer = 0;
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) answer += x;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		숫자만_추출 T = new 숫자만_추출();
		
		System.out.println(T.solution2(str));
		

	}

}

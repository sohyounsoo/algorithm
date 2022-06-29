package string;

import java.util.Scanner;

public class 대소문자_변환 {
	public String solution(String str) {
		String answer = "";
		
		for(char x : str.toCharArray()) {
			if(Character.isLowerCase(x)) {
				answer += Character.toUpperCase(x);
			}else {
				answer += Character.toLowerCase(x);
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		대소문자_변환 T = new 대소문자_변환();
//		Scanner kb = new Scanner(System.in);
//		String str = kb.next();
		
		String str = "StuDY";
		System.out.println(T.solution(str));
	}

}

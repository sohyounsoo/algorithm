/*
	알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는
	문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오.
	단 반복횟수가 1인 경우 생략합니다.
	
	입력 : KKHSSSSSSSE
	출력 : K2HS7E
*/

package string;

import java.util.Scanner;

public class 문자열_압축_11 {
	
	public String solution(String str) {
		String answer = "";
		int cnt = 1;
		str += " " ;
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i) == str.charAt(i+1)) cnt++;
			else {
				answer += str.charAt(i);
				if(cnt > 1) answer += String.valueOf(cnt);
				cnt = 1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		문자열_압축_11 T = new 문자열_압축_11();
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.solution(str));
	}

}

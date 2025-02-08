package string;

import java.util.Scanner;

/*
	앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
	문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
	단 회문을 검사할 때 대소문자를 구분하지 않습니다.

	예시: gooG
*/

public class 회문_문자열 {

	public String solution(String str) {
		String answer = "";
		
		str = str.toUpperCase();
		
		int lt = 0, rt = str.length() - 1;
		
		while(lt < rt) {
			if(str.charAt(lt) == str.charAt(rt)) {
				lt++;
				rt--;
			}else {
				return "NO";
			}
		}
		return "YES";
	}
	
	public String solution2(String str) {
		str = str.toUpperCase();
		
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(i) == str.charAt(str.length()-1-i)) {
				return "YES";
			}else {
				return "NO";
			}
		}
		return "NO";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); //gooG
		
		회문_문자열  T = new 회문_문자열();
		System.out.println(T.solution2(str));
	}
}

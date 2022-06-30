package string;

import java.util.Scanner;

public class 중복문자제거 {
	
	public String solution(String str) {
		String answer = "";
		int cnt = 0;
		
		for(int i=0; i<str.length(); i++) {
			//System.out.println(str.charAt(i)+" " + i + " " + str.indexOf(str.charAt(i)));
			if(i == str.indexOf(str.charAt(i))) {
				answer += str.charAt(i);
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // ksekkset
		중복문자제거 T = new 중복문자제거();
		
		System.out.print(T.solution(str));
	}

}

/*
	한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
	입력 : teachermode e
	출력 : 1 0 1 2 1 0 1 2 2 1 0
 */

package string;

import java.util.Scanner;

public class 문자거리_10 {

	public int[] solution(String s, char t) {
		int[] answer = new int[s.length()];
		int p = 1000;
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == t) {
				p = 0;
				answer[i] = p;
			}else {
				p += 1;
				answer[i] = p;
			}
		}
		
		p = 1000;
		for(int i=s.length() - 1; i>=0; i--) {
			if(s.charAt(i) == t) {
				p = 0;
			}else {
				p += 1;
				if(answer[i] > p) {
					answer[i] = p;
				}
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		문자거리_10 T = new 문자거리_10();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char c = sc.next().charAt(0);
		
		for(int x : T.solution(str, c)) {
			System.out.println(x + " ");
		}
		
	}

}

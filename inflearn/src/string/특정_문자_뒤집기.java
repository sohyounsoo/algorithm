package string;

import java.util.Scanner;

public class 특정_문자_뒤집기 {
	
	public String solution(String str) {
		String answer = "";
		int lt = 0, rt = str.length() - 1;
		char[] s = str.toCharArray();
	
		while(lt < rt) {
			if(!isAlpha(s[lt])) {
				lt++;
			}else if(!isAlpha(s[rt])) {
				rt--;
			}else {
				char temp = s[lt];
				s[lt] = s[rt];
				s[rt] = temp;
				lt++;
				rt--;
			}
		}
		answer = String.valueOf(s);
		return answer;
	}
	
	public static boolean isAlpha(char char1) {
        return (char1 >= 'a' && char1 <= 'z') || (char1 >= 'A' && char1 <= 'Z');
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next(); // a#b!GE*T@S
		특정_문자_뒤집기 T = new 특정_문자_뒤집기();
		
		System.out.println(T.solution(str));
	}

}

package string;

import java.util.Scanner;

public class 문자찾기 {
	public int solution(String str, char t){
		int answer = 0;
    
		// 둘다 대문자로 변환
		str = str.toUpperCase();
		t = Character.toUpperCase(t);
		String tt = String.valueOf(t);
		
		String[] split = str.split("");
    
		for(String s : split) {
			if(s.equals(tt)) answer++;
		}    
		return answer;
}
		  
	public static void main(String[] args) {
		문자찾기 T = new 문자찾기();
		Scanner kb = new Scanner(System.in);
    
//		String str = kb.next();
//		char c = kb.next().charAt(0);

		String str = "Computercooler";
		char c = 'c';
    
		System.out.print(T.solution(str, c));
	}
}

package string;

import java.util.Scanner;

// 한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.

public class 문장_속_단어 {	
	public String solution(String str) {
		String answer = "";
		int max = 0;
		
		String[] s = str.split(" ");
		
		for(String x : s) {
			int len = x.length();
			if(len > max) {
				max = len;
				answer = x;
			}
		}
		return answer;
	}
	
	public String solution2(String str){
		String answer = "";
		int m = Integer.MIN_VALUE, pos;
		while((pos=str.indexOf(' '))!=-1) {
			String tmp = str.substring(0, pos);
			int len = tmp.length();
			if(len > m) {
				m = len;
				answer = tmp;
			}
			str = str.substring(pos+1);
		}
		if(str.length() > m) answer=str;
		return answer;
	}

	public static void main(String[] args) {
		문장_속_단어 T = new 문장_속_단어();
		Scanner kb = new Scanner(System.in);
		String str = kb.nextLine();
		System.out.print(T.solution(str));
	}
}

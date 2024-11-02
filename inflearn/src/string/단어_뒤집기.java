package string;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어_뒤집기 {

	public static void main(String[] args) {
		단어_뒤집기 T = new 단어_뒤집기();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];

		for(int i=0; i < str.length; i++) {
			str[i] = sc.next();
		}

		for(String x : T.solution2(n, str)) {
			System.out.println(x);
		}

//		for(String x : T.solution3(n, str)) {
//			System.out.println(x);
//		}

	}

	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		for(String x : str) {
			String temp = new StringBuffer(x).reverse().toString();
			answer.add(temp);
		}
		
		return answer;
	}
	
	public ArrayList<String> solution2(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();

		for(int i = 0; i<str.length; i++) {
			char[] s = str[i].toCharArray();
			int len = str[i].length();

			for (int j = 0; j < len / 2; j++) {
				char tmp = s[j];
				s[j] = s[len-j-1];
				s[len-j-1] = tmp;
			}
			answer.add(String.valueOf(s));
		}
		
		return answer;
	}

	// 시간 복잡도 o(n)
	public ArrayList<String> solution3(int n, String[] str) {
		ArrayList<String> answer = new ArrayList<>();
		
		for(String x : str) {
			char[] s = x.toCharArray();
			int lt = 0, rt = x.length() - 1;
			while(lt < rt) {
				char temp = s[lt];
				s[lt] = s[rt];
				s[rt] = temp;
				lt++;
				rt--;
			}
			String temp = String.valueOf(s);
			answer.add(temp);
		}
		return answer;
	}

}

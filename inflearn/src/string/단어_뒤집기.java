package string;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어_뒤집기 {

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
		String tem = "";
		
		for(int i = 0; i<str.length; i++) {
			String[] s = str[i].split("");
			for(int j = s.length - 1; j >= 0; j --) {
				tem += s[j];
			}
			answer.add(tem);
			tem = "";
		}
		
		return answer;
	}
	
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
	
	public static void main(String[] args) {
		단어_뒤집기 T = new 단어_뒤집기();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] str = new String[n];
		
		for(int i=0; i < str.length; i++) {
			str[i] = sc.next();
		}
		
		for(String x : T.solution3(n, str)) {
			System.out.println(x);
		}

	}

}

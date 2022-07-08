/*
입력 :(()(()))(()
출력 : NO
 */

package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거_2 {

	public String solution(String str) {
		String answer = "";
		Stack<Character> st = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(x == '(') st.push(x);
			else if(x == ')') st.pop();
			else if(st.isEmpty()) answer += x;
		}
		return answer;
	}
	
	public String solution2(String str) {
		String answer = "";
		Stack<Character> st = new Stack<>();
		for(char x : str.toCharArray()) {
			if(x == ')') {
				while(st.pop()!='(');
			}
			else st.push(x);
		}
		for(int i=0; i<st.size(); i++) answer += st.get(i);
		
		return answer;
	}

	public static void main(String[] args) {
		괄호문자제거_2 T = new 괄호문자제거_2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(T.solution(str));
	}
}

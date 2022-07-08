/*
입력 :(()(()))(()
출력 : NO
 */

package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호_1 {

	public String solution(String str) {
		String answer = "YES";
		
		Stack<Character> stack = new Stack<>();
		
		for(char x : str.toCharArray()) {
			if(x == '(') stack.push(x);
			else {
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		if(!stack.isEmpty()) return "NO";
		return answer;
	}

	public static void main(String[] args) {
		올바른괄호_1 T = new 올바른괄호_1();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();

		System.out.println(T.solution(str));
	}
}

/*
후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.

입력 : 352+*9-
*/

package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class 후위식_연산_4 {
	public int solution(String str) {
		int answer = 0;
		Stack<Integer> st = new Stack<>();
		for(char x : str.toCharArray()) {
			if(Character.isDigit(x)) st.push(x - 48); // char - 48 = Integer
			else {
				int rt = st.pop();
				int lt = st.pop();
				if(x == '+') st.push(lt + rt);
				else if(x == '-') st.push(lt - rt);
				else if(x == '*') st.push(lt * rt);
				else if(x == '/') st.push(lt / rt);
			}
		}
		answer = st.get(0);
		return answer;
	}

	public static void main(String[] args) {
		후위식_연산_4 T = new 후위식_연산_4();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(T.solution(str));
	}
}

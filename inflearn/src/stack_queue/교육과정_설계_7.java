/*
현수는 1년 과정의 수업계획을 짜야 합니다.
수업중에는 필수과목이 있습니다. 이 필수과목은 반드시 이수해야 하며, 그 순서도 정해져 있습니다.
만약 총 과목이 A, B, C, D, E, F, G가 있고, 여기서 필수과목이 CBA로 주어지면 필수과목은 C, B, A과목이며 이 순서대로 꼭 수업계획을 짜야 합니다.
여기서 순서란 B과목은 C과목을 이수한 후에 들어야 하고, A과목은 C와 B를 이수한 후에 들어야 한다는 것입니다.
현수가 C, B, D, A, G, E로 수업계획을 짜면 제대로 된 설계이지만
C, G, E, A, D, B 순서로 짰다면 잘 못 설계된 수업계획이 됩니다.
수업계획은 그 순서대로 앞에 수업이 이수되면 다음 수업을 시작하다는 것으로 해석합니다.
수업계획서상의 각 과목은 무조건 이수된다고 가정합니다.
필수과목순서가 주어지면 현수가 짠 N개의 수업설계가 잘된 것이면 “YES", 잘못된 것이면 ”NO“를 출력하는 프로그램을 작성하세요.

입력 : CBA
	 CBDAGE
출력 : YES
 */

package stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class 교육과정_설계_7 {
	public String solution(String s1, String s2) {
		String answer = "YES";
		Queue<Character> q = new LinkedList<>();
		
		for(int i=0; i<s1.length(); i++) {
			q.offer(s1.charAt(i));
		}
		for(int i=0; i<s2.length(); i++) {
			if(q.contains(s2.charAt(i))) {
				if(s2.charAt(i)!=q.poll()) return "NO";
			}
		}
		if(!q.isEmpty()) {
			return "NO";
		}
		return answer;
	}

	public static void main(String[] args) {
		교육과정_설계_7 T = new 교육과정_설계_7();
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		
		System.out.println(T.solution(s1, s2));
	}
}

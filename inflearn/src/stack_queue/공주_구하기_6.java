/*
입력 :8 3
출력 : 7
 */

package stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class 공주_구하기_6 {
	public int solution(int n, int k) {
		int answer = 0;
		Queue<Integer> q = new LinkedList<>();
		for(int i=1; i<=n; i++) q.offer(i);
		while(!q.isEmpty()) {
			for(int i=1; i<k; i++) q.offer(q.poll());
			q.poll();
			if(q.size() == 1) answer = q.poll();
		}
		return answer;
	}

	public static void main(String[] args) {
		공주_구하기_6 T = new 공주_구하기_6();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		System.out.println(T.solution(n, k));
	}
}

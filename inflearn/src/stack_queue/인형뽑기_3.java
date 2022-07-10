package stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class 인형뽑기_3 {

	public int solution(int n, int[][] arr, int k, int[] move) {
		int answer = 0;
		Stack<Integer> st = new Stack<>();
		
		int a = 0;
		for(int i=0; i<k; i++) {
			a = move[i];
			for(int j=0; j<n; j++) {
				if(arr[j][a-1] != 0) {
					int tmp = arr[j][a-1];
					arr[j][a-1] = 0;
					if(!st.isEmpty() && tmp == st.peek()) {
						st.pop();
						answer +=2;
					}else {
						st.push(tmp);
					}
					break;
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		인형뽑기_3 T = new 인형뽑기_3();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int k = sc.nextInt();
		int[] move = new int[k];
		for(int i=0; i<k; i++) {
			move[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, arr, k, move));
	}
}

package array;

import java.util.Scanner;

public class 피보나치_수열_4 {

	public int[] solution(int n) {
		int[] answer = new int[n];
		answer[0] = 1;
		answer[1] = 1;

		for(int i=2; i<n; i++) {
			answer[i] = answer[i-2] + answer[i-1];
		}

		return answer;
	}

	public int[] solution2(int n) {
		int[] answer = new int[n];

		for(int i=0; i<n; i++) {
			if(i<=1) answer[i] = 1;
			else answer[i] = answer[i-2] + answer[i-1];
		}

		return answer;
	}
	
	public static void main(String[] args) {
		피보나치_수열_4 T = new 피보나치_수열_4();

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int x : T.solution(n)) {
			System.out.print(x + " ");
		}

		System.out.println();

		for(int x : T.solution2(n)) {
			System.out.print(x + " ");
		}
	}
}

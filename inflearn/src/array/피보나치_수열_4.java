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
	
	public static void main(String[] args) {
		피보나치_수열_4 T = new 피보나치_수열_4();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int x : T.solution(n)) {
			System.out.print(x + " ");
		}
	}
}

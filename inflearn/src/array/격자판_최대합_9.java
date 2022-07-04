package array;

import java.util.Scanner;

public class 격자판_최대합_9 {

	public int solution(int n, int[][] arr) {
		int answer = 0;
		
		return answer;
	}

	public static void main(String[] args) {
		격자판_최대합_9 T = new 격자판_최대합_9();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println(T.solution(n, arr));
	}

}

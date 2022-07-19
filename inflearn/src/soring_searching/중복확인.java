package soring_searching;

import java.util.Arrays;
import java.util.Scanner;

public class 중복확인 {

	public String solution(int n, int[] arr) { // 시간 초과
		String answer = "U";
		
		for(int i=0; i<n-1; i++) {
			for(int j=i+1; j<n; j++) {
				if(arr[i] == arr[j]) answer = "D";
			}
		}
		return answer;
	}
	
	public String solution2(int n, int[] arr) {
		String answer = "U";
		Arrays.sort(arr);
		for(int i=0; i<n-1; i++) {
			if(arr[i] == arr[i+1]) {
				answer = "D";
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		중복확인 T = new 중복확인();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution2(n, arr));	
	}
}

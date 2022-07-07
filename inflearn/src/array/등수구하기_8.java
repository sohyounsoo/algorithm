package array;

import java.util.ArrayList;
import java.util.Scanner;

public class 등수구하기_8 {

	public int[] solution(int n, int[] arr) {
		int[] answer = new int[n];
		
		for(int i=0; i<arr.length; i++) {
			int cnt = 1;
			for(int j=0; j<arr.length; j++) {
				if(arr[j] > arr[i]) cnt++;
			}
			answer[i] = cnt;
		}
		
		return answer;
	}

	public static void main(String[] args) {
		등수구하기_8 T = new 등수구하기_8();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : T.solution(n, arr)) {
			System.out.print(x + " ");
		}
	}
}

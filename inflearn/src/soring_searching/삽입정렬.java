/*
입력 : 6
	 13 5 11 7 23 15
출력 : 5 7 11 13 15 23
*/

package soring_searching;

import java.util.Scanner;

public class 삽입정렬 {

	public int[] solution(int n, int[] arr) {
		for(int i=1; i<n; i++) {
			int tmp = arr[i];
			for(int j=i-1; j>=0; j--) {
				if(arr[j]>tmp) arr[j+1] = arr[j];
			}
		}
		
		return arr;
	}

	public static void main(String[] args) {
		삽입정렬 T = new 삽입정렬();
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

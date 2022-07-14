/*
입력 : 6
	 13 5 11 7 23 15
출력 : 5 7 11 13 15 23
*/

package soring_searching;

import java.util.Scanner;

public class 버블정렬 {

	public int[] solution(int n, int[] arr) {
		
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-i-1; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		버블정렬 T = new 버블정렬();
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

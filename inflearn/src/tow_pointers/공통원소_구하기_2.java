package tow_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class 공통원소_구하기_2 {

	public ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(arr1); 
		Arrays.sort(arr2);
        
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(arr1[i] == arr2[j]) {
					answer.add(arr1[i]);
				}
			}
		}
		
		return answer;
	}
	
	public ArrayList<Integer> solution2(int n, int m, int[] arr1, int[] arr2) {
		ArrayList<Integer> answer = new ArrayList<>();
		Arrays.sort(arr1); 
		Arrays.sort(arr2);
        int p1 = 0, p2 = 0;
        
        while(p1 < n && p2 < m) {
        	if(arr1[p1] == arr2[p2]) {
        		answer.add(arr1[p1]);
        		p1++;
        		p2++;
        	}
        	else if(arr1[p1] < arr2[p2]) p1++;
        	else p2++;
        }
		
		
		return answer;
	}

	public static void main(String[] args) {
		공통원소_구하기_2 T = new 공통원소_구하기_2();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr1 = new int[n];
		for(int i=0; i<n; i++) {
			arr1[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		int[] arr2 = new int[m];
		for(int i=0; i<m; i++) {
			arr2[i] = sc.nextInt();
		}
		
		for(int x : T.solution(n, m, arr1, arr2)) {
			System.out.print(x + " ");
		}
	}
}

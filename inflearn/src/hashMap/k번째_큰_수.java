package hashMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class k번째_큰_수 {

	public int solution(int[] arr, int n, int k) {
		int answer = -1;
		int temp = 0;
		TreeSet<Integer> Test = new TreeSet<>(Collections.reverseOrder());
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				for(int l=j+1; l<n; l++) {
					Test.add(arr[i] +  arr[j] + arr[l]);
				}
			}
		}
		for(int x : Test) {
			temp++;
			if(temp == k) {
				answer = x;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		k번째_큰_수 T = new k번째_큰_수();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(T.solution(arr, n, k));
	}

}

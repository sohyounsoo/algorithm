package array;

import java.util.ArrayList;
import java.util.Scanner;

public class 점수계산_7 {

	public int solution(int n, int[] arr) {
		int answer = 0;
		int t = 1;
		
		if(arr[0] == 1) answer += 1; 
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1] == 1 && arr[i] == 1) {
				t += 1;
				answer += t;
			}else if(arr[i] == 1) {
				answer +=1;
				t = 1;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		점수계산_7 T = new 점수계산_7();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, arr));
	}
}

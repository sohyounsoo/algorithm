/*
입력 : 14 2
	 1 1 0 0 1 1 0 1 1 0 1 1 0 1
출력 : 8
*/

package tow_pointers;

import java.util.Scanner;

public class 최대_길이_연속부분수열_6 {

	public int solution(int n, int k, int[] arr) {
		int answer = 0, lt = 0, cnt = 0;
		
		for(int rt=0; rt<n; rt++) {
			if(arr[rt] == 0) cnt++;
			while(cnt > k) {
				if(arr[lt] == 0) cnt--;
				lt++;
			}
			answer = Math.max(answer, rt - lt + 1);
		}
		
		return answer;
	}

	public static void main(String[] args) {
		최대_길이_연속부분수열_6 T = new 최대_길이_연속부분수열_6();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int k = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, k, arr));
	}
}

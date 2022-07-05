/*
	설명
	N개의 수로 이루어진 수열이 주어집니다.
	이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
	만약 N=8, M=6이고 수열이 다음과 같다면
	1 2 1 3 1 1 1 2
	합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.
	
	입력 :8 6
		1 2 1 3 1 1 1 2
		
	출력 :3
*/

package tow_pointers;

import java.util.Scanner;

public class 연속_부분수열_4 {

	public int solution(int n, int k, int[]arr) { // time 에러
		int answer = 0, lt = 0, sum = 0;
		
		for(int rt=0; rt<n; rt++) {
			sum += arr[rt];
			if(sum == k) answer++;
			while(sum >= k) {
				sum -= arr[lt++];
				if(sum == k) answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		연속_부분수열_4 T = new 연속_부분수열_4();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, k, arr));
	}
}

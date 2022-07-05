/*
N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
만약 N=15이면
7+8=15
4+5+6=15
1+2+3+4+5=15
와 같이 총 3가지의 경우가 존재한다.
입력 : 15
출력 : 3
 */

package tow_pointers;

import java.util.Scanner;

public class 연속된_자연수의_합 {

	public int solution(int n, int k, int[]arr) { // time 에러
		int answer = 0;
		
		return answer;
	}

	public static void main(String[] args) {
		연속된_자연수의_합 T = new 연속된_자연수의_합();
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

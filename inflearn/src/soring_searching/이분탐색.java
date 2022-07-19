/*
임의의 N개의 숫자가 입력으로 주어집니다. N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면
*/

package soring_searching;

import java.util.Arrays;
import java.util.Scanner;

public class 이분탐색 {
	public int solution(int n, int m, int[] arr) {
		int answer = 0;
		Arrays.sort(arr);
		int lt = 0, rt = n-1;
		while(lt<=rt) {
			int mid = (lt+rt)/2;
			if(arr[mid] == m) {
				answer = mid + 1;
				break;
			}
			if(arr[mid] > m) rt = mid - 1;
			else lt = mid + 1;
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		이분탐색 T = new 이분탐색();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(T.solution(n, m, arr));
		
	}

}

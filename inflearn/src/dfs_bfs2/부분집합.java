/*
입력 : 6
1 3 5 6 7 10  

출력 : YES
 */
		
package dfs_bfs2;

import java.util.Scanner;

public class 부분집합 {
	static String answer = "NO";
	static int n;
	static int total = 0;
	static boolean flag = false;
	
	public static void DFS(int L, int sum, int[] arr) {
		if(flag) return; // 값을 찾을 경우 바로 리턴
		if(sum>total/2) return; // 촙합/2 보다 클경우 제외
		if(L==n) {
			if(total-sum == sum) {
				answer = "YES";
				flag = true;
			}
		}else {
			DFS(L+1, sum+arr[L], arr);
			DFS(L+1, sum, arr);
		}
		
	}

	public static void main(String[] args) {
		부분집합 T = new 부분집합();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			total += arr[i];
		}
		DFS(0, 0, arr);
		System.out.println(answer);

	}

}

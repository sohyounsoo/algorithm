/*
이번 정보올림피아드대회에서 좋은 성적을 내기 위하여 현수는 선생님이 주신 N개의 문제를 풀려고 합니다.
각 문제는 그것을 풀었을 때 얻는 점수와 푸는데 걸리는 시간이 주어지게 됩니다.
제한시간 M안에 N개의 문제 중 최대점수를 얻을 수 있도록 해야 합니다.

//5개의 인덱스 배열, 제한시간 20
입력 : 5 20  
10 5
25 12
15 8
6 3
7 4

출력 : 41
 */
		
package dfs_bfs2;

import java.util.Scanner;

public class 최대점수구하기 {
	
	static int answer = 0;
	static int n, m;
	
	public static void DFS(int L, int sum, int time, int[] a, int[] b) {
		if(time > m) return;
		if(L == n) {
			answer = Math.max(answer, sum);
		}else {
			DFS(L+1, sum+a[L], time+b[L], a, b);
			DFS(L+1, sum, time, a, b);
		}
		
	}

	public static void main(String[] args) {
		최대점수구하기 T = new 최대점수구하기();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		int[] a= new int[n];
		int[] b= new int[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		
		DFS(0, 0, 0, a, b);
		
		System.out.println(answer);
	}

}

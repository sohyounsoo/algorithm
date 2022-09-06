/*
 이문제는 사실 레벨 탐색 즉 최단거리는 레벨탐색
 */

package dfs_bfs;

import java.util.Scanner;

public class 경로탐색 { // bfs 레벨탐색
	
	static int n, m, answer = 0;
	static int[][] graph;
	static int[] ch;
	
	public void DFS(int v) {
		if(v==n) answer++;
		else {
			for(int i=1; i<=n; i++) {
				if(graph[v][i] == 1 && ch[i] == 0) {
					ch[i] = 1;
					DFS(i);
					ch[i] = 0; // 백하면 다시 취소
				}
			}
		}
	}

	public static void main(String[] args) {
		경로탐색 T = new 경로탐색();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new int[n+1][n+1];
		ch = new int[n+1]; // 방문 체크
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph[a][b]=1;
		}
		ch[1] = 1;
		T.DFS(1);
	}

}

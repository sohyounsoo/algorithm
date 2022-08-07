/*
 깊이 우선 탐색 dfs,
 재귀함수,
 백트레킹
 */

package dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 송아지_찾기 {
	int answer = 0;
	int[] dis = {1, -1, 5};
	int[] ch;
	Queue<Integer> q = new LinkedList<>();
	public int BFS(int s, int e) {
		ch = new int[10001]; // 크기 최대값
		ch[s] = 1; // 방문 체크 1
		q.offer(s);
		int L = 0; // 레벨 값
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i=0; i<len; i++) {
				int x = q.poll();
				for(int j=0; j<3; j++) {
					int nx = x + dis[j];
					if(nx == e) return L + 1;
					if(nx>=1 && nx<10001 && ch[nx] == 0) {
						ch[nx] = 1;
						q.offer(nx);
					}
				}
			}
			L++;
		}
		return 0;
	}

	public static void main(String[] args) {
		송아지_찾기 T = new 송아지_찾기();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e= sc.nextInt();
		System.out.println(T.BFS(s, e));
	}

}

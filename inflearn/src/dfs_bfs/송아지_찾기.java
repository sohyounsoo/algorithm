/*
현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.
현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
송아지는 움직이지 않고 제자리에 있다.
현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다.

상대트리탐색

첫 번째 줄에 현수의 위치 S와 송아지의 위치 E가 주어진다.
입력: 5, 14
출력: 3

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

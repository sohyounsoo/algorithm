/*
7
1 1 0 0 0 1 0
0 1 1 0 1 1 0
0 1 0 0 0 0 0
0 0 0 1 0 1 1
1 1 0 1 1 0 0
1 0 0 0 1 0 0
1 0 1 0 1 0 0

출력 : 5
*/
		
package dfs_bfs2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class 섬나라_BFS {

	static int n;
	static int[] dx = {-1, 0, 1, 0, 1, 1, -1, -1};
	static int[] dy = {0, 1, 0, -1, -1, 1, -1, 1};
	static int[][] board;
	static int answer = 0;
	static Queue<Point> q = new LinkedList<Point>();
	
	public static void BFS(int x, int y, int[][] board) {
		q.add(new Point(x, y));
		while(!q.isEmpty()) {
			Point tmp = q.poll();
			for(int i=0; i<8; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny] == 1) {
					board[nx][ny] = 0;
					q.offer(new Point(nx, ny));
				}
			}
		}
	}
	
	public static void solution(int[][] board) {
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(board[i][j] == 1) {
					answer++;
					board[i][j] = 0;
					BFS(i, j, board);
				}
			}
		}
	}

	public static void main(String[] args) {
		섬나라_BFS T = new 섬나라_BFS();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		T.solution(arr);
		System.out.println(answer);
		
	}
}

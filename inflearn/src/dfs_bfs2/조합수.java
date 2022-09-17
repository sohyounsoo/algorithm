/*
메모제이션
 입력 : 5,3 출력 : 10
 입력 : 33 19 출력 : 818809200
 
 */
		
package dfs_bfs2;

import java.util.Scanner;

public class 조합수 {
	int[][] dy = new int[35][35];
	
	public int DFS(int n, int r) {
		if(dy[n][r]>0) return dy[n][r];
		if(n==r || r==0) return 1;
		else return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
	}
	
	public static void main(String[] args) {
		조합수 T = new 조합수();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r = sc.nextInt();
		System.out.println(T.DFS(n, r));
	}

}

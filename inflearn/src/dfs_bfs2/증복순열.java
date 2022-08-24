/*
 입력 :3 2
 
 */
		
package dfs_bfs2;

import java.util.Scanner;

public class 증복순열 {
	
	static int[] pm;
	static int n, m;
	
	public static void DFS(int L) {
		if(L == m) {
			for(int x : pm) System.out.print(x + " ");
			System.out.println();
		}else {
			for(int i=1; i<=n; i++) {
				pm[L] = i;
				DFS(L+1);
			}
		}
	}
	
	// for형태
	public static void For() {
		for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				System.out.println(i + " " +j);
			}
		}
	}

	public static void main(String[] args) {
		증복순열 T = new 증복순열();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		pm = new int[m];
		T.DFS(0);
		System.out.println();
		T.For();
	}

}

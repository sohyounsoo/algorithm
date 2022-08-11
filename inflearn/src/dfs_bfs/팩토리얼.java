/*
입력: 5
출력: 120
 */

package dfs_bfs;

public class 팩토리얼 {

	public int DFS(int n) {
		if(n == 0) return 1;
		else return n * DFS(n-1);
	}
	
	public static void main(String[] args) {
		팩토리얼 T = new 팩토리얼();
		
		System.out.println(T.DFS(5));
	}

}

/*
재쉬 함수 이진수

입력: 11
출력: 1011
 */

package dfs_bfs;

public class 재귀함수2 {

	public void DFS(int n) {
		if(n == 0) return;
		else {
			
			int tmp = n % 2;
			System.out.println(tmp);
			DFS(n / 2);
		}
	}
	
	public void solution(int n) {
		DFS(n);
	}
	
	public static void main(String[] args) {
		재귀함수2 T = new 재귀함수2();
		T.solution(11);
	}

}

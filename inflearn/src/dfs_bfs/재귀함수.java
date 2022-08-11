package dfs_bfs;

public class 재귀함수 {

	public void DFS(int n) {
		if(n == 0) return;
		else {
			DFS(n - 1);
			System.out.print(n + " ");
		}
	}
	
	public void solution(int n) {
		DFS(n);
	}
	
	public static void main(String[] args) {
		재귀함수 T = new 재귀함수();
		T.solution(3);
	}

}

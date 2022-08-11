/*
입력: 5
출력: 120
 */

package dfs_bfs;

public class 피보나치_수열 {

	public int DFS(int n) {
		if(n==1) return 1;
		else if(n==2) return 1;
		else return DFS(n-2) + DFS(n-1);
	}
	
	public int[] DFS2(int n) {
		int[] answer = new int[n];
		
		answer[0] = 1;
		answer[1] = 1;
		for(int i=0; i<n-2; i++) {
			answer[i+2] = answer[i] + answer[i+1];
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		피보나치_수열 T = new 피보나치_수열();
		int n = 7;
		//System.out.println(T.DFS(n));
		for(int x : T.DFS2(n)) {
			System.out.print(x + " ");
		}
	}

}

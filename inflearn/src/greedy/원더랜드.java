/*
입력:
9 12
1 2 12
1 9 25
2 3 10
2 8 17
2 9 8
3 4 18
3 7 55
4 5 44
5 6 60
5 7 38
7 8 35
8 9 15

출력:
196
 */

package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge2 implements Comparable<Edge2> {
	public int v1;
	public int v2;
	public int cost;
	Edge2(int v1, int v2, int cost) {
		this.v1 = v1;
		this.v2 = v2;
		this.cost = cost;
	}
	@Override
	public int compareTo(Edge2 ob) {
		return this.cost - ob.cost;
	}
}

public class 원더랜드 {

	static int[] unf;
	static int answer;
	
	public static int Find(int v) {
		if(v == unf[v]) return v;
		else return unf[v] = Find(unf[v]);
	}
	
	public static void Union(int a, int b) {
		int fa = Find(a);
		int fb = Find(b);
		if(fa!=fb) unf[fa] = fb;
	}
	
	public static void main(String[] args) {
		원더랜드 T = new 원더랜드();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		unf = new int[n+1];
		ArrayList<Edge2> arr = new ArrayList<>();
		for(int i=1; i<=n; i++) unf[i] = i;
		for(int i=0; i<m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			int cost = sc.nextInt();
			arr.add(new Edge2(v1, v2, cost));
		}
		
		answer = 0;
		int cnt = 0;
		Collections.sort(arr);
		for(Edge2 ob : arr) {
			if(cnt == n-1) break;
				int fv1 = Find(ob.v1);
				int fv2 = Find(ob.v2);
				if(fv1 != fv2) {
					answer += ob.cost;
					Union(ob.v1, ob.v2);
					cnt++; // 간선개수
				}
			
		}
		
		System.out.println(answer);

	}

}

/*
입력 : 
9 7
1 2
2 3
3 4
1 5
6 7
7 8
8 9
3 8

출력: 
NO
*/

package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 친구인가 {
	
	static int[] unf;
	
	private static int Find(int v) {
		if(v == unf[v]) return v;
		else return unf[v] = Find(unf[v]); // 경로 압축
	}
	
	public static void Union(int a, int b) {
		int fa = Find(a);
		int fb = Find(b);
		if(fa != fb) unf[fa] = fb; 
	}
	
	public static void main(String[] args) {
		친구인가 T = new 친구인가();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		unf = new int[n+1]; // 0번인덱스는 미사용
		for(int i=1; i<=n; i++) unf[i] = i;
		for(int j=1; j<=m; j++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			Union(a,b);
		}
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int fa = Find(a);
		int fb = Find(b);
		if(fa==fb) System.out.println("YES");
		else System.out.println("NO");
		

	}

	

}

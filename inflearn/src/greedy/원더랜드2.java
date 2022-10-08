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
import java.util.PriorityQueue;
import java.util.Scanner;

class Edge3 implements Comparable<Edge3> {
	public int vex;
	public int cost;
	Edge3(int vex, int cost) {
		this.vex = vex;
		this.cost = cost;
	}
	@Override
	public int compareTo(Edge3 ob) {
		return this.cost - ob.cost; // 오름차순
	}
}

public class 원더랜드2 { // 프림방식
	
	public static void main(String[] args) {
		원더랜드2 T = new 원더랜드2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		ArrayList<ArrayList<Edge3>> graph = new ArrayList<>();
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Edge3>());
		}
		int[] ch = new int[n+1];
		for(int i=0; i<m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			graph.get(a).add(new Edge3(b, c));
			graph.get(b).add(new Edge3(a, c));
		}
		int answer = 0;
		PriorityQueue<Edge3> pQ = new PriorityQueue<>();
		pQ.offer(new Edge3(1, 0));
		while(!pQ.isEmpty()) {
			Edge3 tmp = pQ.poll();
			int ev = tmp.vex;
			if(ch[ev] == 0) {
				ch[ev] = 1;
				answer += tmp.cost;
				for(Edge3 ob : graph.get(ev)) {
					if(ch[ob.vex] == 0) pQ.offer(new Edge3(ob.vex, ob.cost));
				}
			}
		}
		
		System.out.println(answer);

	}

}

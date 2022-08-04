/*
 깊이 우선 탐색 BFS,
 재귀함수,
 백트레킹
 */

package dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class 이진트리_레벨탐색 {
	Node root;
	public void BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0;
		while(!Q.isEmpty()) {
			int len = Q.size();
			System.out.print(L + " : ");
			for(int i=0; i<len; i++) {
				Node cur = Q.poll();
				System.out.print(cur.data + " ");
				if(cur.lt!=null) Q.offer(cur.lt);
				if(cur.rt!=null) Q.offer(cur.rt);
			}
			L++;
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		이진트리_레벨탐색 tree = new 이진트리_레벨탐색();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.BFS(tree.root);

	}

}

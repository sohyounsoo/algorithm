/*
 이문제는 사실 레벨 탐색 즉 최단거리는 레벨탐색이 맞지만 깊이우선탐색으로 풀어봄
 */

package dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;

public class 말단노드2 {
	Node root;
	public int BFS(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		q.offer(root);
		int L = 0;
		while(!q.isEmpty()) {
			int len = q.size();
			for(int i=0; i<len; i++) {
				Node cur = q.poll();
				if(cur.lt == null && cur.rt == null ) return L;
				if(cur.lt != null) q.offer(cur.lt);
				if(cur.rt != null) q.offer(cur.rt);
			}
			L++;
		}
		return -1;
	}

	public static void main(String[] args) {
		말단노드2 tree= new 말단노드2();
		tree.root = new Node(1); 
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		System.out.println(tree.BFS(tree.root));
	}

}

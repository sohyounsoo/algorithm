/*
 깊이 우선 탐색 dfs,
 재귀함수,
 백트레킹
 */

package dfs_bfs;

class Node {
	int data;
	Node lt, rt;
	public Node(int val) {
		data  = val;
		lt = rt = null;
	}
}

public class 이진트리순회 {
	Node root;
	public void DFS(Node root) {
		if(root == null) return;
		else {
			System.out.print(root.data + " "); // 출력 위치에 따라 전위, 중위, 후위 춣력
			DFS(root.lt);
			DFS(root.rt);
			
		}
	}
	
	public static void main(String[] args) {
		이진트리순회 tree = new 이진트리순회();
		tree.root = new Node(1);
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7);
		tree.DFS(tree.root);

	}

}

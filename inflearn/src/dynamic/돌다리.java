/*
 입력 : 7
 
 출럭 : 34
 */

package dynamic;

import java.util.Scanner;

public class 돌다리 {
	
	static int[] dy;
	
	public int solution(int n) {
		dy[1] = 1;
		dy[2] = 2;
		for(int i=3; i<=n+1; i++) {
			dy[i] = dy[i-2] + dy[i-1];
		}
		return dy[n+1];
	}
	
	public static void main(String[] args) {
		돌다리 T = new 돌다리();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dy = new int[n+2];// 0인덱스 미사용, 돌다리를 완전히 건너기 위해서는 한칸터 +1
		System.out.println(T.solution(n));
	}
}

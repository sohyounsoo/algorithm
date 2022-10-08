/*
 입력 : 7
 */

package dynamic;

import java.util.Scanner;

public class 계단오르기 {
	
	static int[] dy;
	
	public int solution(int n) {
		dy[1] = 1;
		dy[2] = 2;
		for(int i=3; i<=n; i++) {
			dy[i] = dy[i-2] + dy[i-1];
		}
		return dy[n];
	}
	
	public static void main(String[] args) {
		계단오르기 T = new 계단오르기();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		dy = new int[n+1]; // 0인덱스 미사용하기 때문에
		System.out.println(T.solution(n));
	}
}

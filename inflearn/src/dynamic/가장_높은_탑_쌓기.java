/*
 입력 : 5
25 3 4
4 4 6
9 2 3
16 2 5
1 5 2


출력 : 10
 */

package dynamic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick implements Comparable<Brick> {
	public int s, h, w;

	Brick(int a, int b, int c) {
		this.s = a;
		this.h = b;
		this.w = c;
	}

	@Override
	public int compareTo(Brick o) {
		return o.s - this.s; // 내림차순
	}
	
}

public class 가장_높은_탑_쌓기 {

	static int[] dy;
	
	public int Solution(ArrayList<Brick> arr) {
		int answer = 0;
		Collections.sort(arr); //
		dy[0] = arr.get(0).h; // 제일 넓이가 큰 벽돌의 높이
		answer = dy[0];
		
		for(int i=1; i<arr.size(); i++) {
			int max_h = 0;
			for(int j=i-1; j>=0; j--) {
				if(arr.get(j).w > arr.get(i).w && dy[j] > max_h) {
					max_h = dy[j];
				}
			}
			dy[i] = max_h + arr.get(i).h;
			answer = Math.max(answer, dy[i]);
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		가장_높은_탑_쌓기 T = new 가장_높은_탑_쌓기();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Brick> arr = new ArrayList<>();
		dy = new int[n];
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			arr.add(new Brick(a, b, c));
		}
		System.out.println(T.Solution(arr));

	}

}

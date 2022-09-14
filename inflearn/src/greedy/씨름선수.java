/*
5
172 67
183 65
180 70
170 72
181 60

출력:
3
 */

package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body>{
	public int h, w; // 키, 몸무게
	Body(int h, int w) {
		this.h = h;
		this.w = w;
	}
	
	@Override
	public int compareTo(Body o) {
		return o.h - this.h; // 내림차순(음수)
	}
	
}

public class 씨름선수 {
	
	
	public int solution(ArrayList<Body> arr, int n) {
		int answer = 0;
		
		Collections.sort(arr); // 내림차순
		int max = Integer.MIN_VALUE;
		for(Body ob : arr) {
			if(ob.w > max) {
				answer++;
				max = ob.w;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		씨름선수 T = new 씨름선수();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Body> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int h = sc.nextInt();
			int w = sc.nextInt();
			arr.add(new Body(h, w));
		}
		System.out.println(T.solution(arr, n));

	}

}

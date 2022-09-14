/*
입력 : 5
1 4
2 3
3 5
4 6
5 7

출력: 3
 */

package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
	public int s, e;
	Time(int s, int e) {
		this.s = s;
		this.e = e;
	}
	
	@Override
	public int compareTo(Time o) {
		if(this.e == o.e) return this.s - o.s;
		else return this.e - o.e;
	}
	
}

public class 회의실배정 {
	
	public int solution(ArrayList<Time> arr, int n) {
		int answer = 0;
		
		Collections.sort(arr);
		int max = Integer.MIN_VALUE;
		for(Time t : arr) {
			if(t.s >= max) {
				max = t.e;
				answer++;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		회의실배정 T = new 회의실배정();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Time> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			arr.add(new Time(s, e));
		}
		System.out.println(T.solution(arr, n));

	}

}

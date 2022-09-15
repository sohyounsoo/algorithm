/*
입력 : 5
14 18
12 15
15 20
20 30
5 14

출력: 2
 */

package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Marry implements Comparable<Marry>{
	public int time, state;
	Marry(int time, char state) {
		this.time = time;
		this.state = state;
	}
	
	@Override
	public int compareTo(Marry o) {
		if(this.time == o.time) return this.state - o.state;
		else return this.time - o.time;
	}
	
}

public class 결혼식 {
	
	public int solution(ArrayList<Marry> arr) {
		int answer = Integer.MIN_VALUE;
		Collections.sort(arr);
		int cnt = 0;
		
		for(Marry o : arr) {
			if(o.state == 's') cnt++;
			else cnt--;
			answer = Math.max(answer, cnt);
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		결혼식 T = new 결혼식();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Marry> arr = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			arr.add(new Marry(s, 's'));
			arr.add(new Marry(e, 'e'));
		}
		
		System.out.println(T.solution(arr));

	}

}

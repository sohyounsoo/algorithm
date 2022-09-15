/*
입력 : 6
50 2
20 1
40 2
60 3
30 3
30 1

출력: 150
 */

package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

class Money implements Comparable<Money>{
	public int money, day;
	Money(int money, int day) {
		this.money = money;
		this.day = day;
	}
	
	@Override
	public int compareTo(Money o) {
		return o.day - this.day; // 내림차순
	}
	
}

public class 최대수입스케줄 {
	
	static int n, max = Integer.MIN_VALUE;
	
	public int solution(ArrayList<Money> arr) {
		int answer = 0;
		
		PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder()); // 큰값을 기준으로 정렬
		
		Collections.sort(arr);
		
		int j = 0;
		for(int i=max; i>=1; i--) {
			for(; j<n; j++) {
				if(arr.get(j).day < i) break;
 				pQ.offer(arr.get(j).money);
			}
			if(!pQ.isEmpty()) answer += pQ.poll();
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		최대수입스케줄 T = new 최대수입스케줄();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		ArrayList<Money> arr = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			int money = sc.nextInt();
			int day = sc.nextInt();
			arr.add(new Money(money, day));
			if(day > max) max = day; // 제일 큰 날짜
		}
		
		System.out.println(T.solution(arr));

	}
}

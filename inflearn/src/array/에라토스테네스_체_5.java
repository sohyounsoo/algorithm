package array;

import java.util.Scanner;

public class 에라토스테네스_체_5 {

	public int solution(int n) {
		int answer = 0;
		boolean[] ch = new boolean[n + 1];
		
		for(int i=2; i<=n; i++) {
			if(!ch[i]) { // 2부터 시작
				answer++;
				for(int j= i*i; j<=n; j+=i) {
					ch[j] = true;
				}
			}
		}
		
		return answer;
	}

	public int solution2(int n) {
		int answer = 0;
		boolean isPrime;

		if(n < 2) return answer;

		for(int i=2; i<=n; i++) {
			isPrime = false;
			for(int j=2; j*j<=i; j++) {
				if(i % j == 0) isPrime = true;
			}
			if(!isPrime) answer++;
		}

		return answer;
	}
	
	public static void main(String[] args) {
		에라토스테네스_체_5 T = new 에라토스테네스_체_5();
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(T.solution(n));
		System.out.println(T.solution2(n));
	}

}

package array;

import java.util.ArrayList;
import java.util.Scanner;

/*
	N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
	예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
	
	입력:9
	    32 55 62 20 250 370 200 30 100
	출력:23 2 73 2 3

 */
public class 뒤집은_소수_6 {
	
	public boolean isPrime(int answer) {
		
		if(answer == 1) {
			return false;
		}
		for(int i=2; i<answer; i++) {
			if(answer % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int x : arr) {
			int answer = 0;
			int tmp = 0;
			while(x > 0) {
				tmp = x % 10;
				x = x / 10;
				answer = answer * 10 + tmp;
			}
			if(isPrime(answer)) {
				list.add(answer);
			}
		}
		
		return list;
	}

	public static void main(String[] args) {
		뒤집은_소수_6 T = new 뒤집은_소수_6();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : T.solution(n, arr)) {
			System.out.println(x);
		}
	}
}

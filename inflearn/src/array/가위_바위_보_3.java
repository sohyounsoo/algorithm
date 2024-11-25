/*
	 A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
	가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.
	
	입력 :5
		2 3 3 1 3
		1 1 2 2 3
	출력 :A
		B
		A
		B
		D
 */

package array;

import java.util.Scanner;

public class 가위_바위_보_3 {
	
	public String[] solution(int[] a, int[] b) {
		String[] answer = new String[a.length];
		//String answer = "";
		for(int i=0; i<a.length; i++) {
			if(a[i] == b[i]) answer[i] = "D";
			else if(a[i] == 1 && b[i] == 3) answer[i] = "A";
			else if(a[i] == 2 && b[i] == 1) answer[i] = "A";
			else if(a[i] == 3 && b[i] == 2) answer[i] = "A";
			else answer[i] = "B";
		}
		return answer;
	}

	public String[] solution2(int[] a, int[] b) {
		String[] answer = new String[a.length];

		for (int i = 0; i < a.length; i++) {
			int result = (a[i] - b[i] + 3) % 3;
			if (result == 0) answer[i] = "D"; // 무승부
			else if (result == 1) answer[i] = "A"; // A 승리
			else answer[i] = "B"; // B 승리
		}

		return answer;
	}

	public static void main(String[] args) {
		가위_바위_보_3 T = new 가위_바위_보_3();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i =0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int i=0; i<n; i++) {
			b[i] = sc.nextInt();
		}
		
		for(String s : T.solution(a, b)) {
			System.out.println(s);
		}

	}

}

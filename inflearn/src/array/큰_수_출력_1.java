/*
	N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
	(첫 번째 수는 무조건 출력한다)
	
	입력 :6
		7 3 9 5 6 12
	출력 :7 9 6 12
*/

package array;

import java.util.ArrayList;
import java.util.Scanner;

public class 큰_수_출력_1 {

	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> answer = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			if(i == 0) {
				answer.add(arr[i]);
			}else if(arr[i] > arr[i-1]) {
				answer.add(arr[i]);
			}
		}
	
		return answer;
	}
	
	public static void main(String[] args) {
		큰_수_출력_1 T = new 큰_수_출력_1();
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	
		for(int x : T.solution(n, arr)) {
			System.out.println(x + " ");
		}
	}
}

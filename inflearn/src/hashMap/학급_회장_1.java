/*
학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.

입력 :15
	BACBACCACCBDEDE

출력 :C
*/

package hashMap;

import java.util.HashMap;
import java.util.Scanner;

public class 학급_회장_1 {
	public char solution(int n, String s) {
		char answer = ' ';
		int max = 0;
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char x : s.toCharArray()) {
			map.put(x, map.getOrDefault(x, 0) + 1);
		}
		
		for(char x : map.keySet()) {
			if(map.get(x) > max) {
				max = map.get(x);
				answer = x;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		학급_회장_1 T = new 학급_회장_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.next();
		System.out.println(T.solution(n, str));
	}
}

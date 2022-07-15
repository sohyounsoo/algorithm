package soring_searching;

import java.util.Scanner;

public class Least_Recently_Used {

public int[] solution(int s, int n, int[] arr) {
	    int[] cache = new int[s];
	    
	    for(int x : arr) {
	    	int pos = -1;
	    	for(int i=0; i<s; i++) if(cache[i] == x) pos=i;
	    	if(pos == -1) {
	    		for(int i=s-1; i>=1; i--) {
	    			cache[i] = cache[i-1];
	    		}
	    		cache[0] = x;
	    	}else {
		    	for(int i=pos; i>=1; i--) {
		    		cache[i] = cache[i-1];
		    	}
		    	cache[0] = x;
		    }
	    }
	    
	    
		return cache;
	}

	public static void main(String[] args) {
		Least_Recently_Used T = new Least_Recently_Used();
		Scanner sc = new Scanner(System.in);
		
		int s = sc.nextInt();
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int x : T.solution(s, n, arr)) {
			System.out.print(x + " ");
		}
		
	}

}

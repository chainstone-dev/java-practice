package days06;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int index = 0, n;
		int [] lotto = new int[6];
		lotto[index++] = (int)(Math.random()*45)+1;
		
		while (index<=5) {
			n = (int)(Math.random()*45)+1;

			if (duplicateCheck(n, lotto, index) == false)
				lotto[index++] = n;
		}
		
		System.out.println(Arrays.toString(lotto));
	} // main
	
	public static boolean duplicateCheck(int n, int[] arr, int idx) {
		for(int i=0; i<idx; i++) {
			if (n==arr[i]) {
				return true;
			}
		}
	
		return false;
	}
}

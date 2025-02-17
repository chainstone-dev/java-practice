package days06;

import java.util.Arrays;

public class Ex04_06 {
	public static void main(String[] args) {
		// 세 정수(n, m, o) 
		// 4개 이상??
		// 배열 사용
				
		int[] m = {10, 31, 98, 38, 68, 91, 95, 76, 27, 29};
		m = new int[10];
		
		System.out.println(Arrays.toString(m));
		
		int max;
		int min;
		
		max = min = m[0];
		
		
		
		for (int i = 1; i < 10; i++) {
			max = Math.max(max, m[i]);
			min = Math.min(min, m[i]);
		}
		
		System.out.println(max);
		System.out.println(min);
		
	} // main
}

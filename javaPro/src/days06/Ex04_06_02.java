package days06;

import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

public class Ex04_06_02 {
	public static void main(String[] args) {
		// 세 정수(n, m, o) 
		// 4개 이상??
		// 배열 사용
				
		int[] m = {10, 31, 98, 38, 68, 91, 95, 76, 27, 29};
		OptionalInt max = IntStream.of(m).max();
		
		if (max.isPresent()) {
			System.out.println(max.getAsInt());
		}
		
		new Random().ints(0,101).limit(10).max();
		
	} // main
}

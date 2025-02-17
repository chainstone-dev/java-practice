package days07;

import java.util.Arrays;

public class Ex03 {
	public static void main(String[] args) {
		String data = "홍길동,이창익,서영학,정창기";
		String regex = ",";
		String[] names = data.split(regex);
		
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println(Arrays.toString(names));
		
	} // main
}

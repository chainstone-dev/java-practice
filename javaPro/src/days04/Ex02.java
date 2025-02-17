package days04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		// [문제] 두 문자열 비교
		String n1 = "hello";
		String n2;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n2 = br.readLine();
		
		// 문자열 비교는 == 사용안함
		// equals() 사용
		System.out.println( n1==n2 );
		System.out.println( n1.equals(n2) );
		System.out.println( n1.equals(n2) ? "같다" : "다르다" );
	}
}

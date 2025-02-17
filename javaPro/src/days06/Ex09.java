package days06;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		char one = '\u0000';
		System.out.print("> 한 문자 입력: ");
		Scanner sc = new Scanner(System.in);
		
		one = sc.next().charAt(0);
		
		System.out.printf("%c\n", one);
	} // main
}

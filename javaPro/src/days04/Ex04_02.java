package days04;

import java.util.Scanner;

public class Ex04_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = "1 fish 2 fish red fish blue fish";
	     Scanner s = new Scanner(input).useDelimiter("\\sfish\\s"); // \s = 공백, *반복회수 0~여러번
	     System.out.println(s.nextInt());
	     System.out.println(s.nextInt());
	     System.out.println(s.next());
	     System.out.println(s.next());
	     s.close();
	}
}

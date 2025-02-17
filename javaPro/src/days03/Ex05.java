package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		// 키보드로부터 이름을 입력받아서 출력
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Unhandled exception type IOException
		System.out.print("이름 입력: ");
		String name = br.readLine();
		
		System.out.println(name);
	}
}

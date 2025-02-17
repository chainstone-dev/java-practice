package days07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex03_03 {
	public static void main(String[] args) throws IOException {
		String name;
		byte kor;
		byte eng;
		byte math;
		short total;

		double avg;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 홍길동,90,78,97
		System.out.print("이름,국어,영어,수학 입력: ");
		String data = br.readLine();
		
		String[] newData = data.split(",");
		
		name = newData[0];

		kor = Byte.parseByte(newData[1]);

		eng = Byte.parseByte(newData[2]);

		math = Byte.parseByte(newData[3]);

		total = (short) (kor + eng + math);

		avg = (double) total / 3;

		System.out.printf("이름=\"%s\", 국어=%d, 영어=%d, 수학=%d, 총점=%d, 평균=%5.2f", name, kor, eng, math, total, avg);
	} // main
}

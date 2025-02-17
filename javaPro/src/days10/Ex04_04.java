package days10;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

import days08.Ex07;

public class Ex04_04 {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
	      int [] korArr = new int[3];

	      int index = 0;
	      //   ↓
	      //  [0] [0] [0]
	      // k[0]k[1]k[2]
	      String regex = "^(100|[1-9]?[0-9])$";
	      int score;
	      char con = 'y';
	      do {
	         System.out.printf("%d번 학생 점수 입력 ? ",  index+1);
	         score = Ex07.getRandomInteger(0, 100);
	         
	         if(index == korArr.length) {
	        	 int[] tmp = new int[korArr.length+2];
	        	 for(int i = 0; i<korArr.length; i++) {
	        		 tmp[i] = korArr[i];
	        	 }
	   	        	 korArr = tmp;
	         }
	         
	         
	         korArr[index++] = score;
	         
	         System.out.printf(" > 입력 계속 할래?");
	         con = (char)System.in.read();
	         System.in.skip(System.in.available());
	      } while ( Character.toUpperCase(con) == 'Y');
	      
	      disArr(korArr,index);
	      
	      //최고점/최저점/평균/
	      
	      System.out.printf("최고점 : %d\n", IntStream.of(korArr).max().getAsInt());
	      System.out.printf("최저점 : %d\n", IntStream.of(korArr).limit(index).min().getAsInt());
	      
	      System.out.printf("평균 : %f\n", IntStream.of(korArr).limit(index).average().getAsDouble());
	      
	      
	} // main
	
	private static void disArr(int[] korArr, int index) {
	      System.out.printf("> 입력한 수 : %d\n", index);
	      for (int i = 0; i < index; i++) {
	         System.out.printf("[%d]번 학생의 점수 : %d점\n", i+1, korArr[i]);
	      } // for i
	}
	
	
}

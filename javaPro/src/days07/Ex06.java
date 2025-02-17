package days07;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex06 {
	   public static void main(String[] args) {
		      
		      int [] m = new int[] {10,12,64,66,77,55,69,99,30,17};
		      // 1 <=  <= 100 임의의 정수를 중복되지 않게 배열에 채워넣기
		      // m = new Random().ints(1, 101).distinct().limit(10).toArray();
		      
		      System.out.print("> 배열 : ");
		      System.out.print(Arrays.toString(m));
		      System.out.println();
		      
		      System.out.print("> 근사값을 찾을 값을 입력하세요. : ");
		      Scanner sc = new Scanner(System.in);
		      int input = sc.nextInt();

		      int del = Math.abs(input - m[0]);
		      int near2, near;
		      near2 = near = m[0];
		      
		      boolean duplicate = false;
		      
		      for (int i = 1; i < m.length; i++) {
		         if (del > Math.abs(input - m[i])) {
		            near = m[i];
		            del = Math.abs(input - m[i]);
		            duplicate = false;
		         } else if (del == Math.abs(input - m[i])) {
		            near2 = m[i];
		            duplicate = true;
		         }
		      } // for i
		      
		      System.out.printf(duplicate ? ("> 근사값 : %1$d, %2$d [%3$d]") : ("> 근사값 : %1$d [%3$d]"),near, near2, del);
		      
		   } // main

}

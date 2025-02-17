package days06;

import java.util.Scanner;

public class Ex04_03 {
	public static void main(String[] args) {
	      int n, m ;
	      Scanner scanner = new Scanner(System.in);
	      System.out.print("> 양의 정수( n m ) 입력 ? ");
	      n = scanner.nextInt();
	      m = scanner.nextInt();   
	      
	      int sum = 0;
	      
	      // [3]
	      int min = n > m ? m : n ; // Math.min(n,m);
	      int max = Math.max(n, m);
	      int k = min-1;
	      
	      while(++k<=max) {
	    	  System.out.printf("%d+",k);
	    	  sum += k;
	      }
	      System.out.printf("\b=%d", sum);
	      scanner.close();
	      
	} // main
}

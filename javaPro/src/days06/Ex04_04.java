package days06;

import java.util.Scanner;

public class Ex04_04 {
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
	      int k = (min%2==0) ? min+1 : min;
	      
	      while(k<=max) {
	    	sum += k;
		    System.out.printf("%d+",k);
		    k+=2;
	    	 
	      }
	      System.out.printf("\b=%d", sum);
	      scanner.close();
	      
	} // main
}

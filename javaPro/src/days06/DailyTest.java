package days06;

import java.util.Scanner;

public class DailyTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for (int i=0; i<a.length(); i++) {
        	if ('a'<=a.charAt(i) && 'z'>=a.charAt(i)) {
        		System.out.printf("%c", a.charAt(i)-32);
        	} else {
        		System.out.printf("%c", a.charAt(i)+32);
        	}
        }
    
    }
}

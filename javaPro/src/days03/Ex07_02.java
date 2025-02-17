package days03;

public class Ex07_02 {
	public static void main(String[] args) {
		int i = 10, j = 3;
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println((double)i/j);
		System.out.println(i%j);
		
		// [주의할 점]
//		System.out.println(10/0); // arithmetic exception
//		System.out.println(10%0); // arithmetic exception

		System.out.println(10.0/0); // arithmetic exception infinity
		System.out.println(10.0%0); // arithmetic exception NaN (not a number)
		
	}
}

package days09;

public class Ex02 {
	public static void main(String[] args) {
		int result = recursiveFactorial(5);
		System.out.println(result);
	} // main

	private static int recursiveFactorial(int i) {
		if(i==1 || i==0) return 1;
		return i*recursiveFactorial(i-1);
	}
}

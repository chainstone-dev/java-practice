package days09;

public class Ex02_02 {
	public static void main(String[] args) {
		// double result = power(2,3);
		double result = recursivePower(2,-1);
		System.out.println(result);
	} // main

	private static double recursivePower(int b, int e) {
		return e==0 ? 1 : e>0 ? b*recursivePower(b,e-1) : 1/(b*recursivePower(b,-(e+1)));

	}

	private static double power(int b, int e) {

		double result = 1;
		int e2 = Math.abs(e);
		
		for (int i=0; i<e2; i++) {
			result *= b;
		}

		return e>=0 ? result : 1/result;
	}
}

package days10;

public class Ex01_02 {
	public static void main(String[] args) {
		// 16진수
		int n = 89645;
		final char[] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		String result = "";
		
		while(n>0) {
			int r = n%16;
			result = hex[r] + result;
			n/=16;
		}
		
		System.out.println(result);
	} // main
}

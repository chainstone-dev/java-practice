package days03;

public class Ex06_04 {
	public static void main(String[] args) {
//		int i = 100;
		int i = Integer.MAX_VALUE;
		int j = 200;
		int k = i+j; // 산술 오버플로우 발생
		long correctK = (long)i+j; 
		
		System.out.printf("%d + %d = %d,%d \n",i,j,k,correctK);
	}
}

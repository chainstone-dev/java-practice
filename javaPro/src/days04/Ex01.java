package days04;

public class Ex01 {
	public static void main(String[] args) {
		// 비트 이동 연산자
		System.out.println(15 >> 2); //1111
		System.out.println(15 >>> 2);
		System.out.println(15 << 2);
		
		System.out.printf("%08d\n",Integer.parseInt(Integer.toBinaryString(15)));
		
		System.out.println(Integer.toOctalString(15));
		System.out.println(Integer.toHexString(15));
		
	}
}

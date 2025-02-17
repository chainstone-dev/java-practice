package days03;

public class Ex01_04 {
	public static void main(String[] args) {
		
		//[생각] 소수점 3자리에서 절작
		double money = 123456.7896; 
		System.out.println((int)(money*100)/100.0);
		
		String exampleString = String.format("name%s\nage=%d\n", "홍길동", 20);
		System.out.println(exampleString);
		/*
		 * \t, \b, \n, %%
		 * */
		System.out.printf("name%s\nage=%d\n", "홍길동", 20);
		
	}
}

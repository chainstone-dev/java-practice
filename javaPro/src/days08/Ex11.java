package days08;

public class Ex11 {
	public static void main(String[] args) {
		disp();
	} // main

	private static void disp() {
		System.out.println("disp() 호출됨...");
		disp();
	}
}

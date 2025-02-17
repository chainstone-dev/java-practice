package days08;

public class Ex04_02 {
	public static void main(String[] args) {
		// 자바 오버로딩 동일한 메소드명으로 중복 선언 ((중복함수))
		// 매개변수 타입, 개수 달라야함 (리턴 타입은 조건에 해당되지 않음)
		// System.out.println("----------------------------");
		drawLine(20);
		drawLine(20, "~");
	} // main
	
	public static void drawLine() {
		System.out.println("---------------------------");
	}

	public static void drawLine(int a) {
		System.out.println("=".repeat(a));
	}
	
	public static void drawLine(int a, String style) {
		System.out.println(style.repeat(a));
	}
	
	//com.util.Graphic2D.java
}

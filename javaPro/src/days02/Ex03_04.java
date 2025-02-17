package days02;

public class Ex03_04 {
	public static void main(String[] args) {

		String name = "홍길동";
		int age = 25;
		double height = 180.78;
		
		// (출력 형식)
		// System.out.println("이름은 \""+name+"\"이고, 나이는 "+age+"이고, 키는 "+height+"cm이다.");
		
		// %conversion
		// String s
		// int t
		// double f
		
		System.out.printf("이름은 \"%s\"이고, 나이는 '%d'살이고, 키는 %.2fcm이다.", name ,age, height);
		
	}
}

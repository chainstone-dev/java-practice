package days02;

public class Ex05_03 {
	public static void main(String[] args) {
		
		double avg = 54.25821;
		System.out.printf("%f\n", avg);
		System.out.printf("[%.2f]\n", avg);
		System.out.printf("%e\n", avg);
		
		//   %[argument_index$][flags][width]conversion
		String name = "admin";
		int age = 20;
		
		System.out.printf("[%s]\n", name);
		System.out.printf("[%10s]\n", name);
		System.out.printf("[%-10s]\n", name);
		
		System.out.printf("[%d]\n", age);
		System.out.printf("[%04d]\n", age);
		System.out.printf("[%-10d]\n", age);
		
		System.out.printf("[%04d]\n", age);
		
		int money = 12573000;
		System.out.printf("%,d\n", money);
		System.out.printf("%(d\n",	30);
		System.out.printf("%(d\n", 	-30);
		
		System.out.println("-".repeat(50));
		
		System.out.printf("[%d]\n", 10);
		System.out.printf("[%#o]\n", 10);
		System.out.printf("[%1$#x] [%1$#X]\n", 10);
	}
}

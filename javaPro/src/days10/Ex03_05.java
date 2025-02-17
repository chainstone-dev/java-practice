package days10;

public class Ex03_05 {
	public static void main(String[] args) {
		// 별 찍기 - 5
		// ___*
		// __**
		// _***
		// ****

//		for(int i=4; i>=1; i--) {
//			System.out.println(" ".repeat(i-1)+"*".repeat(5-i));
//		}
		
		
		for(int i=4; i>=1; i--) {
			for(int j=1; j<=i-1; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	} // main
}

package days03;

public class Ex03 {
	public static void main(String[] args) {
		int x = 10, y = 20;
		
		
		System.out.printf("> x=%d, y=%d\n", x, y);
		
		{
			int tmp = x;
			x = y;
			y = tmp;
		}
		
		System.out.printf("> x=%d, y=%d\n", x, y);
	}
}

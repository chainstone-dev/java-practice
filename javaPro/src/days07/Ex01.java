package days07;

public class Ex01 {
	public static void main(String[] args) {
		double sum = 0;
		boolean sw = true;

		for (int i = 1; i <= 8; i++) {
			double tmp = (double) i / (i + 1);
			sum += sw ? -tmp : tmp;
			System.out.printf(sw?"+":"-" + "%d/%d", i, i + 1);
			sw = !sw;
		} // for i
		
		System.out.printf("\b=%f\n", sum);
	} // main
}

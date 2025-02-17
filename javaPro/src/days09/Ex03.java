package days09;

public class Ex03 {
	public static void main(String[] args) {
		String card ="7655-8988-9234-5677";

		int k = (int)(Math.random()*4);
		String[] cardArray = card.split("-");
		
		cardArray[k] = "****";
		
		System.out.println(String.join("-", cardArray));
	} // main
}

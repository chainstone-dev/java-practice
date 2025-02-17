package days07;

public class Ex03_02 {
	public static void main(String[] args) {
		
		String data = "홍길동,  이창익,	서영학, 정창기";
		String regex = "\\s*,\\s*";
		String[] names = data.split(regex);
		
		for(String name : names) {
			// System.out.println(name.trim());
			System.out.println(name.trim());
		}
	} // main
}

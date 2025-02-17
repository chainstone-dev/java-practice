package days09;

public class Ex03_03 {
	public static void main(String[] args) {
		String rrn = "830412-1700001";
		
		// [문제] 주민등록번호 뒷자리 7개 출력
		int len = rrn.length();
		System.out.println(rrn.substring(len-7));
		
//		int begin = 0;
//		int end = 7;
//		
//		String s = rrn.substring(begin, end);
//		int count = rrn.length() - s.length();
//		
//		System.out.println(s+"*".repeat(count));
//		
//		begin = 0;
//		end = 8;
//		
//		s = rrn.substring(begin, end);
//		count = rrn.length() - s.length();
//		
//		System.out.println(s+"*".repeat(count));
		
		// [문제]
		
	} // main
}

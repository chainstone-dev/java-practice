package days09;

public class Ex03_02 {
	public static void main(String[] args) {
		String rrn = "830412-1700001";
		
		String [] rrnArr = rrn.split("-");
		
		System.out.println(rrnArr[0]+"-"+rrnArr[1].charAt(0)+"******");
		// rrnArr[0].concat("-").concat(rrnArr[1].charAt(0)+"").concat("******");
	} // main
}

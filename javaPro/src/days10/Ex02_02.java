package days10;

public class Ex02_02 {
	public static void main(String[] args) {
		int unit = 50000;
		int num = 0;
		int sw = 1;
		
		int money = 1;
		
		while(true) {
			num = money / unit;
			System.out.printf("%d원 : %d개\n", unit, num);
			
			if(unit>1) {
				money = money - unit * num;
			} else {
				break;
			}
			
			if(sw==0) {
				unit = unit/2;
				sw = 1;
			} else {
				unit = unit/5;
				sw = 0;
			}
		}
	} // main
}

package days02;

import java.util.Calendar;

public class Ex03_05 {
	public static void main(String[] args) {
		
		Calendar c = Calendar.getInstance();
		String s = String.format("Duke's Birthday: %1$tm %1$td,%1$tY", c);
		System.out.println(s);
		//   %[argument_index$][flags][width]conversion
		
		String name = "최인석";
		System.out.printf("%1$s!!!\n 안녕하세요. \n%1$s입니다. \n%1$s입니다", name);
	}
}

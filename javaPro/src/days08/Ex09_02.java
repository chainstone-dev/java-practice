package days08;

import com.util.MyCalendar;

public class Ex09_02 {
	public static void main(String[] args) {
		int ans = 0;
		
		for(int i=1; i<=2025; i++) {
			if(MyCalendar.isLeapYear(i)) ans+=1;
		}
		
		System.out.println(ans);
	} // main
}

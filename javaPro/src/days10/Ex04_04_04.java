package days10;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex04_04_04 {
	public static void main(String[] args) {
		int[] m  = {1,2,3};
		int[] temp = new int[m.length+3];
		
//		for(int i = 0; i<m.length; i++) {
//			temp[i] = m[i];
//		}
		
		//System.arraycopy(m, 0, temp, 0, m.length);
		
		// m = Arrays.copyOf(m, m.length + 3);
		
		int[] mClone = m.clone();
		
	} // main
}

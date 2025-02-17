package days04;

public class Ex03 {
	public static void main(String[] args) {
		// 한 학생의 국어 점수를 저장할 변수 선언
		int kor = 0;
		// 배열 : 동일한 자료형을 메모리상에 연속적으로 놓이게 한 것 (참조형)
		// 배열 선언 및 생성형식
		// 자료형[] 변수명;
		// new 자료형[배열크기];
		
		int[] kors; // stack이라는 저장공간에 참조변수로써 주소값이 저장됨
		kors = new int[10];
		int size = kors.length;
		System.out.println(size);
		
		kors[0] = 90;
		kors[1] = 67;
		/**?
		 *
		 */
	}
}

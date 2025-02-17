package days05;

public class DailyTest {
	public static void main(String[] args) {
		System.out.println(solution(5141, 500, new int[]{10, -10, 10, -10, 10, -10, 10, -10, 10, -10}));
		
	} // main
	
    public static int solution(int storage, int usage, int[] change) {
        int total_usage = 0;
        for(int i=0; i<change.length; i++){
            System.out.println(usage);
            usage += usage * change[i] / 100;
            System.out.println(usage);
            total_usage += usage;
            if(total_usage > storage){
                return i;
            }
        }
        return -1;
    }

}

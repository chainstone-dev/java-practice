package days10;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		/*
		5만원 : 2 개
		1만원 : 2 개
		5천원 : 1 개
		1천원 : 0 개
		5백원 : 1 개
		1백원 : 2 개
		5십원 : 1 개
		1십원 : 1 개
		5원 : 0 개
		1원 : 0 개
		*/
		int money = 125760;
		
		int share, rest;
		
		final int[] moneyList = {50000,10000,5000,1000,500,100,50,10,5,1};
		String [] s_unit = { "5만원","1만원","5천원", "1천원", "5백원", "1백원","5십원","1십원","5원","1원" };
		
		Scanner scanner = new Scanner(System.in);
		share = money;
		
		for(int i = 0; i<moneyList.length; i++) {
			share = money / moneyList[i];
			System.out.printf("%s : %d개\n", s_unit[i], share);
			money = money % moneyList[i];
		}
		
		
	} // main
}

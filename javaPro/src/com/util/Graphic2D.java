package com.util;

public class Graphic2D {
	public static void drawLine() {
		System.out.println("=-----------------------=");
	}

	public static void drawLine(int a) {
		System.out.println("=".repeat(a));
	}
	
	public static void drawLine(int a, String style) {
		System.out.println(style.repeat(a));
	}
}

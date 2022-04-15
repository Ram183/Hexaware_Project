package com.java;

public class Array_Class {

	static int[] a = { 100, 200, 300, 400, 500 };
	static String[] b = { "Sandhiya", "Ram", "Priya", "Swarnam", "Santhi" };

//	public static void m1() {
//		System.out.println(a);
//		System.out.println(b);
//
//	}

	public static void main(String[] args) {

		for (int i = 0; i < a.length; i++) {

			System.out.println("Value : " + a[i] + "\n");
		}

//		for (int j = 0; j < b.length; j++) {
//
//			System.out.println(" String Value : " + b[j] + "\n");
//
//		}
		
		for (String s : b) {
			System.out.println("My Fav Name : " + s);
		}

	}

}

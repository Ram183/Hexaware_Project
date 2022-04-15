package com.java;

public class Array1_Method_Arguments {

	/*
	 * static void m1(int[] a) {
	 * 
	 * // for (int i = 0; i < a.length; i++) { // System.out.println(a[i]); // }
	 * 
	 * for (int i : a) { System.out.println("New Values for Foreach Loop : " + i); }
	 * 
	 * }
	 * 
	 * public static void main(String[] args) { m1(new int[] { 1, 2, 3, 4, 5, 6, 7,
	 * 8, 9, 10 }); }
	 */
	public static void m1() {

		int[] a = new int[5];

		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;

		for (int i : a) {
			System.out.println("Value of Array is : " + i);
		}

	}
	
	public static void main(String[] args) {
		m1();
		
	}

}

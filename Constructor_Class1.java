package com.java;

public class Constructor_Class1 {

//	static int a = 10;
//	static String b = "Ram";
//	static Double c = 4655685861984.4656546d;
//	static Boolean d = true;
//	static char e = 's';

	public static int a;
	public static String b;
	public static double c;
	public static boolean d;
	public static char e;

	public Constructor_Class1(int a) {
		System.out.println("Int Constructor : " + a);

	}

	public Constructor_Class1(String y) {
		y = b;
		System.out.println("String Constructor : " + y);
	}

	public Constructor_Class1(double z) {
		z = c;
		System.out.println("Double Constructor : " + z);

	}

	public Constructor_Class1(boolean v) {
		v = d;
		System.out.println("Boolean Constructor : " + v);
	}

	public Constructor_Class1(char w) {
		w = e;
		System.out.println("Char Constructor  : " + w);
	}

	public static void main(String[] args) {

		Constructor_Class1 a1 = new Constructor_Class1(a);
		Constructor_Class1 b1 = new Constructor_Class1("Ram");
		Constructor_Class1 c1 = new Constructor_Class1(56546549848428.4644d);
		Constructor_Class1 d1 = new Constructor_Class1(false);
		Constructor_Class1 e1 = new Constructor_Class1('S');
			
	}

}

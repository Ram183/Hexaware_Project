package com.java;

public class Normal_Class extends Abstract_Class {

	@Override
	public void m3() {

		System.out.println("Hey Sihamikha");
	}

	@Override
	void m4() {

		System.out.println("I hate my life");
	}

	public static void main(String[] args) {

		Normal_Class n = new Normal_Class();
		n.m1();
		n.m2();
		n.m3();
		n.m4();

	}

}

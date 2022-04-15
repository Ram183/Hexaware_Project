package com.java;

public class Constructor_Class {

	Constructor_Class() {
		String[] name = new String [5];
		name[0]="Ram";
		name[1]="Swarnam";
		name[2]="sam";
		name[3]="Angurajan";
		name[4]="Ramesh";
		
		for (int i = 0; i < name.length; i++) {
			
			System.out.println(name[i]);
		}

	}

	public static void main(String[] args) {
		
		Constructor_Class a = new Constructor_Class();
	}
}

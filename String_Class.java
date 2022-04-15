package com.java;

public class String_Class {
	
	public static void main(String[] args) {
		String n="Ramkumar Angurajan";
		String p="ramkumar Sandhiya";
		String q="ramkumar Angurajan";
		String r ="Ramkumar Sandhiya";
		String s="Hai welcome to TutorialsTpoint";
		
		// To find the length of the String
		int length = n.length();
		System.out.println(length);
		
		//To convert the String into Uppercase(Capital Letter)
		String upperCase = n.toUpperCase();
		System.out.println(upperCase);
		
		//To convert the String into Lowercase(Small Letter)
		String lowerCase = n.toLowerCase();
		System.out.println(lowerCase);
		
		//To fetch a letter
		char ch = n.charAt(9);
		System.out.println(ch);
	
		//To Check whether my String starts with Same sequence or not
		boolean startsWith = n.startsWith("ram");
		System.out.println(startsWith);
		
		//To Check whether my String ends with Same sequence or not
		boolean endsWith = n.endsWith("en");
		System.out.println(endsWith);
		
		//To Check whether my String is having that Same sequence or not
		boolean cont = n.contains("Ang");
		System.out.println(cont);
		
		//To find the Index position 
		int indexOf = n.indexOf('m');
		System.out.println(indexOf);
		
		//To find the Index position 
		int lastIndexOf = n.lastIndexOf('a');
		System.out.println(lastIndexOf);
		
		//To change the letter in the String
		String replace = n.replace('a', '@');
		System.out.println(replace);
		
		//To Change the Sequence in String
		String replaceAll = n.replaceAll("Angurajan", "Sandhiya");
		System.out.println(replaceAll);
		
		//To Check Whether my String is Empty or not
		boolean empty = n.isEmpty();
		System.out.println(empty);
		
		
		
		
		//-----------------------------------------------------------------
		//******Object Comparation of Two Strings*******
		
		//To check the Equality of two String 
		boolean equals = n.equals(q);
		System.out.println(equals);
		
		//To check the Equality of two String
		boolean equals2 = p.equals(r);
		System.out.println(equals2);
		
		//To check the Equality of two String without cases
		boolean equalsIgnoreCase = n.equalsIgnoreCase(q);
		System.out.println(equalsIgnoreCase);
		
		//To check the Equality of two String without cases
		boolean equalsIgnoreCase2 = p.equalsIgnoreCase(r);
		System.out.println(equalsIgnoreCase2);
		
		//Join two String
		String concat = n.concat(r);
		System.out.println(concat);
		
		//To Find the remaining Values in String by using Index or last Index
		String substring = s.substring(6);
		System.out.println(substring);
		
		//To Find the remaining Values in String by using Index or last Index
		String substring2 = s.substring(5, 25);
		System.out.println(substring2);
		
		
		//**************Literal and Non Literal String**********************//
		
		String a="Duplicate";
		String b="Duplicate";
		String c=new String("Duplicate");
		String d=new String("Duplicate");
		
		System.out.println("\n");
		System.out.println("**************Literal and Non Literal String****************");
		
		int identityHashCode = System.identityHashCode(a);
		System.out.println(identityHashCode + " Literal String");
		
		int identityHashCode2 = System.identityHashCode(b);
		System.out.println(identityHashCode2 + " Literal String");
		
		int identityHashCode3 = System.identityHashCode(c);
		System.out.println(identityHashCode3 + " Non Literal String");
		
		int identityHashCode4 = System.identityHashCode(d);
		System.out.println(identityHashCode4 + " Non Literal String");
		
		
		
		//******************Mutable & Immutable String***************************
		
		
		String e = "Greens";
		String f = "Technology";
		String g = "greens";
		StringBuffer h = new StringBuffer("Greens");
		StringBuffer i = new StringBuffer("Technology");
		
		System.out.println("\n");
		System.out.println("*********Mutable & Immutable String*************");
		System.out.println(System.identityHashCode(e) + "\t" +"Immutable String");
		System.out.println(System.identityHashCode(f) + "\t" +"Immutable String");
		System.out.println(System.identityHashCode(g) + "\t" +"Immutable String");
		
		String concat2 = e.concat(f);
		System.out.println(concat2);
		System.out.println(System.identityHashCode(concat2) + "\t" + "Immutable String");
		
		
		System.out.println(System.identityHashCode(h) + "\t" + "Mutable String");
		System.out.println(System.identityHashCode(i) + "\t" + "Mutable String");
		
		StringBuffer append = h.append(i);
		System.out.println(System.identityHashCode(append));
		
		
		
		
		
		
		
	}

}

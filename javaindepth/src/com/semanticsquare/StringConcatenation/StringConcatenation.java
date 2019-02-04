package com.semanticsquare.StringConcatenation;


class StringConcatenation {
	public static void main(String args[]) {
		String s = "hello" + " world!";
		System.out.println("s:"  + s);
		System.out.println("");
		
		StringBuffer sb = new StringBuffer(s);
		sb.append("Good").append(" Morning");
		System.out.println("sb:"  + sb);
		System.out.println("sb.length(): "  + sb.length());
		sb.delete(1, 5);
		System.out.println("sb.length(): "  + sb.length());
		sb.insert(1, "ey");
		System.out.println("sb:"  + sb);
		System.out.println("sb.length(): "  + sb.length());	
		System.out.println("");
		
		StringBuilder sb2 = new StringBuilder(sb.toString());
		sb2.replace(3, 4, "-");
		sb2.replace(14, 15, "-");
		System.out.println("sb2:"  + sb2);
		System.out.println("sb2.length(): "  + sb2.length());
		sb2.delete(1, 3);
		System.out.println("sb2.length(): "  + sb2.length());
		sb2.insert(1, "ello");
		System.out.println("sb2:"  + sb2);
		System.out.println("sb2.length(): "  + sb2.length());	
	}
}
